package com.m2i.formation.media;


public class Editor {

	private String name;
	private String siretNb;
	private double ca;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the siretNb
	 */
	public String getSiretNb() {
		return siretNb;
	}
	/**
	 * @return the cA
	 */
	public double getCA() {
		return ca;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param siretNb the siretNb to set
	 */
	public void setSiretNb(String siretNb) {
		this.siretNb = siretNb;
	}
	
	/*
	 * Affiche des infos sp�cifiques lors du debugage
	 */
	public String toString() {
		return "Editor "+name;
	}

	
}