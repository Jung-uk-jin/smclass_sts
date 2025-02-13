//package com.java.controller;
//
//import java.lang.ProcessBuilder.Redirect;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import jakarta.servlet.http.HttpSession;
//
//@Controller
//@RequestMapping("/member") //member 생략 가능
//public class MController {
//	@Autowired HttpSession session;
//
//	@GetMapping("/login")
//	public String login(String chk) {
//		return "member/login";
//	}
//	
//	@PostMapping("/login")
//	public String login(String id, String pw, Model model) {
//		//db 접근해서 id,pw가 있는지 확인
//		
//		if(id.equals("aaa") &&  pw.equals("1111")) {
//			session.setAttribute("session_id", id); // 세션 저장 
//			return "redirect:/?chk=1";			
//		}else {
//			return "redirect:/member/login?chk=0";
//		}
//	}
//	@GetMapping("/logout")
//	public String logout() {
//		session.invalidate(); // 세션 모두 삭제
//		return "redirect:/?outChk=1";
//	}
//	
//}
