package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontrol {

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String show() {
		return "home";
	}
}
