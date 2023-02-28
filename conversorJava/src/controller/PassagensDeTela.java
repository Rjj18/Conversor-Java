package controller;

import javax.swing.JOptionPane;

import view.ConversorDeMoedas;
import view.ConversorDistancias;
import view.TelaInicial2;

public class PassagensDeTela {

	public static void passagemTela1() {
		Object escolhaTela1 = TelaInicial2.inicia();
		if (escolhaTela1 == "Conversor de Moedas") {
			ConversorDeMoedas.iniciaMoeda();
		} else if (escolhaTela1 == "Conversor de Distâncias") {
			ConversorDistancias.inicia();
		} 
	}
	
	public static Double passagemTela2 () {
		
		double resultado = 0;
		
		Object[] valoresPossiveis = { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes", "De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Yenes a Reais", "De Won Coreano a Reais" };
		Object escolhaConversao = JOptionPane.showInputDialog(null, "Escolha a conversão desejada", "Conversor de Moedas", JOptionPane.INFORMATION_MESSAGE,
				null, valoresPossiveis, valoresPossiveis[0]);
		
		if (escolhaConversao == "De Reais a Dólares") {
			
		} else if (escolhaConversao == "De Reais a Euros" ) {
			
		} else if (escolhaConversao == "De Reais a Libras") {
			
		} else if (escolhaConversao == "De Reais a Yenes" ) {
			
		} else if (escolhaConversao == "De Reais a Won Coreano" ) {
			
		} else if (escolhaConversao == "De Dólares a Reais") {
			
		} else if (escolhaConversao == "De Euros a Reais") {
			
		} else if (escolhaConversao == "De Libras a Reais" ) {
			
		} else if (escolhaConversao == "De Yenes a Reais") {
			
		} else if (escolhaConversao == "De Won Coreano a Reais") {
			
		}
		return resultado;
	}
}
