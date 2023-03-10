package main;

import java.util.EmptyStackException;

import javax.swing.JOptionPane;

import API.Moeda;
import API.ServiceCotacao;
import controller.CaculadoraConversao;
import controller.ConversoraMoedas;
import view.ConversorDistancias;

public class Aplicacao {
	
	static boolean finalizar = false;

	public static void main(String[] args) {

		do {

			Object[] valoresPossiveis = { "Conversor de Moedas", "Conversor de Distâncias" };
			String selectedValue = (String) JOptionPane.showInputDialog(null, "Choose one", "Input",
					JOptionPane.INFORMATION_MESSAGE, null, valoresPossiveis, valoresPossiveis[0]);

			if (selectedValue == null) {
				break;
			}
			
			switch (selectedValue) {
			
			case "Conversor de Moedas":
			
				String mensagem = "Digite o valor desejado";
				String selecao = JOptionPane.showInputDialog(mensagem).toString();
				double numero = 0;
				try {
					if (selecao.matches("^[A-Za-z]*")) {
						throw new Exception();				
					} 
					else {
						numero = Double.parseDouble(selecao);
						String moeda = ConversoraMoedas.passagemTela2();
						double precoVenda = ServiceCotacao.CotacaoMoeda(moeda).getBid();
						double valorConvertido = CaculadoraConversao.converteMoeda(moeda, numero);
						String nome = ConversoraMoedas.nomeMoeda(moeda);
						String nomeMoedaVendida = ConversoraMoedas.nomeMoedaVendida(moeda);
						String mensagemFinal = ConversoraMoedas.printConversao(nome, valorConvertido, nomeMoedaVendida, precoVenda);	
						JOptionPane.showMessageDialog(null, mensagemFinal, "Resultado",JOptionPane.PLAIN_MESSAGE);
						int continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar");		
						if (continuar == 1 || continuar == 2) {
							JOptionPane.showMessageDialog(null, "Programa Finalizado", "Mensagem", JOptionPane.PLAIN_MESSAGE);
							finalizar = true;
							break;
						} else {
							continue;
						}
					} 
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Favor Digitar apenas números", "Erro",JOptionPane.ERROR_MESSAGE);
				}		
			}
			
		} while(finalizar == false); 
	}
}