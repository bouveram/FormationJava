package com.m2i.formation.media.entities;

public class Dvd extends Media{

	private int nbChapitre;

	public int getNbChapitre() {
		return nbChapitre;
	}

	public void setNbChapitre(int nbChapitre) {
		this.nbChapitre = nbChapitre;
	}

	@Override
	public double getVATPrice() {
		return getPrice()*1.2;
	}
	
}
