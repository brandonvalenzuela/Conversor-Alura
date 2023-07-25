package com.conversor.view;

import javax.swing.JOptionPane;

import com.conversor.controller.Divisas;
import com.conversor.controller.Error;
import com.conversor.modelo.ConvertirMoneda;

public class ViewMoneda {
    public static void Moneda() {

        Divisas option = (Divisas) JOptionPane.showInputDialog(null,
                "Elige moneda a la que deseas convertir tu dinero", "Message",
                JOptionPane.DEFAULT_OPTION, null, Divisas.values(), Divisas.values()[0]);

        if (option != null) {
            Cantidad(option);
        } else {
        	Error.programaTerminado();//Salimos si el usuario cancela o cierra el programa
        }
    }

    public static void Cantidad(Divisas option) {
        while (true) {
            String dineroString = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir: ");
            if (dineroString == null) {
                Error.programaTerminado();
                return; //Salimos del bucle si el usuario cancela o cierra el programa
            }

            try {
                double dinero = Double.parseDouble(dineroString); // Convertimos el String a double si es valido, sino Manda error y regresa al principio
                ConvertirMoneda.convertirMoneda(option.getNombre(), dinero);
                return; // Salimos del bucle si la conversión fue exitosa
            } catch (NumberFormatException ex) {
            	Error.valorInvalido();
            }
        }
    }
}
