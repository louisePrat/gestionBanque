package com.adaming.banque.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.banque.entity.Utilisateur;
import com.adaming.banque.repository.UtilisateurRepository;
import com.adaming.banque.service.UtilisateurService;

@Service
public class UtilisateurServiceImp implements UtilisateurService{

	@Autowired
	UtilisateurRepository utilisateurRepo;
	
	@Override
	public Utilisateur souUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return utilisateurRepo.save(utilisateur);
	}

	@Override
	public void deleteUtilisateurById(Long id) {
		// TODO Auto-generated method stub
		utilisateurRepo.deleteById(id);
	}

	@Override
	public Optional<Utilisateur> findUtilisateurById(Long id) {
		// TODO Auto-generated method stub
		return utilisateurRepo.findById(id);
	}

	@Override
	public Utilisateur findUtilisateur(Long id) {
		// TODO Auto-generated method stub
		return utilisateurRepo.getOne(id);
	}

	@Override
	public List<Utilisateur> findUtilisateurs() {
		// TODO Auto-generated method stub
		return utilisateurRepo.findAll();
	}

}
