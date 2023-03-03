package com.BikkadIT.SendingDataUTtoController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AdditionController {

	
	@GetMapping("/printValue/{a}")
	public String printValue(@PathVariable int a, Model model) {
		
		
		
		
		
		String msg= "The value of a : " +a;
		
		model.addAttribute("MSG", msg);
		
		return null;}
	
	
	
}
