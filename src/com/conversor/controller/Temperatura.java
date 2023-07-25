package com.conversor.controller;

public enum Temperatura {
	CELSIUS_TO_KELVIN("Celcius a kelvin","Grados Kelvin"){
		@Override
		public double calculate(double temperatura) {
			return (temperatura + 273.15);
		}
	},
	CELSIUS_TO_FAHRENHEIT("Celcius a Fahrenheit", "Grados Fahrenheit"){
		@Override
		public double calculate(double temperatura) {
			return (temperatura * 9 / 5) + 32;
		}
	},
	FAHRENHEIT_TO_CELCIUS("Fahrenheit a Celcius", "Grados Celcius"){
		@Override
		public double calculate(double temperatura) {
			return (temperatura - 32) * 5/9;
		}
	},
	FAHRENHEIT_TO_KELVIN("Fahrenheit a Kelvin", "Grados Kelvin"){
		@Override
		public double calculate(double temperatura) {
			return (temperatura - 32) * 5/9 + 273.15;
		}
	},
	KELVIN_TO_CELCIUS("Kelvin a Celcius", "Grados Celcius") {
		@Override
		public double calculate(double temperatura) {
			return (temperatura - 273.15);
		}
	},
	KELVIN_TO_FAHRENHEIT("Kelvin a Fahrenheit","Grados Fahrenheit"){
		@Override
		public double calculate(double temperatura) {
			return (temperatura - 273.15) * 9/5 + 32;
		}
	};
	

	String nombre, unidad;

	Temperatura(String nombre, String unidad) {
		this.nombre = nombre;
		this.unidad = unidad;
	}

	@Override
	public String toString() {
		return nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getUnidad() {
		return unidad;
	}

	public abstract double calculate(double value);
}
