package com.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Service.ProduitServiceImplement;
import com.demo.entities.Produit;

@RestController
@RequestMapping("produit")
public class ProduitController {
@Autowired
ProduitServiceImplement produitServiceImplement;
	
	
@GetMapping
public List<Produit> getAll()
{
return produitServiceImplement.listerProd();	

}
@PostMapping
public Produit addOne(@Valid @RequestBody Produit produit)
{
return produitServiceImplement.saveProduct(produit);	
}
@DeleteMapping("/{id}")
public void deleteProd(@PathVariable long id)
{
produitServiceImplement.deleteProduit(id);	
}

}
