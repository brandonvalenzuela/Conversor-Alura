/*package com.conversor.view;

import javax.swing.JOptionPane;

import com.conversor.controller.Error;
import com.conversor.controller.TipoConversores;

public class Main {

	public static void main(String[] args) {
		
		try {

			String seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
					"Message", JOptionPane.DEFAULT_OPTION, null, TipoConversores.values(), TipoConversores.values()[0]).toString();

			/**
			 * Al elegir tipo de conversion conversor de moneda se guarda la moneda
			 */
/*
			if (seleccion != null) {
				switch (seleccion) {
				case "Conversor de Moneda":
					ConversorMoneda.Moneda();
					break;
				case "Conversor de Temperatura":
					ConversorTemperatura.Temperatura();
					break;
				default:
				}
			}else
				Error.programaTerminado();
		} catch (NullPointerException ex) {
			Error.programaTerminado();
		}
	}

}*/

package com.conversor.view;

import javax.swing.JOptionPane;

import com.conversor.controller.Error;
import com.conversor.controller.TipoConversores;

public class Main {

    public static void main(String[] args) {

        try {
            TipoConversores seleccion = (TipoConversores) JOptionPane.showInputDialog(null,
                    "Seleccione una opción de conversión", "Message", JOptionPane.DEFAULT_OPTION, null,
                    TipoConversores.values(), TipoConversores.values()[0]);

            if (seleccion != null) {
                switch (seleccion) {
                    case CONVERSOR_MONEDA:
                        ViewMoneda.Moneda();
                        break;
                    case CONVERSOR_TEMPERATURA:
                        ViewTemperatura.Temperatura();
                        break;
                    default:
                }
            } else {
                Error.programaTerminado();
            }
        } catch (NullPointerException ex) {
            Error.programaTerminado();
        }
    }
}