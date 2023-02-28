package API;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;

public class Cotacoes {
	
	public static String parse (String responseBody) {
		
		JSONArray cotacoes = new JSONArray(responseBody);
		
		for (int i = 0; i < cotacoes.length(); i++) {
			JSONObject cotacao = cotacoes.getJSONObject(i);
			int nome = cotacao.getInt("name");
			int cotacaoAtual = cotacao.getInt("high");
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://economia.awesomeapi.com.br/json/last/USD-BRL,EUR-BRL,BTC-BRL")).build();
		client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
		.thenApply(HttpResponse::body)
		.thenAccept(System.out::println)
		.join();
	}
}
