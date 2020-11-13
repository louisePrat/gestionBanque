package com.adaming.banque.service;

import java.util.List;
import java.util.Optional;

import com.adaming.banque.entity.Compte;

public interface CompteService {
	//Save & Update
	public Compte souCompte(Compte compte);
	//Delete
	public void deleteCompteById(Long id);
	//Find One By Id
	public Optional<Compte> findCompteById(Long id);
	//Get One
	public Compte findCompte(Long id);
	//Find All
	public List<Compte> findComptes();
	
}
