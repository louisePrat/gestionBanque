package com.adaming.banque.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("courant")
public class CompteCourant extends Compte{

	//Attributes
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double decouvert;
	
	//Constructors
	public CompteCourant(double decouvert) {
		super();
		this.decouvert = decouvert;
	}
	
	//Getters Setters
	public double getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	//toString
	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + "]";
	}
	
}
