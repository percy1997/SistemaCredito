package com.credito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.credito.entity.CreditoUsuario;
import com.credito.entity.Interes;
import com.credito.entity.Usuario;
import com.credito.services.CreditoServices;
import com.credito.services.CreditoUsuarioServices;
import com.credito.services.InteresServices;
import com.credito.services.UsuarioServices;

@Controller
@RequestMapping("/sistema")
public class CreditoController {

	@Autowired
	private UsuarioServices usuSer;
	
	@Autowired
	private CreditoServices creSer;
	
	@Autowired
	private InteresServices intSer;
	
	@Autowired
	private CreditoUsuarioServices preSer;
	
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
	
	@RequestMapping("/registrarPrestamo")
	public String registrarPrestamo(
			 @RequestParam("numeroDni") int dni,
			 @RequestParam("creditoSolicitado") double cantidadPrestamo) {
		
		int codigoUsuario = usuSer.obtenerCodigoPorDni(dni);
		
		CreditoUsuario cu = new CreditoUsuario();				
		cu.setCantidadPrestamo(cantidadPrestamo);		
		Usuario u=new Usuario();
		u.setCodigoUsuario(codigoUsuario);
		cu.setUsuario(u);
		preSer.registrarPrestamo(cu);
		return "redirect:/sistema";
	}
	
}
