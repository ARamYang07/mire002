package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
}







