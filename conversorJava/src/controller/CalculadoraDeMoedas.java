package controller;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import view.ConversorDeMoedas;

public class CalculadoraDeMoedas {
	
	public Double calculaConversao (double valor, double coeficiente) {
		
		double calculado = valor*coeficiente;
		
		return calculado;
	}
}
