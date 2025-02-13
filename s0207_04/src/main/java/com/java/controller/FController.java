package com.java.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.java.Dao.BoardMapper;
import com.java.Dto.BoardDto;
import com.java.service.boardss;



@Controller
public class FController {
	
	@Autowired boardss bService;
	

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/blist")
	public String blist(Model model) {
		ArrayList<BoardDto> list = bService.blist(); 
		model.addAttribute("list",list);
		return "blist";
	}
}
