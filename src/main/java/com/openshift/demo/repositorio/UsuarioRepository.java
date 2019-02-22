package com.openshift.demo.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openshift.demo.entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{

	
	
	
}
