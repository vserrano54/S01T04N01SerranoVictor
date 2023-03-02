package Ejercicio1;

import java.util.List;

public class Month {
	private String mes;
	
	public Month(String mes) {
		this.mes = mes;
	}
	
	public Month() {
		
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}
	
	

	@Override
	public String toString() {
		return mes;
	}
	
	
}
