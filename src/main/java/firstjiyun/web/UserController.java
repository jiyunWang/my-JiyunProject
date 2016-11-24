package firstjiyun.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller; // ctrl+shift+o : 어노테이션을 위해 임포트
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import firstjiyun.model.User;

@Controller
public class UserController {
	
	private ArrayList<User> users = new ArrayList<>();
	
	@GetMapping("/users")
	public String list(Model model){
		model.addAttribute("users", users); //key-value 1대 1 매칭
		return "/users/list"; //뒤에  default 로는  html 로 붙여줌. 경로 지정
	}
	
	
	@PostMapping("/user/create") //POST로 받을 때 매핑 --> url(http://localhost:9000/user/create) 로 보냈던 것을 매칭시켜주는 것.
	public String create(User user) { //HTTP 서버로 보낸 이름(name)들과 매칭
		//user.setUserId(userId);
		System.out.println("userId = " + user);
		users.add(user);
		return "redirect:/users"; //리턴값으로 어떠한 화면으로 갈지 정해줘야함. redirect
	}
}
