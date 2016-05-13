package it.simonesorrentino.rimapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import it.simonesorrentino.rimapp.model.Parola;
import it.simonesorrentino.rimapp.repository.ParolaRepository;
import it.simonesorrentino.rimapp.service.ParolaService;

public class ParolaServiceImpl implements ParolaService {
	
	@Autowired
	private ParolaRepository pr;

	@Override
	public List<Parola> saveAll(List<Parola> parole) { 
		
		return pr.save(parole);
	}

}
