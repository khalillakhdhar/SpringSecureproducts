package com.demo.Service;

import java.util.List;

import com.demo.entities.Produit;

public interface ProduitService {
public Produit saveProduct(Produit produit);
public List<Produit> listerProd();
public void deleteProduit(long id);
}
