package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.command.PageMaker;
import com.spring.command.PdsModifyCommand;
import com.spring.command.PdsRegistCommand;
import com.spring.service.PdsService;

@Controller
@RequestMapping("/pds")
public class PdsController {

	@Autowired
	private PdsService pdsService;

	@GetMapping("/list")
	public String list(PageMaker pageMaker, Model model) throws Exception {
		return null;
	}

	@GetMapping("/registForm")
	public String registForm() throws Exception {
		return null;
	}

	@PostMapping(value = "/regist", produces = "text/plain;charset=utf-8")
	public String regist(PdsRegistCommand regCommand) throws Exception {
		return null;
	}

	@GetMapping("/detail")
	public String detail(int pno, Model model) throws Exception {
		return null;
	}
	
	@GetMapping("/modifyForm")
	public String modifyForm(int pnio,Model model)throws Exception{
		return null;
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
	public String getFile(int ano)throws Exception{
		return null;
	}
	
}




