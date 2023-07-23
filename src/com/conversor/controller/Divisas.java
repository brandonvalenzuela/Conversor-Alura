package com.conversor.controller;

import javax.swing.JOptionPane;
import com.conversor.view.Seleccion;

public enum Divisas {

	MEXUSA("Peso a Dolar", 0.060, "Dolares"), USAMEX("Dolar a Peso", 16.79, "Pesos"),
	MEXEURO("Peso a Euro", 0.053, "Euros"), EUROMEX("Euro a Peso", 18.80, "Pesos"),
	MEXLIBRA("Peso a Libra", 0.046, "Libras"), LIBRAMEX("Libra a Peso", 21.62, "Pesos"),
	MEXYEN("Peso a Yen", 0.12, "Yenes"), YENMEX("Yen a Peso", 8.32, "Pesos"),
	MEXWON("Peso a Won Coreano", 0.013, "Wons"), WONMEX("Won Coreano a Peso", 75.74, "Pesos");

	double pesoADivisa;
	String nombre, tipoDivisa;

	private Divisas(String nombre, double pesoADivisa, String tipoDivisa) {
		this.nombre = nombre;
		this.pesoADivisa = pesoADivisa;
		this.tipoDivisa = tipoDivisa;
	}

	public static void convertir(String nombre, double presio) {
		Divisas[] divisas = Divisas.values();
		for (Divisas divisa : divisas) {
			if (divisa.nombre.equalsIgnoreCase(nombre)) {
				double cantidad = divisa.pesoADivisa * presio;
				JOptionPane.showMessageDialog(null, "Tienes $" + cantidad + " " + divisa.tipoDivisa);
				int continuar = JOptionPane.showConfirmDialog(null, "¿Le gustaría continuar?");
				
				if (continuar == 0)
					Seleccion.Seleccionar();
				else
					Error.programaTerminado();
				return;
			}
		}

	}

	@Override
	public String toString() {
		return nombre;
	}
}
