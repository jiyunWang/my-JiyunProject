package firstjiyun.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import firstjiyun.model.Qna;

@Controller
public class QnaController {
	
	private ArrayList<Qna> qnas = new ArrayList<>();
	
	@GetMapping("/index")
	public String list(Model model){
		model.addAttribute("qnas", qnas);
		return "/index";
	}
	
	@PostMapping("/user/qnacreate")
	public String create(Qna qna){
		System.out.println("Qna = " + qna);
		qnas.add(qna);
		return "redirect:/index";
	}
}
