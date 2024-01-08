package com.spring.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.spring.service.SearchMemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private SearchMemberService memberService;
	
	@GetMapping("/list")
	public void list(@ModelAttribute PageMaker pageMaker, Model model)throws Exception{
		List<MemberVO> memberList = memberService.searchList(pageMaker);
		
		model.addAttribute("memberList", memberList);
	}
	
	@GetMapping("/registForm")
	public String registForm() {
		String url="/member/regist";
		return url;
	}
	
	@GetMapping("idCheck")
	@ResponseBody
	public String idCheck(String id)throws Exception{
		String message = "duplicated";
		
		MemberVO member = memberService.detail(id);
		
		if(member==null) {
			message="";
		}
		
		return message;
	}
	
	@PostMapping(value="/regist", produces = "text/plain;charset=utf-8")
	public String regist(MemberRegistCommand regCommand)throws Exception{
		String url="/member/regist_success";
	
		MultipartFile multi = regCommand.getPicture();
		
		System.out.println(multi.getOriginalFilename());
		File picture = new File("c:\\member\\picture",multi.getOriginalFilename());
		picture.mkdirs();
		
		multi.transferTo(picture);
		
		
		return url;
	}
	
	
}







