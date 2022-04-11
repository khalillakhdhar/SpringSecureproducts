package com.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment de id
private long id;
private String titre;
private String type;
private String description;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Produit(String titre, String type, String description) {
	super();
	this.titre = titre;
	this.type = type;
	this.description = description;
}
public Produit() {
	super();
}










}
