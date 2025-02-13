package www.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;
import www.java.Dto.MemberDto;

@Controller
public class FController {
	@Autowired
	HttpSession session;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/member")
	public String member() {
		return "member";
	}
	@GetMapping("/stuinput")
	public String stuinput() {
		return "stuinput";
	}
	@PostMapping("/meminfo")
	public String meminfo(MemberDto mdto, Model model) {
		System.out.println(mdto.getId());
		System.out.println(mdto.getHobby());
		model.addAttribute("member",mdto);
		return "meminfo";
	}
//	@PostMapping("/member")
//	public String member(String id, String pw, String name, String tel, String gender, String[] hobby, Model model) {
//		
//		String hobbys="";
//		model.addAttribute("member",m);
//		
//		return "meminfo";
//	}
	
}
