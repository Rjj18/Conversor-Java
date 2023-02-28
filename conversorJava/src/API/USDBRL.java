package API;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class USDBRL {
	
	String code;
	String codein;
	String name;
	String high;
	String low;
	String varbid;
	String pctChange;
	String bid;
	String ask;
	String timestamp;
	String create_date;
	

	public String getCode() {
		return code;
	}
	public String getCodein() {
		return codein;
	}
	public String getName() {
		return name;
	}
	public String getHigh() {
		return high;
	}
	public String getLow() {
		return low;
	}
	public String getVarbid() {
		return varbid;
	}
	public String getPctChange() {
		return pctChange;
	}
	public String getBid() {
		return bid;
	}
	public String getAsk() {
		return ask;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public String getCreate_date() {
		return create_date;
	}

}