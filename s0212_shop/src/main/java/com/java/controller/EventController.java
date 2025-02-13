package com.java.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.dto.CboardDto;
import com.java.dto.EventDto;
import com.java.service.EventService;

import jakarta.servlet.http.HttpSession;


@Controller
public class EventController {
	@Autowired EventService eventService;
	
	@Autowired HttpSession httpSession;
	
	@GetMapping("/event/eview")
	public String eview(int eno,Model model) {
		//상세 보기
		EventDto eventDto=  eventService.eview(eno);
		//하단 댓글 - eno 이벤트 번호 가져가야함
		ArrayList<CboardDto> clist = eventService.clist(eno);
		model.addAttribute("edto", eventDto);
		model.addAttribute("clist", clist);
		return "/event/eview";
	}
	
	@GetMapping("/event/event")
	public String evnet(Model model) {
		//전체 리스트 가져오기
		ArrayList<EventDto> list=  eventService.event();
		model.addAttribute("list", list);
		
		return "/event/event";
	}
}
