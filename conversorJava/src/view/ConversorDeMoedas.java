package view;

import javax.swing.JOptionPane;

import controller.CalculadoraDeMoedas;
import controller.PassagensDeTela;

public class ConversorDeMoedas {

	public static Double iniciaMoeda() {

		String mensagem = "Digite o valor desejado";
		String selecao = JOptionPane.showInputDialog(mensagem).toString();
		double numero = 0;
		
		if (selecao.matches("^[A-Za-z]*")) {
			JOptionPane.showMessageDialog(null, "Favor digitar apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
			iniciaMoeda();
		} else {
			numero = Double.parseDouble(selecao);		
			}
		return numero;
	}
}