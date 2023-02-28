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

public class CotacoesGson {
	
	public static void main(String[] args) throws Exception {
		
		URL cotacao = new URL("https://economia.awesomeapi.com.br/json/USD-BRL");	
		HttpsURLConnection conexao = (HttpsURLConnection) cotacao.openConnection();
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

            USDBRL coinJson = new Gson().fromJson(singleString, USDBRL.class);
            
            System.out.println(coinJson.getName());

 
        } catch (Exception e) {
            throw new Exception("ERRO: " + e.getMessage());
        }
	
		
	}
}