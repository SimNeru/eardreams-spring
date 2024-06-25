package com.eardreams.project.crontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerUtenteMVC {

	@GetMapping("home")
	public String home() 
	{
		return "formRegistrazione.html";
	}
}
