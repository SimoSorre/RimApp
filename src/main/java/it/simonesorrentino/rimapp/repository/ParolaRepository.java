package it.simonesorrentino.rimapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.simonesorrentino.rimapp.model.Parola;

public interface ParolaRepository extends JpaRepository<Parola, Long>{
	
	@Override
	<S extends Parola> List<S> save(Iterable<S> arg0);

}
