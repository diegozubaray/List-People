package com.zubaray.angularspring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zubaray.angularspring.model.Persona;

@Service
public interface PersonaService {

	List<Persona> listar();
	Persona listarId(int id);
	Persona add(Persona p);
	Persona edit(Persona p);
	Persona delete(int id);
	
	
}
