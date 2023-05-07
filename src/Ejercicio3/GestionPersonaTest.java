package Ejercicio3;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class GestionPersonaTest {
		
	@ParameterizedTest
	@ValueSource(ints = {4,6})
	public void testConsultarPersona(int indice){
		
		GestionPersona gestionPersona = new GestionPersona();
		
		PosicionInvalida exception = assertThrows(PosicionInvalida.class, () -> {
			gestionPersona.consultarPersona(indice);
		});
		
		assertEquals(exception.getMessage(), "Posición " +indice+  " esta fuera de rango");
		
		
	}
	
}
