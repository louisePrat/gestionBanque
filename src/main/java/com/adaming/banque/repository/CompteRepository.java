package com.adaming.banque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.banque.entity.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long>{

}
