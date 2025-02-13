package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.dto.MemberDto;
import com.java.dto.StuDto;
import com.java.service.BService;
import com.java.service.BServiceImpl;
import com.java.service.BServiceImpl2;
import com.java.service.BServiceImpl3;
import com.java.service.BServiceImpl4;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class FController {
	@Autowired
	HttpSession session;
	
	@Autowired BService b;
	
	@GetMapping("/data4")
	public String data4() {
		//객체 선언
		String str =  b.slist();
		System.out.println(str);
		return "data4";
	}
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/stuinput") 
	public String stuinput() {
		return "stuinput";
	}
	@GetMapping("/data") 
	public String data(int dno, Model model) {
		model.addAttribute("dno",dno);
		return "data";
	}
	@GetMapping("/data2/{bno}") 
	public String data2(@PathVariable int bno, Model model) {
		model.addAttribute("bno",bno);
		return "data2";
	}
	@GetMapping("/data3/{bno}") 
	public String data3(@PathVariable List<Integer> bno, Model model) {
		model.addAttribute("bno",bno);
		return "data3";
	}
	@PostMapping("/dostuinput")
	public String stuinput(StuDto sto, Model model) {
		int total= sto.getEng() + sto.getKor() + sto.getMat();
		double avg = total/3.0;
		sto.setTotal(total);
		sto.setAvg(avg);
		model.addAttribute("stu",sto);
		return "doStuinput";
	}
	
}
