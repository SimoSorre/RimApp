package it.simonesorrentino.rimapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="parole_a")
public class Parola {
	
	@Id
	@Column
	private long id;
	@Column
	private String parola;
	@Column(name="numero_sillabe")
	private int numeroSillabe;
	@Column
	private String finale;
	
	

	public Parola() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public int getNumeroSillabe() {
		return numeroSillabe;
	}

	public void setNumeroSillabe(int numeroSillabe) {
		this.numeroSillabe = numeroSillabe;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parola [id=");
		builder.append(id);
		builder.append(", parola=");
		builder.append(parola);
		builder.append(", numeroSillabe=");
		builder.append(numeroSillabe);
		builder.append("]");
		return builder.toString();
	}
	
	
}
