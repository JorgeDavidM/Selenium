package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte abc = 127;
		short var = 30000;
		
		long var2 = 9223372036854775087L;
		
		double altura = 2.54;
		System.out.println(altura);
		
		char letra = '\u00A4';
		System.out.println(letra);
		
		String frase = "Hola";
		String frase2 = "Mundo";
		int frase3 = 4;
		int frase4 = 5;
		
		System.out.println(frase+frase2+frase3);
		System.out.println(frase3+frase4);
		
		boolean isDog = true;
		
		int x = 3;
		int y = 4;
		int z = 3+4;
		
		System.out.println("La suma es " + z);
		
		if (x<=y && isDog) {
			System.out.println("Siza");
		} else {
			System.out.println("Nocas");
		}
		
	}

}
