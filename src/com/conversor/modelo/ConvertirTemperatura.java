package com.conversor.modelo;

import javax.swing.JOptionPane;

import com.conversor.controller.Conversor;
import com.conversor.controller.Divisas;

public class ConvertirTemperatura extends Conversor  {

	public static void Termometro() {
			Divisas[] monedas = Divisas.values();
			JOptionPane.showInputDialog(null ,"Seleccione una escala de temperatura", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE, null, monedas, "Selecciona");
		}

	@Override
	public void convertir(double valor) {
		// TODO Auto-generated method stub
		
	}
	
}
