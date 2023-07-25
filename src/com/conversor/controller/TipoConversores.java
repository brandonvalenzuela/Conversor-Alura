package com.conversor.controller;

public enum TipoConversores{

		CONVERSOR_MONEDA("Conversor de Moneda"), 
		CONVERSOR_TEMPERATURA("Conversor de Temperatura"), 
		LONGITUD("Conversor de Longitud"),	
		TIPODEDATOS("Conversor de Datos");

		String tipo;

		TipoConversores(String tipo) {
			this.tipo = tipo;
		}

		@Override
		public String toString() {
			return tipo;
		}
	}
