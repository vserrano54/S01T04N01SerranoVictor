package Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class MonthList {
	
	ArrayList<Month> lista = new ArrayList<Month>();
	
	public MonthList() {
		
	}
	
	
	
	public ArrayList<Month> insertarMeses() {
		
		this.lista.add(new Month("Enero"));		//Se almacena en la posición 0
		this.lista.add(new Month("Febrero"));	//Se almacena en la posición 1
		this.lista.add(new Month("Marzo"));		//Se almacena en la posición 2
		this.lista.add(new Month("Abril"));		//Se almacena en la posición 3
		this.lista.add(new Month("Mayo"));		//Se almacena en la posición 4
		this.lista.add(new Month("Junio"));		//Se almacena en la posición 5
		this.lista.add(new Month("Julio"));		//Se almacena en la posición 6
		this.lista.add(new Month("Agosto"));		//Se almacena en la posición 7
		this.lista.add(new Month("Septiembre"));	//Se almacena en la posición 8
		this.lista.add(new Month("Octubre"));	//Se almacena en la posición 9
		this.lista.add(new Month("Noviembre"));	//Se almacena en la posición 10
		this.lista.add(new Month("Diciembre"));	//Se almacena en la posición 11
		
		return lista;
		
	}
	
	public Boolean listaNula(List<Month> lista) {
		
		 if (lista == null) 
			 return true;
		 else
			 return false;
	}
	
	public int tamañoLista(List<Month> lista) {
		
		return lista.size();
		
	}
	
	public String consultarMesSegunPosicion(List<Month> lista, int posicion) {
		
		String mes = lista.get(posicion).getMes();
		
		return mes;
		
	}
	

}