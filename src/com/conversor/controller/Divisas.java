package com.conversor.controller;

import javax.swing.JOptionPane;

public enum Divisas {

	MEXUSA("Peso a Dolar", 0.060, "Dolares"), MEXEURO("Peso a Euro", 0.053, "Euros"),
	MEXLIBRA("Peso a Libra", 0.046, "Libras"), MEXYEN("Peso a Yen", 0.12, "Yenes"),
	MEXWON("Peso a Won Coreano", 0.013, "Wons"), USAMEX("Dolar a Peso", 16.79, "Pesos"),
	EUROMEX("Euro a Peso", 18.80, "Pesos"), LIBRAMEX("Libra a Peso", 21.62, "Pesos"),
	YENMEX("Yen a Peso", 8.32, "Pesos"), WONMEX("Won Coreano a Peso", 75.74, "Pesos");

	double pesoADivisa;
	String nombre, tipoDivisa;

	private Divisas(String nombre, double pesoADivisa, String tipoDivisa) {
		this.nombre = nombre;
		this.pesoADivisa = pesoADivisa;
		this.tipoDivisa = tipoDivisa;
	}

	public static void multiplicacion(String nombre, double presio) {
		Divisas[] numeros = Divisas.values();
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i].nombre == nombre) {
				double a = numeros[i].pesoADivisa * presio;
				JOptionPane.showMessageDialog(null, "Tienes $" + a + " " + numeros[i].tipoDivisa);
			}
		}
		// Arrays.asList(numeros).equals(nombre);
	}

	/*
	 * public String getText() { return nombre; }
	 */

	@Override
	public String toString() {
		return nombre;
	}
}
