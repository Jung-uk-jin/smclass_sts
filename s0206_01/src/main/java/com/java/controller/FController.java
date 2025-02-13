package com.java.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.dto.LoginDto;
import com.java.dto.MemberDto;




@Controller
public class FController {
	@Autowired 
	HttpSession session;
	
	@GetMapping("/")
	public String index() {
		System.out.println("index페이지 열림");
		return "index";
	}
	@GetMapping("/meminfo")
	public String meminfo() {
		return "meminfo";
	}
	@GetMapping("/member")
	public String member() {
		System.out.println("member페이지 열림");
		return "member";
	}
	@PostMapping("/member")
	public ModelAndView member(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String gender = request.getParameter("gender");
		String[] hobbys = request.getParameterValues("hobby");
		String hobby="";
		for(int i=0 ; i<hobbys.length ; i++) {
			if(i==0) hobby+=hobbys[i];
			else hobby +=","+hobbys[i];
		}
		//model.addAttribute("id",id);
		//model.addAttribute("pw",pw);
		//model.addAttribute("member",new MemberDto(id,pw,name,tel,gender,hobby));
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("meminfo");
		mv.addObject("member",new MemberDto(id,pw,name,tel,gender,hobby));
		return mv;
	}
	
	@GetMapping("/login")
	public String login() {
		System.out.println("login get방식");
		return "login";
	}
	@GetMapping("/logininfo")
	public String logininfo() {
		return "logininfo";
	}
	
	@PostMapping("/login")
	public String login(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		
		return "logininfo";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		session.invalidate();
		return "logout";
	}
	
}
