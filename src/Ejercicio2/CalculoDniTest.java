package Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculoDniTest {
	

	CalculoDni validarDni = new CalculoDni();
	
	@ParameterizedTest
    @CsvSource({"03543552B","52094514C","43741903C","10148208X","18313904Q","12397609B","44250545V","05463908M","10003376D","91604488L"})
	void testvalidarTamano(String valorEntrada) {
		
		int ValorEsperado= 9;
			
		assertEquals(validarDni.longitud(valorEntrada), ValorEsperado);
			
	}
	
	@ParameterizedTest
    @CsvSource({"03543552B","52094514C","43741903C","10148208X","18313904Q","12397609B","44250545V","05463908M","10003376D","91604488L"})
	void testvalidarNumeroDni(String valorEntrada) {
		
		
		boolean valorEsperado = true;
			
			assertEquals(validarDni.validarNumeroDni(valorEntrada), valorEsperado);
	}
	
	
	@ParameterizedTest
    @CsvSource({"03543552B,B","52094514C,C","43741903C,C","10148208X,X","18313904Q,Q","12397609B,B","44250545V,V","05463908M,M","10003376D,D","91604488L,L"})
	void testUltimaLetraDni(String valorEntrada, String valorEsperado) {
		
			assertEquals(validarDni.ultimaLetraDni(valorEntrada), valorEsperado);
			
	}
	
	@ParameterizedTest
    @CsvSource({"03543552B","52094514C","43741903C","10148208X","18313904Q","12397609B","44250545V","05463908M","10003376D","91604488L"})
	void esDnivalido(String valorEntrada) {
			
			boolean valorEsperado = true;
		
			assertEquals(validarDni.esDnivalido(valorEntrada),valorEsperado);
			
	}	
	
}


