package com.adaming.banque.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.banque.entity.Utilisateur;
import com.adaming.banque.service.UtilisateurService;

@CrossOrigin
@RestController
public class UtilisateurController {
	
	@Autowired
	UtilisateurService utilisateurServ;
	
	//@PostMapping("/utilisateurs")
	@RequestMapping(value="/utilisateurs",method=RequestMethod.POST)
	public Utilisateur saveOrUpdate(@RequestBody Utilisateur utilisateur) {
		return utilisateurServ.souUtilisateur(utilisateur);
	}
	
	//@DeleteMapping("/utilisateurs/{id}")
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.DELETE)
	public void deleteOneByID(@PathVariable("id") Long id) {
		utilisateurServ.deleteUtilisateurById(id);
	}
	
	//@GetMapping("/utilisateurs/{id}")
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.GET)
	public Optional<Utilisateur> findOneById(@PathVariable("id") Long id){
		return utilisateurServ.findUtilisateurById(id);
	}
	
	//@GetMapping("/utilisateurs")
	@RequestMapping(value="/utilisateurs",method=RequestMethod.GET)
	public List<Utilisateur> findAll(){
		return utilisateurServ.findUtilisateurs();
	}
	
	//@PutMapping("/utilisateurs/{id}")
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.PUT)
	public Utilisateur update(@PathVariable("id")Long id ,@RequestBody Utilisateur utilisateur) {
		Utilisateur currentUser=utilisateurServ.findUtilisateur(id);
		currentUser.setNomUtilisateur(utilisateur.getNomUtilisateur());
		currentUser.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
		return utilisateurServ.souUtilisateur(currentUser);
	}
	
}
