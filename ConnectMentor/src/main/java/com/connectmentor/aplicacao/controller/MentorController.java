package com.connectmentor.aplicacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.connectmentor.aplicacao.entity.Mentor;
import com.connectmentor.aplicacao.service.MentorService;



@Controller	
@RequestMapping("/")
public class MentorController {
	
	@Autowired
	private MentorService service;
	

	@GetMapping("Cadastro")
	public ModelAndView perfilMentorado() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Cadastro");
		return mv;	
	
}
	 @PostMapping("/inserirMentorados")
	    public String salvarMentor(@ModelAttribute Mentor mentor) {
	        

		 service.salvarMentor(mentor);
	        return "sucesso";
	    }
	
}
