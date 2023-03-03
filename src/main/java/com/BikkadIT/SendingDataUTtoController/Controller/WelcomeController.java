package com.BikkadIT.SendingDataUTtoController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	@GetMapping("/WelcomeMsg")
	public String WelcomeMsg(@RequestParam   String name,Model model) {
		
		
		String msg="Hi " +name+ "Welcome to my  page"	;	
		
		System.out.println(msg);
		
		model.addAttribute("MSG", msg);
		return "welcome";}

}
