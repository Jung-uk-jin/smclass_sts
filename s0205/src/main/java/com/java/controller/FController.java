package com.java.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class FController {
	
	@Autowired
	HttpSession session;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/login")
	public String login(HttpServletRequest request) {
		System.out.println("get방식 접속");
		return "login";
	}
	@PostMapping("/login")
	public String doLogin() {
		//HttpSession session = request.getSession();
		session.setAttribute("session_id", "aaa"); // 세션 적용
		System.out.println("post방식 접속");
		return "index";
	}
	@GetMapping("/logout")
	public String logout() {
		session.invalidate(); // 세션 삭제
		return "logout";
	}
}
