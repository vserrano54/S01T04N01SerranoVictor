package Ejercicio3;

import org.junit.Test;

public class GestionPersonaTest {
		
	
	
	@Test(expected = RuntimeException.class)
	    public void validarRangoNegativo(){
		 
		GestionPersona p = new GestionPersona(); 
		System.out.println("Se consulta una posicion negativa para ver el tratamiento del error");
		p.ingresarPersona();
		p.consultarPersona(-1);
	 	System.out.println();
		 
	 }

	 @Test(expected = RuntimeException.class)
	    public void validarRangoSuperior(){
		 
		 	GestionPersona p = new GestionPersona(); 
		 	System.out.println("Se consulta una posicion superior al tamaño de la lista para ver el tratamiento del error");
			p.ingresarPersona();
			p.consultarPersona(6);
		 	System.out.println();
	    }
	    

}
