package com.conversor.view;

import javax.swing.JOptionPane;
import com.conversor.controller.Error;
import com.conversor.controller.TipoConversores;
import com.conversor.modelo.ConvertirTemperatura;

public class Seleccion {

	public static void Seleccionar() {

		try {

			String seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
					"Message", JOptionPane.DEFAULT_OPTION, null, TipoConversores.values(), TipoConversores.values()[0]).toString();

			/**
			 * Al elegir tipo de conversion conversor de moneda se guarda la moneda
			 */

			if (seleccion != null) {
				switch (seleccion) {
				case "Conversor de Moneda":
					ConversorMoneda.Moneda();
					break;
				case "Conversor de Temperatura":
					ConvertirTemperatura.Termometro();
					break;
				default:
				}
			}else
				Error.programaTerminado();
		} catch (NullPointerException ex) {
			Error.programaTerminado();
		}
	}

}
