package com.pe.comercial.dao.jpa;

 
import org.springframework.data.jpa.repository.JpaRepository; 

import com.pe.comercial.bean.Usuarios; 


public interface IUsuarioDAOJpa extends JpaRepository<Usuarios, Integer> {

}
