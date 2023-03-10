package API;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Moeda {
	
	String code;
	String codein;
	String name;
	double bid;
	
	public Moeda (String codein, double bid, String code) {
		this.codein = codein;
		this.bid = bid;
		this.code = code;
	}
	

	public String getCode() {
		return code;
	}
	public String getCodein() {
		return codein;
	}
	public String getName() {
		return name;
	}
	public double getBid() {
		return bid;
	}
	
	@Override
	public String toString() {
		return "Moeda: " + codein +
	"\nValor: " + bid;
		
	}
}