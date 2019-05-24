package com.tecsup.petclinic.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long>{
	
	List<Owner> findByFirstName(String firstName);
	
	List<Owner> findByLastName(String lastName);
	
	List<Owner> findByCity(String city);
}
