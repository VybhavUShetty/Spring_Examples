package com.lti.Spring_Mvc_Controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.Spring_Mvc_Model.HelloWorld;


@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/helloworld",method=RequestMethod.GET)
	public String handler(Model model) {
		HelloWorld helloWorld=new HelloWorld();
		helloWorld.setMessage("Hello World");
		helloWorld.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("helloWorld", helloWorld);
		return "helloworld";
	}
	
	

}
