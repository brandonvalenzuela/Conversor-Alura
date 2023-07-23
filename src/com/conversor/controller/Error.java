package com.conversor.controller;

import javax.swing.JOptionPane;

public class Error {
	public static void programaTerminado() {		
		JOptionPane.showMessageDialog(null, "Programa terminado", "Warning", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void valorInvalido() {		
		JOptionPane.showMessageDialog(null, "Valor no válido",
				"Error de entrada", JOptionPane.ERROR_MESSAGE);
	}
}
