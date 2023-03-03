package com.BikkadIT.SendingDataUTtoController.Controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {

	@GetMapping("/loadForm")
public String loadform()	{
		
		
		
		
	return "userReg";
	
	
	}
	
	@PostMapping("saveUser")
	public String saveUser( User user, Model model) {
		System.out.println(user);
		model.addAttribute("USER", user);
		
		return "Usersuccess";}
	
	
	
}
