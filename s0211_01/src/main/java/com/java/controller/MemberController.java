package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.java.dto.MemberDto;
import com.java.service.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {
		@Autowired MemberService memberService;
		@Autowired HttpSession httpSession;
		
		@GetMapping("/member/login")
		public String login() {
			return "login";
		}
		@PostMapping("/member/login")
		public String login(MemberDto mdto, Model model) {
			MemberDto memberdto = memberService.login(mdto);
			
			return "login";
		}
}
