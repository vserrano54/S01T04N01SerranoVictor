package Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class CalculoDniTest {
	
	/*
	03543552B
	52094514C
	43741903C
	10148208X
	18313904Q
	12397609B
	44250545V
	05463908M
	10003376D
	91604488L
	*/
	ArrayList<String> dni = new ArrayList<String>();
	ArrayList<String> letra = new ArrayList<String>();
	
	CalculoDni validarDni = new CalculoDni();
	public void InsertarDni() {
		this.dni.add("03543552B");
		this.dni.add("52094514C");
		this.dni.add("43741903C");
		this.dni.add("10148208X");
		this.dni.add("18313904Q");
		this.dni.add("12397609B");
		this.dni.add("44250545V");
		this.dni.add("05463908M");
		this.dni.add("10003376D");
		this.dni.add("91604488L");
	}
	
	public void InsertarLetraDni() {
		this.letra.add("B");
		this.letra.add("C");
		this.letra.add("C");
		this.letra.add("X");
		this.letra.add("Q");
		this.letra.add("B");
		this.letra.add("V");
		this.letra.add("M");
		this.letra.add("D");
		this.letra.add("L");
		
	}
	
	@Test
	void testvalidarTamano() {
		InsertarDni();
		
		for (int i=0;i<this.dni.size();i++) {
			
			assertEquals(9, validarDni.longitud(this.dni.get(i)));
			
		}
	}
	
	@Test
	void testvalidarNumeroDni() {
		InsertarDni();
		
		for (int i=0;i<this.dni.size();i++) {
			
			assertEquals(true, validarDni.validarNumeroDni(this.dni.get(i)));
				
		}
	}
	
	@Test
	void testUltimaLetraDni() {
		InsertarDni();
		InsertarLetraDni();
		
		for (int i=0;i<this.dni.size();i++) {
			
			assertEquals(this.letra.get(i), validarDni.ultimaLetraDni(this.dni.get(i)));
			
		}
	}	
	
	@Test
	void esDnivalido() {
		InsertarDni();
		InsertarLetraDni();
		
		for (int i=0;i<this.dni.size();i++) {
		
			assertEquals(true, validarDni.esDnivalido(this.dni.get(i)));
			
		}
	}	

}
