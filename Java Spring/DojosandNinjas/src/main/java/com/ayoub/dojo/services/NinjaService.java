package com.ayoub.dojo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayoub.dojo.models.Ninja;
import com.ayoub.dojo.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepository ninjaRepository;

	
	// ----- CREATE -----
	public Ninja createNinja(Ninja newNinja) {
		return ninjaRepository.save(newNinja);
	}
}