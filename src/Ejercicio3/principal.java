package Ejercicio3;

import java.util.ArrayList;

public class principal {
	
	public static void main(String args[]) {
		GestionPersona p = new GestionPersona();
		
		ArrayList<Persona> per = new ArrayList<Persona>();
		
	
		
	
		try {
			per =p.ingresarPersona();
			p.validarPosicion(1);
			System.out.println(per.get(1));
			//System.out.println(per.get(0));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}
