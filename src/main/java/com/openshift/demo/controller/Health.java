package com.openshift.demo.controller;

import java.util.Iterator;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.openshift.demo.entity.Usuario;
import com.openshift.demo.repositorio.UsuarioRepository;

@RestController
public class Health {

	@Autowired
    DataSource dataSource;
 
    @Autowired
    UsuarioRepository systemRepository;
    
	@RequestMapping(value="/salud", method=RequestMethod.GET)
	public String login() {
		
		Iterable<Usuario> usuarioIterator = systemRepository.findAll();
		
		Iterator<Usuario> iterator = usuarioIterator.iterator();
		
		int contador = 0;
		if (iterator.hasNext()) {
//			Usuario user = iterator.next();
			contador++;
		}
		
		
		return "Hola Mundo openshift!! Se encontraron " + contador + " usuarios desde la BD.";
	}
}
