package com.tecsup.petclinic.service;

import java.util.List;

import com.tecsup.petclinic.domain.Owner;
import com.tecsup.petclinic.exception.OwnerNotFoundException;

public interface OwnerService {

	Owner create(Owner owner);
	
	Owner update(Owner owner);
	
	void delete(Long id) throws OwnerNotFoundException;
	
	Owner findById(long id) throws OwnerNotFoundException;
	
	List<Owner> findByFirstName(String firstName);
	
	List<Owner> findByLastName(String lastName);
	
	List<Owner> findByCity(String city);
	
	Iterable<Owner> findAll();
}
