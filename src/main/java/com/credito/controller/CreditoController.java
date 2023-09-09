package com.credito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.credito.entity.Interes;
import com.credito.services.CreditoServices;
import com.credito.services.InteresServices;

@Controller
@RequestMapping("/sistema")
public class CreditoController {

	@Autowired
	private CreditoServices creSer;
	
	@Autowired
	private InteresServices intSer;
	
	@RequestMapping()
	public String index(Model model) {
		model.addAttribute("creditos", creSer.listaCreditos());
		model.addAttribute("interes", intSer.listarInteres());
		return "grillaCredito";
	}
	
	@GetMapping("/calculo")
	@ResponseBody
	public double calcular(@RequestParam("num1") double num1,@RequestParam("num2") double num2) {
		return num1 + num2;
	}
	
	@GetMapping("/interesPorCodigo")
	@ResponseBody
	public Interes interesPorCodigo(@RequestParam("dias") int codigo) {
		return intSer.interesPorCodigo(codigo);
	}
}
