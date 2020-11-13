package com.adaming.banque.service;

import java.util.List;
import java.util.Optional;

import com.adaming.banque.entity.Utilisateur;

public interface UtilisateurService {
	//Save & Update
	public Utilisateur souUtilisateur(Utilisateur utilisateur);
	//Delete
	public void deleteUtilisateurById(Long id);
	//Find One By Id
	public Optional<Utilisateur> findUtilisateurById(Long id);
	//Get One
	public Utilisateur findUtilisateur(Long id);
	//Find All
	public List<Utilisateur> findUtilisateurs();
	
}
