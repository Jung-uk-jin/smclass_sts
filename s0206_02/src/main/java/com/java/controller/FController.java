package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.dto.MemberDto;
import com.java.dto.StuDto;

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
	public String login() {
		return "login";
	}
	@GetMapping("/board")
	public String board(int bno, String btitle, Model model) {
		System.out.println(bno + " " + btitle);
		model.addAttribute("bno",bno);
		model.addAttribute("btitle",btitle);
		return "board";
	}
	@GetMapping("/logininfo")
	public String logininfo() {
		return "logininfo";
	}
	@GetMapping("/stuinput")
	public String stuinput() {
		return "stuinput";
	}
	@PostMapping("/stuinput")
	public String stuinput(int stuno, String name, int kor, int eng, int mat, Model model) {
		int total=kor+eng+mat;
		double avg = total/3.0;
		StuDto s = StuDto.builder().stuno(stuno).name(name).kor(kor).eng(eng).mat(mat).total(total).avg(avg).build(); //객체 선언
		model.addAttribute("stu",s); // 보낼 이름 
		
		
		return "doStuinput";
	}
	@PostMapping("/login")
	public String login(HttpServletRequest request,
			@RequestParam("id") String id, // id데이터 입력받음
			@RequestParam(required = false) String pw, // null허용
			@RequestParam int kor,
			@RequestParam(defaultValue = "0") int eng,int mat, // 값이 없으면 0으로 세팅
			Model model) {
		
			int sum = kor+eng+mat;
			double avg = sum/3.0;
//		String aid = request.getParameter("id");
//		String apw = request.getParameter("pw");
//		String akor = request.getParameter("kor");
//		String aeng = request.getParameter("eng");
//		String amat = request.getParameter("mat");
//		int nkor = Integer.parseInt(akor);
//		int neng = Integer.parseInt(aeng);
//		int nmat = Integer.parseInt(amat);
//		int sum = nkor+neng+nmat;
//		double avg = sum/3.0;
		model.addAttribute("id",id);
		model.addAttribute("pw",pw);
		model.addAttribute("kor",kor);
		model.addAttribute("eng",eng);
		model.addAttribute("mat",mat);
		model.addAttribute("sum",sum);
		model.addAttribute("avg",avg);
	//	model.addAttribute("member",new MemberDto(id, pw));
//	model.addAttribute("member",MemberDto.builder().id(id).pw(pw).kor(kor).eng(eng).mat(mat).build());
		
		return "dologin";
	}
	@GetMapping("/logout")
	public String logout() {
		return "logout";
	}
}
