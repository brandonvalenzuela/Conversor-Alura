package com.conversor.modelo;

import javax.swing.JOptionPane;
import com.conversor.controller.Conversor;
import com.conversor.controller.Error;
import com.conversor.controller.Temperatura;
import com.conversor.view.Main;

public class ConvertirTemperatura implements Conversor {

	public static void convertirTemperatura(String option, double grados) {
		ConvertirTemperatura convertidor = new ConvertirTemperatura();
		try {
			String[] conversionOptions = { "Kelvin a Celcius", "Kelvin a Fahrenheit", "Celcius a kelvin",
					"Celcius a Fahrenheit", "Fahrenheit a Celcius", "Fahrenheit a Kelvin" };

			if (isValidOption(option, conversionOptions)) {
				convertidor.convertir(option, grados); // Llamada al método convertir de la interfaz Conversor
			} else {
				JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
			}

		} catch (NullPointerException ex) {
			Error.programaTerminado();
		}
	}

	private static boolean isValidOption(String option, String[] validOptions) {
		for (String validOption : validOptions) {
			if (validOption.equals(option)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void convertir(String opcionConversion, double valor) {
		Temperatura[] grados = Temperatura.values();
		for (Temperatura grado : grados) {
			if (grado.getNombre().equalsIgnoreCase(opcionConversion)) {
				double cantidad = grado.calculate(valor);
				JOptionPane.showMessageDialog(null, "El resultado es: " + cantidad + " " + grado.getUnidad());
				int continuar = JOptionPane.showConfirmDialog(null, "¿Le gustaría continuar?");

				if (continuar == 0)
					Main.main(null);
				else
					Error.programaTerminado();
				return;
			}
		}
	}

}