package br.com.msaorim.mvc.mudi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("nome", "Marcelo Saorim");
		model.addAttribute("idade", "51");
		return "hello";
	}
}
