package com.conversor.modelo;

import javax.swing.JOptionPane;

import com.conversor.controller.Divisas;

public class Convertir {

	public static void Conversor(String option, double dinero) {
			
		try {
			/*
			 * Esto paso a la clase seleccion
			 * 
			 * String option = JOptionPane.showInputDialog(null, "Elige moneda a la que deseas convertir tu dinero", "Message", JOptionPane.DEFAULT_OPTION, null,
					Divisas.values(), Divisas.values()[0]).toString();
			
			double dinero = Double.parseDouble(
					JOptionPane.showInputDialog(null, "ingrese la cantidad de dinero que desea convertir: "));
			*/
			/*Divisas[] numeros = Divisas.values();
			for (int i =0; i <numeros.length;i++) {
				if (numeros[i].nombre == option) {
					option = numeros[i].name();//String.valueOf(i);
				}
			}*/
			/*
			 * Lo comentado se optimizo y se paso al metodo multiplicacion
			 * en la clase de enums Divisas
			 */
			//double conversion;
			switch (option) {
			case "Peso a Dolar":
				Divisas.multiplicacion(option, dinero);
				/*conversion = Divisas.MUSA.pesoADivisa * dinero;
				JOptionPane.showMessageDialog(null, "Tienes $" + conversion + " Dolares");*/
				break;
			case "Peso a Euro":
				Divisas.multiplicacion(option, dinero);
				/*conversion = Divisas.MEURO.pesoADivisa * dinero;
				JOptionPane.showMessageDialog(null, "Tienes $" + conversion + " Euros");*/
				break;
			case "Peso a Libra":
				Divisas.multiplicacion(option, dinero);
				/*conversion = Divisas.MLIBRA.pesoADivisa * dinero;
				JOptionPane.showMessageDialog(null, "Tienes $" + conversion + " Libras");*/
				break;
			case "Peso a Yen":
				Divisas.multiplicacion(option, dinero);
				/*conversion = Divisas.MYEN.pesoADivisa * dinero;
				JOptionPane.showMessageDialog(null, "Tienes $" + conversion + " Yenes");*/
				break;
			case "Peso a Won Coreano":
				Divisas.multiplicacion(option, dinero);
				/*conversion = Divisas.MWON.pesoADivisa * dinero;
				JOptionPane.showMessageDialog(null, "Tienes $" + conversion + " Wons");*/
				break;
			case "Dolar a Peso":
				Divisas.multiplicacion(option, dinero);
				/*conversion = Divisas.UMEX.pesoADivisa * dinero;
				JOptionPane.showMessageDialog(null, "Tienes $" + conversion + " Pesos");*/
				break;
			case "Euro a Peso":
				Divisas.multiplicacion(option, dinero);
				/*conversion = Divisas.EMEX.pesoADivisa * dinero;
				JOptionPane.showMessageDialog(null, "Tienes $" + conversion + " Pesos");*/
				break;
			case "Libra a Peso":
				Divisas.multiplicacion(option, dinero);
				/*conversion = Divisas.LMEX.pesoADivisa * dinero;
				JOptionPane.showMessageDialog(null, "Tienes $" + conversion + " Pesos");*/
				break;
			case "Yen a Peso":
				Divisas.multiplicacion(option, dinero);
				/*conversion = Divisas.YMEX.pesoADivisa * dinero;
				JOptionPane.showMessageDialog(null, "Tienes $" + conversion + " Pesos");*/
				break;
			case "Won Coreano a Peso":
				Divisas.multiplicacion(option, dinero);
				/*conversion = Divisas.WMEX.pesoADivisa * dinero;
				JOptionPane.showMessageDialog(null, "Tienes $" + conversion + " Pesos");*/
				break;
			default:
			}
		} catch (NullPointerException ex) {
			JOptionPane.showMessageDialog(null, "Saliendo del Sistema...");	
		}
	}
}
