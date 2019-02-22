package com.openshift.demo.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.openshift.demo.repositorio.UsuarioRepository;

@RestController
public class Health {

	@Autowired
    DataSource dataSource;
 
    @Autowired
    UsuarioRepository systemRepository;
	@RequestMapping(value="/salud", method=RequestMethod.GET)
	public String login() {
		systemRepository.findAll();
		return "Hola Mundo openshift!!";
	}
}
