package com.conversor.view;

import javax.swing.JOptionPane;

import com.conversor.controller.Divisas;
import com.conversor.modelo.Convertir;
import com.conversor.modelo.Temperatura;

public class Seleccion {
	
	public static void Selccionar() {
		 
		Object[] tipo =  {"Conversor de Moneda", "Conversor de Temperatura"};
		
		try {
		String num = JOptionPane.showInputDialog(null ,"Seleccione una opción de converción", "Menu", JOptionPane.PLAIN_MESSAGE, null,
					tipo, "Selecciona").toString();
		/**
		 * Al elegir conversor de moneda se guarda la moneda a convertir en option
		 * y la cantidad de dinero que desea convertin en dinero
		 */
		if (num == "Conversor de Moneda") { 
			
			String option = JOptionPane.showInputDialog(null, "Elige moneda a la que deseas convertir tu dinero", "Message", JOptionPane.DEFAULT_OPTION, null,
					Divisas.values(), Divisas.values()[0]).toString();
			
			double dinero = Double.parseDouble(
					JOptionPane.showInputDialog(null, "ingrese la cantidad de dinero que desea convertir: "));
			
			Convertir.Conversor(option, dinero);
			
		}else if(num == "Conversor de Temperatura")
			Temperatura.Termometro();
		
		
		
		
		}catch(NullPointerException ex) {
			JOptionPane.showMessageDialog(null, "Saliendo del Sistema...");
		}catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Se esperaba un numero");	
		}
	}
}	
