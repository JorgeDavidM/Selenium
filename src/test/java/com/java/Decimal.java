package com.java;

public class Decimal {

	public static void main(String[] args) {
		
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));

	}
	
	public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
		
		x = x * 1000;
		y = y * 1000;
		
		int converterX = (int) x;
		int converterY = (int) y;
		
		if (converterX == converterY) {
			return true;
		} else {
			return false;
		}
		
	}

}
