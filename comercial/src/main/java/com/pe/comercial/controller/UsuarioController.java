package com.pe.comercial.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
//import com.pe.comercial.service.IUsuarioService;
import com.pe.comercial.service.UsuariosService;

 
@Controller 
@RequestMapping(value="/usuario")
public class UsuarioController { 
	private final Map<String, Object> result = new HashMap<>();
	
//	@Autowired
//	private IUsuarioService usuarioService;
	  
	@Autowired
	private UsuariosService usuariosService;
	
	public  UsuarioController() {
		// TODO Auto-generated constructor stub
		result.put("STATUS", "OK");
	}
	
//    @GetMapping(value = "/listar")
//	public ResponseEntity<Object> obtenerListaUsuario() { 
//		 
//		result.put("data", usuarioService.obtenerlista());
//		return ResponseEntity.ok(result);
//	}
    
    @GetMapping(value = "/listarJpa5")
	public ResponseEntity<Object> obtenerListaUsuarioJpa() { 
		 
		result.put("data", usuariosService.obtenerlistaJpa());
		return ResponseEntity.ok(result);
	}
    
 
    
}
