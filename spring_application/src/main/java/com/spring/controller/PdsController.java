package com.spring.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.spring.command.PageMaker;
import com.spring.command.PdsModifyCommand;
import com.spring.command.PdsRegistCommand;
import com.spring.dto.AttachVO;
import com.spring.dto.PdsVO;
import com.spring.service.PdsService;

@Controller
@RequestMapping("/pds")
public class PdsController {

	@Autowired
	private PdsService pdsService;

	@GetMapping("/list")
	public String list(@ModelAttribute PageMaker pageMaker, Model model) throws Exception {
		String url="/pds/list";
		
		List<PdsVO> pdsList = pdsService.searchList(pageMaker);
		
		model.addAttribute("pdsList",pdsList);
		
		return url;
	}

	@GetMapping("/registForm")
	public String registForm() throws Exception {
		String url="/pds/regist";
		return url;
	}

	@Resource(name="pdsSavedFilePath")
	private String fileUploadPath;
	
	@PostMapping(value = "/regist", produces = "text/plain;charset=utf-8")
	public String regist(PdsRegistCommand regCommand) throws Exception {
		String url="/pds/regist_success";
		
		List<MultipartFile> multiFiles = regCommand.getUploadFile();
		String savePath = this.fileUploadPath;	
		
		List<AttachVO> attachList = saveFileToAttaches(multiFiles,savePath);
		
		//DB 
		PdsVO pds = regCommand.toPdsVO();
		pds.setAttachList(attachList);
		
		pdsService.regist(pds);
		
		return url;
	}

	@GetMapping("/detail")
	public String detail(int pno, String from,Model model) throws Exception {
		String url="/pds/detail";
		
		PdsVO pds = null;
		if (from != null && from.equals("list")) {
			pdsService.increaseViewCnt(pno);
			url = "redirect:/pds/detail?pno="+pno;
		} else {
			pds = pdsService.getPds(pno);
		}
		
		model.addAttribute("pds",pds);
		
		return url;
	}
	
	@GetMapping("/modifyForm")
	public String modifyForm(int pno,Model model)throws Exception{
		String url = "/pds/modify";
		
		PdsVO pds = pdsService.getPds(pno);
		
		model.addAttribute("pds",pds);
		
		return url;
	}
	
	@PostMapping("/modify")
	public String modify(PdsModifyCommand modifyCommand)throws Exception{
		return null;
	}
	
	@GetMapping("/remove")
	public String remove(int pno)throws Exception{
		return null;
	}
	
	@GetMapping("/getFile")
	public String getFile(int ano, Model model)throws Exception{
		String url="download";
		
		AttachVO attach = pdsService.getAttachByAno(ano);
		

		model.addAttribute("savedPath", attach.getUploadPath());
		model.addAttribute("fileName", attach.getFileName());		
		
		return url;
	}
	
	
	private List<AttachVO> saveFileToAttaches(List<MultipartFile> multiFiles,
			  String savePath )throws Exception{
		
		if (multiFiles == null) return null;
		
		//저장 -> attachVO -> list.add
		List<AttachVO> attachList = new ArrayList<AttachVO>();
		for (MultipartFile multi : multiFiles) {
			String uuid = UUID.randomUUID().toString().replace("-", "");
			String fileName = uuid+"$$"+multi.getOriginalFilename();
			
			//파일저장
			File target = new File(savePath, fileName);
			target.mkdirs();
			multi.transferTo(target);
			
			//attachVO
			AttachVO attach = new AttachVO();
			attach.setUploadPath(savePath);
			attach.setFileName(fileName);
			attach.setFileType(fileName.substring(fileName.lastIndexOf('.') + 1)
					.toUpperCase());
			
			attachList.add(attach);
		}
		return attachList;
	}
}




