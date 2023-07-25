/*package com.conversor.view;

import javax.swing.JOptionPane;

import com.conversor.controller.Temperatura;
import com.conversor.modelo.ConvertirTemperatura;
import com.conversor.controller.Error;

public class ViewTemperatura {
	public static void Temperatura() {

        String option = JOptionPane.showInputDialog(null,
                "Elige que unidad de temperatura que desea convertir", "Message",
                JOptionPane.DEFAULT_OPTION, null, Temperatura.values(), Temperatura.values()[0]).toString();

        if (option != null) {
        	Grados(option);
        } else {
        	Error.programaTerminado();//Salimos si el usuario cancela o cierra el programa
        }
    }

    public static void Grados(String option) {
        while (true) {
            String gradoString = JOptionPane.showInputDialog(null, "Ingrese la cantidad de grados que desea convertir: ");
            if (gradoString == null) {
                Error.programaTerminado();
                return; //Salimos del bucle si el usuario cancela o cierra el programa
            }

            try {
                double grados = Double.parseDouble(gradoString); // Convertimos el String a double si es valido, sino Manda error y regresa al principio
                ConvertirTemperatura.convertirTemperatura(option, grados);
                return; // Salimos del bucle si la conversión fue exitosa
            } catch (NumberFormatException ex) {
            	Error.valorInvalido();
            }
        }
    }
}*/
package com.conversor.view;

import javax.swing.JOptionPane;

import com.conversor.controller.Temperatura;
import com.conversor.modelo.ConvertirTemperatura;
import com.conversor.controller.Error;

public class ViewTemperatura {
    public static void Temperatura() {

        Temperatura option = (Temperatura) JOptionPane.showInputDialog(null,
                "Elige que unidad de temperatura que desea convertir", "Message",
                JOptionPane.DEFAULT_OPTION, null, Temperatura.values(), Temperatura.values()[0]);

        if (option != null) {
            Grados(option);
        } else {
            Error.programaTerminado(); // Salimos si el usuario cancela o cierra el programa
        }
    }

    public static void Grados(Temperatura option) {
        do {
            String gradoString = JOptionPane.showInputDialog(null, "Ingrese la cantidad de grados que desea convertir: ");
            if (gradoString == null) {
                Error.programaTerminado();
                return; // Salimos del bucle si el usuario cancela o cierra el programa
            }

            try {
                double grados = Double.parseDouble(gradoString); // Convertimos el String a double si es valido, sino Manda error y regresa al principio
                ConvertirTemperatura.convertirTemperatura(option.getNombre(), grados);
                return; // Salimos del bucle si la conversión fue exitosa
            } catch (NumberFormatException ex) {
                Error.valorInvalido();
            }
        } while (true);
    }
}

