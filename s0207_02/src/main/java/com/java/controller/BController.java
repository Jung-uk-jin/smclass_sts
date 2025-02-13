//package com.java.controller;
//
//import java.util.ArrayList;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import com.java.dto.BoardDto;
//import com.java.service.boardss;
//import com.java.service.BServiceImpl;
//@Controller
//public class BController {
//	
//	//BService bService = new BServiceImpl();
//	@Autowired boardss bService; //객체 선언(자동)
//	
//	@GetMapping("board")
//	public String blist(Model model) {
//		//게시글 여러개 가져오기 - Arraylist
//		//게시글 1개 - BoardDto
//		ArrayList<BoardDto> list = bService.blist();
//		
//		model.addAttribute("list",list);
//		return "/board/blist";
//	}
//}
