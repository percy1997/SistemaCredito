package com.credito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.credito.services.CreditoServices;

@Controller
@RequestMapping("/sistema")
public class CreditoController {

	@Autowired
	private CreditoServices creSer;
	
	@RequestMapping()
	public String index(Model model) {
		model.addAttribute("creditos", creSer.listaCreditos());
		return "grillaCredito";
	}
}
