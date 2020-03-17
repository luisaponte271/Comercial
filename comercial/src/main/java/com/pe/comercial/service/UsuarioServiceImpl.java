package com.pe.comercial.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.AttributeOverride;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//import com.pe.comercial.bean.Usuario;
//import com.pe.comercial.bean.Usuarios;
//import com.pe.comercial.dao.IUsuarioDAO;
import com.pe.comercial.dao.jpa.IUsuarioDAOJpa;

 

//@Service
//public abstract class UsuarioServiceImpl implements IUsuarioService {
//	
//	@Autowired 
//	private IUsuarioDAO usuarioDAO;
//
// 
//	
//	@Override
//	public List<Usuario> obtenerlista() {
//		// TODO Auto-generated method stub
//		return  (List<Usuario>) usuarioDAO.findAll();
//	}
//	
//	 
//}
