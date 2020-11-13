package com.adaming.banque.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("epargne")
public class CompteEpargne extends Compte{

	//Attributes
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double taux;

	//Constructors
	public CompteEpargne(double taux) {
		super();
		this.taux = taux;
	}
	
	//Getters Setters
	public double getTaux() {
		return taux;
	}
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	//toString
	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + "]";
	}

}
