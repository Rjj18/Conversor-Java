package API;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpRequest;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class ServiceCotacao {
	
	static String servicoWeb = "https://economia.awesomeapi.com.br/json/";
	static int statusConexao = 200;
	private static Moeda newMoeda;
	
	public static Moeda CotacaoMoeda (String moeda) throws Exception {
		
		String urlCotacao = servicoWeb + moeda;
		
		URL url = new URL(urlCotacao);	
		HttpsURLConnection conexao = (HttpsURLConnection) url.openConnection();
		conexao.setRequestMethod("GET");

        try {
            InputStream is = conexao.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String co = "";
            List<String> jsonCoin = new ArrayList<String>();            
            while((co = br.readLine()) != null){
                jsonCoin.add(co);
            }
            
            String singleString = jsonCoin.toString().replaceAll("[\\[\\]]","");
            Moeda coinJson = new Gson().fromJson(singleString, Moeda.class);
            newMoeda = new Moeda(coinJson.getCodein(),coinJson.getBid(),coinJson.getCode());
            return newMoeda;
            
        } catch (Exception e) {
            throw new Exception("ERRO: " + e.getMessage());
        }
	
		
	}
	
}