package com.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProduitRepository;
import com.demo.entities.Produit;

@Service
public class ProduitServiceImplement implements ProduitService {

	@Autowired
	ProduitRepository produitRepository;
	
	
	
	@Override
	public Produit saveProduct(Produit produit) {
		// TODO Auto-generated method stub
		return produitRepository.save(produit);
	}

	@Override
	public List<Produit> listerProd() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

	@Override
	public void deleteProduit(long id) {
		// TODO Auto-generated method stub
		produitRepository.deleteById(id);
	}

}
