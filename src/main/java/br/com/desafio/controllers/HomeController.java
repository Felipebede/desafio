
package br.com.desafio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/desafio")
	public String index() {
		return "home/index";
	}


}
