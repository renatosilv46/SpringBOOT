package com.connectmentor.aplicacao.controller;

import org.hibernate.annotations.Parameter;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	 
	//Método para logar o mentor
	 @GetMapping("/logarMentor")
	 public String logar(@RequestParam("email") String email, @RequestParam("senha") String senha) {
		 
		 Mentor mentor =  service.buscarPorEmail(email);
		 
		 if(mentor == null) {
			 
			 return "redirect:/againLogin";
		 }
		 
		 System.out.println("Senha passada no parâmetro: "+senha);
			System.out.println("Senha do mentor: "+mentor.getSenha());
		
			if(!mentor.getSenha().equals(senha)) {
				return "redirect:/againLogin";
			
			
		}else {
			System.out.println(mentor.getSenha());
			System.out.println("senha param: "+senha);
			return "redirect:/perfilMentor/"+mentor.getIdMentor();
		}	 
	 }
	 
		//Setando view no endpoint login
		@GetMapping("login")
		public ModelAndView login() {
			ModelAndView mv = new ModelAndView();
				mv.setViewName("login");
				return mv;		
			}
		
		
		//Setando view no endpoint perfil mentor 
		@GetMapping("perfilMentor/{idMentor}")
		public ModelAndView perfilMentor(@PathVariable Integer idMentor) {
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("perfilMentor");
			return mv;	
		
		}
		
		//Setando view no endpoint tentar login novemante
		@GetMapping("againLogin")
		public ModelAndView againLogin() {
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("againLogin");
			return mv;	
		
		}
		
	}
