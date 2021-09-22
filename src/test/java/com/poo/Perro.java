package com.poo;

public class Perro {
	int numPatas;
	String color, tamano, raza;
	
	//Constructor
	public Perro(int numPatas, String color, String tamano, String raza) {
		this.numPatas = numPatas;
		this.color = color;
		this.tamano = tamano;
		this.raza = raza;
	}
	
	//Getters
	public String getRaza() {
		return this.raza;
	}
	
	public int getNumPatas() {
		return this.numPatas;
	}
	
	//Setters
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
}
