package com.poo;

public class Main {

	public static void main(String[] args) {
		
		//Objeto
		Perro objeto1 = new Perro(4, "Dorado", "Grande", "Golden");
		objeto1.setRaza("Samoyedo");
		objeto1.setNumPatas(100);
		System.out.println("El perro es de raza: " + objeto1.getRaza());
		System.out.println("El número de patas es de: " + objeto1.getNumPatas());
		
		Perro objeto2 = new Perro(4, "Gris", "Pequeño", "Chihuahua cabeza de manzana");
		System.out.println("El perro es de raza: " + objeto2.getRaza());
	}

}
