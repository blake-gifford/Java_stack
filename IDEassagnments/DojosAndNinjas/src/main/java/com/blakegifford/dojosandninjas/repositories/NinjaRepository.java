package com.blakegifford.dojosandninjas.repositories;

import java.util.List;


import org.springframework.data.repository.CrudRepository;

import com.blakegifford.dojosandninjas.models.Ninja;


public interface NinjaRepository extends CrudRepository<Ninja, Long>{

	List<Ninja> findAllByDojoId(Long idDojo);
}
