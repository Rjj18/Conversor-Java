package view;

import javax.swing.JOptionPane;

public class ConversorDistancias {

public static Object inicia() { 
		
		String mensagem = "Digite a distância a ser calculada";
		Object selecao = JOptionPane.showInputDialog(mensagem);
		return selecao;
	}
}