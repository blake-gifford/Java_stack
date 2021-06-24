package com.blakegifford.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.blakegifford.dojosandninjas.models.Ninja;
import com.blakegifford.dojosandninjas.repositories.NinjaRepository;


@Service
public class NinjaService {
	
	private final NinjaRepository ninjaRepository;
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public List<Ninja> allNinjas(){
		return (List<Ninja>) ninjaRepository.findAll();
	}
	
	public Ninja createNinja(Ninja n) {
		return ninjaRepository.save(n);
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		}else {
			return null;
		}
	}
}
