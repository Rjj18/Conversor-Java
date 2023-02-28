package view;

import javax.swing.JOptionPane;

public class TelaInicial2 {
	
	
	public static Object inicia() {
		
		Object[] valoresPossiveis = { "Conversor de Moedas", "Conversor de Distâncias"};
		Object selectedValue = JOptionPane.showInputDialog(null,
		"Choose one", "Input",
		JOptionPane.INFORMATION_MESSAGE, null,
		valoresPossiveis, valoresPossiveis[0]);
		return selectedValue;
		}
	}
