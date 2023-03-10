package controller;

import javax.swing.JOptionPane;

import API.Moeda;
import API.ServiceCotacao;
import view.ConversorDistancias;

public class ConversoraMoedas {
 
	
	public static String passagemTela2 () throws Exception {
		String urlMoeda = "";
		Object[] valoresPossiveis = { "De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Yenes", "De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Yenes a Reais", "De Won Coreano a Reais" };
		Object escolhaConversao = JOptionPane.showInputDialog(null, "Escolha a conversão desejada", "Conversor de Moedas", JOptionPane.INFORMATION_MESSAGE,
				null, valoresPossiveis, valoresPossiveis[0]);
		
		if (escolhaConversao == "De Reais a Dólares") {
			
			urlMoeda = "BRL-USD";
			
		} else if (escolhaConversao == "De Reais a Euros" ) {
			
			urlMoeda = "BRL-EUR";
			
		} else if (escolhaConversao == "De Reais a Libras") {
			
			urlMoeda = "BRL-GBP";
			
		} else if (escolhaConversao == "De Reais a Yenes" ) {
			
			urlMoeda = "BRL-JPY";
			
		} else if (escolhaConversao == "De Reais a Won Coreano" ) {
			
			urlMoeda = "BRL-KRW";
			
		} else if (escolhaConversao == "De Dólares a Reais") {
			
			urlMoeda = "USD-BRL";
			
		} else if (escolhaConversao == "De Euros a Reais") {
			
			urlMoeda = "EUR-BRL";
			
		} else if (escolhaConversao == "De Libras a Reais" ) {
			
			urlMoeda = "GBP-BRL";
			
		} else if (escolhaConversao == "De Yenes a Reais") {
			
			urlMoeda = "JPY-BRL";
			
		} else if (escolhaConversao == "De Won Coreano a Reais") {
			
			urlMoeda = "KRW-BRL";

		}
		
		return urlMoeda;
	}
	
	
	public static String nomeMoeda (String urlMoeda) throws Exception {
		
		String nomeMoeda = ServiceCotacao.CotacaoMoeda(urlMoeda).getCodein();
		return nomeMoeda;
	}
	
	public static String nomeMoedaVendida (String urlMoeda) throws Exception {
		
		String nomeMoedaVendida = ServiceCotacao.CotacaoMoeda(urlMoeda).getCode();
		return nomeMoedaVendida;
	}
	
	
	public static double precoVenda (String urlMoeda) throws Exception {
		
		double precoVenda = ServiceCotacao.CotacaoMoeda(urlMoeda).getBid();
		return precoVenda;
	}
	
	public static String printConversao (String nomeMoeda, double valorConvertido, String nomeMoedaVendida, double variacaoMoeda) {
		
		return "Você possui  " + nomeMoeda  + " " + valorConvertido + 
				"\n Cada " + nomeMoedaVendida + " está valendo " + variacaoMoeda + " " + nomeMoeda;
	}
}

