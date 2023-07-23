package com.conversor.modelo;

import com.conversor.controller.Divisas;
import com.conversor.controller.Error;
import com.conversor.controller.Conversor;

public class ConvertirMoneda extends Conversor {

	public static void Conversor(String option, double dinero) {
			
		try {
            String[] conversionOptions = {
                "Peso a Dolar", "Peso a Euro", "Peso a Libra", "Peso a Yen", "Peso a Won Coreano",
                "Dolar a Peso", "Euro a Peso", "Libra a Peso", "Yen a Peso", "Won Coreano a Peso"
            };

            if (isValidOption(option, conversionOptions)) {
                Divisas.convertir(option, dinero);
            } else {
                System.out.println("Opción inválida");
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
	public void convertir(double valor) {
		// TODO Auto-generated method stub
		
	}
}
