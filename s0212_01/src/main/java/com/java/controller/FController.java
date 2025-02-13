package com.java.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.java.dto.BoardDto;
import com.java.service.BoardService;

@Controller
public class FController {
	
	@Autowired BoardService boardService;
	
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@ResponseBody
	@GetMapping("/rpage")
	public String rpage() {
		return "rpage";
	}
	@GetMapping("/board/blist")
	public String blist(Model model) {
		ArrayList<BoardDto> list = boardService.blist();
		model.addAttribute("list",list);
		return "blist";
	}
	@GetMapping("/board/bwrite")
	public String bwrite() {
		return "bwrite";
	}
	//@RequestPart MultipartFile files >> 파일 가져오기
//	@PostMapping("/board/bwrite") //파일 2개이상 업로드
//	public String bwrite(BoardDto bdto, 
//			List<MultipartFile> files) throws Exception {
//		String real_fname="";
//		if(!files.isEmpty()) { // 파일첨부가 되어있으면
//			for(MultipartFile file : files) {
//				String origin_fname = file.getOriginalFilename();
//				System.out.println("최초 파일 이름 : "+origin_fname);
//				long time = System.currentTimeMillis();
//	
//			real_fname = String.format("%d_%s", time,origin_fname);
//			System.out.println("변경 파일 이름 : "+real_fname);
//			//파일 저장 위치
//			String url = "C:/upload/board/";
//			//파일 저장
//			File f = new File(url+real_fname);
//			//파일 업로드
//			file.transferTo(f); 
//			}
//			bdto.setBfile(real_fname);
//		}
//		else {
//			bdto.setBfile("");
//		}
		@PostMapping("/board/bwrite") // 파일 1개 업로드
		public String bwrite(BoardDto bdto, 
				@RequestPart MultipartFile files) throws Exception {
			if(!files.isEmpty()) { // 파일첨부가 되어있으면
				//최초 파일 이름은 중복 방지를 위해 이름 변경
				String origin_fname = files.getOriginalFilename();
				System.out.println("최초 파일 이름 : "+origin_fname);
				long time = System.currentTimeMillis();
				//랜덤문자 생성 객체 UUID
				//UUID uuid = UUID.randomUUID();
				//String uname = uuid+"_"+origin_fname;
				String real_fname = String.format("%d_%s", time,origin_fname);
				System.out.println("변경 파일 이름 : "+real_fname);
				//파일 저장 위치
				String url = "C:/upload/board/";
				//파일 저장
				File f = new File(url+real_fname);
				//파일 업로드
				files.transferTo(f); 
				
			}
			else {
				bdto.setBfile("");
			}
		//게시글저장
		boardService.bwrite(bdto);
		System.out.println("파일 업로드 완료");
		return "redirect:/board/blist";
	}
}
