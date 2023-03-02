package Ejercicio3;

import java.util.ArrayList;

public class GestionPersona {
	
	ArrayList<Persona> persona = new ArrayList<Persona>();
	
	public  ArrayList<Persona> ingresarPersona() {
		
		persona.add(new Persona(1,"Jose", "Lopez", "M",20,"Nicaraguense"));
		persona.add(new Persona(2,"Davi", "Serrano", "M",11,"Nicaraguense"));
		persona.add(new Persona(3,"Jennifer", "Lopez", "F",12,"Nicaraguense"));
		persona.add(new Persona(4,"Mauricio", "Cruz", "M",28,"Nicaraguense"));
		persona.add(new Persona(5,"Sergio", "Serrano", "M",38,"Nicaraguense"));
		
		return persona;
		
	}
	
	public  boolean validarPosicion(int posicion) {
		
		if (posicion < 0) {
			throw new IndexOutOfBoundsException("Posición " + posicion +" esta fuera de rango, la posicion es negativa");
		}
		else if (posicion > persona.size()) {
			throw new IndexOutOfBoundsException("Posición " + posicion +" esta fuera de rango, la posicion es superior al tamaño de la lista");
		}
		
		return true;
		
	}
	
	public  void consultarPersona(int posicion) {
		
		try {
			
			if (validarPosicion(posicion)==true)
				System.out.println("La persona consultada es: " + persona.get(posicion));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
