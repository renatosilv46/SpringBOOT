package com.connectmentor.aplicacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.connectmentor.aplicacao.entity.Mentorado;
import com.connectmentor.aplicacao.entity.MentoradoPretensao;
import com.connectmentor.aplicacao.entity.Pretensao;
import com.connectmentor.aplicacao.service.MentoradoPretensaoService;
import com.connectmentor.aplicacao.service.MentoradoService;
import com.connectmentor.aplicacao.service.PretensaoService;

@Controller
@RequestMapping("/")
public class MentoradoController {

	// Injeção de depedências;
	@Autowired
	private MentoradoService mentoradoService;

	@Autowired
	private PretensaoService pretensaoService;

	@Autowired
	private MentoradoPretensaoService mentoradoPretensaoService;

	
	
	// Setando view na página de teste do perfil mentorado;
	@GetMapping("testePerfilMentorado")
	public ModelAndView testePerfilMentorado() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("testePerfilMentorado");
		return mv;
	}
	
	//Setando view no endpoint cadastro;
	@GetMapping("CadastroMentorado")
	public ModelAndView cadastro() {
		ModelAndView mv = new ModelAndView();
			mv.setViewName("CadastroMentorado");
			return mv;	
			}
	
	//Setando view no endpoint index	
	@RequestMapping("/")	 
	@GetMapping("index")
			public ModelAndView index() {
				
				ModelAndView mv = new ModelAndView();
				mv.setViewName("index");
				return mv;		
		}
	
	@GetMapping("sucesso")
	public ModelAndView sucesso() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("sucesso");
		return mv;		
}
	
	
	// Setando view no endpoint perfil mentorado;
	@GetMapping("perfilMentorado/{idMentorado}")
	public ModelAndView perfilMentorado(@PathVariable Integer idMentorado) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("perfilmentorado");
		return mv;
	}
	
	
	
	@GetMapping("editarperfil/{idMentorado}")
	public ModelAndView editarperfil(@PathVariable Long idMentorado) {

	mentoradoService.buscarIdMentorado(idMentorado);
		
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("editarperfil");
		return mv;
	}

	@PostMapping("/inserirMentorados")
    public String salvarMentorado(@ModelAttribute Mentorado mentorado) {
	 mentoradoService.salvarMentorado(mentorado);
	 /*
	 String hashsenha = PasswordUtil.encoder(mentor.getSenha());
	 mentor.setSenha(hashsenha);
	 */
        return "sucesso";
    }
	
	// Inserindo pretensões do mentorado;
	@PostMapping("/inserirPretensoes")
	public String salvarPretensoes(@RequestParam Long idMentorado, @RequestParam("idPretensao") List<Long> idPretensao) {
		try {

			Mentorado mentorado = mentoradoService.buscarIdMentorado(idMentorado);

			if (mentorado != null && idPretensao != null && !idPretensao.isEmpty()) {

				for (Long id : idPretensao) {

					Pretensao pretensao = pretensaoService.buscarIdPretensao(id);

					if (pretensao != null) {

						MentoradoPretensao mentoradoPretensao = new MentoradoPretensao(null, mentorado, pretensao);

						mentoradoPretensaoService.salvarPretensao(mentoradoPretensao);
					}
				} // forEach;
				return "redirect:/sucesso"; // IF;
			} else {
				return "redirect:/index"; // ELSE;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:/Cadastro"; // EXCEPTION;
		}
	}// Method;

	
	//Método para retornar a lista de pretensões do mentorado;
	@GetMapping("perfilMentorado/listaPretensoes")
	public ResponseEntity<List<MentoradoPretensao>> findAll(){
		List<MentoradoPretensao> list = mentoradoPretensaoService.findAll();
		return ResponseEntity.ok().body(list);
		}
	
	//Método para logar o mentorado
		 @GetMapping("/logarMentorado")
		 public String logar(@RequestParam("email") String email, @RequestParam("senha") String senha) {
			 
			 Mentorado mentorado =  mentoradoService.buscarPorEmail(email);
			
			 if(mentorado == null) {
				 
				 return "redirect:/againLogin";
			 }
			 
				if(!mentorado.getSenha().equals(senha)) {
					return "redirect:/againLogin";
				
			}else {
				
				
				return "redirect:/perfilMentorado/"+mentorado.getId();
			}	 	
		 }
		 
		
		 @GetMapping("encontrarMentor")
			public ModelAndView encontrarMentor() {

				ModelAndView mv = new ModelAndView();
				mv.setViewName("encontrarMentor");
				return mv;
			}
	
	
	
	
	
	
}