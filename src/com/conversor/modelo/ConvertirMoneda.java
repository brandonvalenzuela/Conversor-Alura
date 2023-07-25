package com.conversor.modelo;

import javax.swing.JOptionPane;

import com.conversor.controller.Conversor;
import com.conversor.controller.Divisas;
import com.conversor.controller.Error;
import com.conversor.view.Main;


public class ConvertirMoneda implements Conversor {

    public static void convertirMoneda(String option, double dinero) {
    	ConvertirMoneda convertidor = new ConvertirMoneda();
    	
        try {
            String[] conversionOptions = {
                    "Peso a Dolar", "Peso a Euro", "Peso a Libra", "Peso a Yen", "Peso a Won Coreano",
                    "Dolar a Peso", "Euro a Peso", "Libra a Peso", "Yen a Peso", "Won Coreano a Peso"
            };

            if (isValidOption(option, conversionOptions)) {
            	convertidor.convertir(option, dinero); // Llamada al método convertir de la interfaz Conversor
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
        Divisas[] divisas = Divisas.values();
        for (Divisas divisa : divisas) {
            if (divisa.getNombre().equalsIgnoreCase(opcionConversion)) {
                double cantidad = divisa.getPesoADivisa() * valor;
                JOptionPane.showMessageDialog(null, "Tienes $" + cantidad + " " + divisa.getTipoDivisa());
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

