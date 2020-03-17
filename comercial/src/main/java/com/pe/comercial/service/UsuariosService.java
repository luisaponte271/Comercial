package com.pe.comercial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.comercial.bean.Usuarios;
import com.pe.comercial.dao.jpa.IUsuarioDAOJpa;

@Service
public class UsuariosService {
	
	@Autowired
	private IUsuarioDAOJpa usuarioDAOJpa;
	
	public List<Usuarios> obtenerlistaJpa() {
		// TODO Auto-generated method stub
		return  (List<Usuarios>) usuarioDAOJpa.findAll();
	}

}
