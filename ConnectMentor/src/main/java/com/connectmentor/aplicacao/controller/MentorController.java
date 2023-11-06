package com.connectmentor.aplicacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import com.connectmentor.aplicacao.Util.PasswordUtil;
import com.connectmentor.aplicacao.entity.Mentor;
import com.connectmentor.aplicacao.service.MentorService;

@Controller	
@RequestMapping("/")
public class MentorController {
	

	@Autowired
	private MentorService service;
	
	
	//Setando view no endpoint cadastro;
	@GetMapping("CadastroMentor")
	public ModelAndView cadastro() {
		ModelAndView mv = new ModelAndView();
			mv.setViewName("CadastroMentor");
			return mv;	
			}
	
	
	//Postando cadastro do mentor no banco; 
	@PostMapping("/inserirMentores")
	    public String salvarMentor(@ModelAttribute Mentor mentor) {
		 service.salvarMentor(mentor);
		 /*
		 String hashsenha = PasswordUtil.encoder(mentor.getSenha());
		 mentor.setSenha(hashsenha);
		 */
	        return "sucesso";
	    }
	 
	
	//Setando view no endpoint index	
	 @GetMapping("index")
		public ModelAndView index() {
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("index");
			return mv;		
	}
	 
		//Setando view no endpoint login
		@GetMapping("login")
		public ModelAndView login() {
			ModelAndView mv = new ModelAndView();
				mv.setViewName("login");
				return mv;		
			}
		//Setando view no endpoint perfil mentor 
		@GetMapping("perfilMentor1")
		public ModelAndView perfilMentor1() {
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("perfilMentor1");
			return mv;	
		
		}
		
		
	}
