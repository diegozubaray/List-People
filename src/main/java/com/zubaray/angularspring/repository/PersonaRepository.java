package com.zubaray.angularspring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.zubaray.angularspring.model.Persona;

public interface PersonaRepository extends CrudRepository<Persona, Integer> {

	List<Persona> findAll();
	Persona findById(int id);
	Persona save(Persona p);
	void delete(Persona p);
	
}
