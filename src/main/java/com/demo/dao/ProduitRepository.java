package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
