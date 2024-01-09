package com.spring.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.spring.command.MemberRegistCommand;
import com.spring.command.PageMaker;
import com.spring.dto.MemberVO;
import com.spring.exception.NotExistPictureFileException;
import com.spring.service.SearchMemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private SearchMemberService memberService;

	@GetMapping("/list")
	public void list(@ModelAttribute PageMaker pageMaker, Model model) throws Exception {
		List<MemberVO> memberList = memberService.searchList(pageMaker);

		model.addAttribute("memberList", memberList);
	}

	@GetMapping("/registForm")
	public String registForm() {
		String url = "/member/regist";
		return url;
	}

	@GetMapping("idCheck")
	@ResponseBody
	public String idCheck(String id) throws Exception {
		String message = "duplicated";

		MemberVO member = memberService.detail(id);

		if (member == null) {
			message = "";
		}

		return message;
	}

	@PostMapping(value = "/regist", produces = "text/plain;charset=utf-8")
	public String regist(MemberRegistCommand regCommand) {
		String url = "/member/regist_success";

		MultipartFile multi = regCommand.getPicture();
		
		try {
			savePicture(null, multi);
		} catch (NotExistPictureFileException e) {
			url="/error/400.jsp";
			e.printStackTrace();
		} catch (Exception e) {
			url="/error/500.jsp";
			e.printStackTrace();
		}
		return url;
	}

	@Resource(name = "picturePath")
	private String picturePath;

	public String savePicture(String oldPicture, MultipartFile multi) throws NotExistPictureFileException, IllegalStateException, IOException {

		final Logger logger = LoggerFactory.getLogger(MemberController.class);
		logger.debug("MemberController : regist - saving picture file");

		 if (multi == null || multi.isEmpty() || multi.getSize() > 1024 * 1024 * 1) 
			 throw new NotExistPictureFileException();
		 
		// 저장 파일명
		String fileName = null;

		// 파일저장폴더설정
		String uploadPath = this.picturePath;

		// 파일유무확인, 저장 파일명 결정

		String uuid = UUID.randomUUID().toString().replace("-", "");
		fileName = uuid + "$$" + multi.getOriginalFilename();
		File storeFile = new File(uploadPath, fileName);

		// 파일경로 생성
		storeFile.mkdirs();

		// local HDD 에 저장.
		multi.transferTo(storeFile);

		// 기존파일 삭제
		if (oldPicture != null && !oldPicture.isEmpty()) {
			File oldFile = new File(uploadPath, oldPicture);
			if (oldFile.exists()) {
				oldFile.delete();
			}
		}

		return fileName;
	}
}
