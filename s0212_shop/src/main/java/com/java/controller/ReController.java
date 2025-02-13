package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.dto.CboardDto;
import com.java.service.EventService;

import jakarta.servlet.http.HttpSession;

@RestController // 데이터가 넘어가는 컨트롤러
public class ReController {
	
	@Autowired HttpSession httpSession;
	@Autowired EventService eventService;
	
	@PostMapping("/event/cwrite")
	public CboardDto cwrite(CboardDto cdto) {
		System.out.println("eno : "+cdto.getEno());
		System.out.println("cpw : "+cdto.getCpw());
		System.out.println("ccontent : "+cdto.getCcontent());
		cdto.setId("aaa");
		//String id = (String)httpSession.getAttribute("sesseion_id");
		 //하단댓글 저장
		CboardDto cboardDto = eventService.cwrite(cdto);
		
		return cboardDto; // 데이터를 전달/ 페이지를 오픈하는것이 아님
		}
}
