package com.BikkadIT.SendingDataUTtoController.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CourseController {

	@GetMapping("/course")
	public ModelAndView getCourseDetails(@RequestParam String cname,@RequestParam String tname)
	{
		
		String msg=cname +" courses by "+tname;
		
		ModelAndView mav= new ModelAndView();
		mav.addObject("COURSE", mav);
		mav.setViewName("course");
		
		return null;}
	
}
