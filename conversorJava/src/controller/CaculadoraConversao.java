package controller;

import API.ServiceCotacao;

public class CaculadoraConversao {
	
	public static double converteMoeda (String urlMoeda, double valor) throws Exception {
		
		double valorConvertido;
		double cotacaoAtual;
		
		cotacaoAtual = ServiceCotacao.CotacaoMoeda(urlMoeda).getBid();
		valorConvertido = Math.round(valor*cotacaoAtual);
		return valorConvertido;				
	}
}
