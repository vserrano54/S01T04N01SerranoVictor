package Ejercicio2;

public class CalculoDni {
	private String dni;
	
	public CalculoDni() {
		
	}
	
	public CalculoDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public boolean esDnivalido(String dni) {
		boolean bandera= false;
		
		if (validarTamano(dni))
			if (validarNumeroDni(dni))
				if (validarUltimaLetraDni(dni))
					bandera = true;
		
		return bandera;
	}
	
	public boolean validarTamano(String cadena) {
		boolean bandera= false;
		if (cadena.length()== 9)
			bandera = true;
		
		return bandera;
	}
	
	public boolean validarNumeroDni(String cadena) {
		
		return cadena.matches("^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][a-zA-Z]");
	}
	
	public boolean isNumeric(String s)
    {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
	
	public boolean validarUltimaLetraDni(String cadena) {
		boolean bandera= false;
		
		String[] tabla = new String[23];
		tabla[0] = "T";
		tabla[1] = "R";
		tabla[2] = "W";
		tabla[3] = "A";
		tabla[4] = "G";
		tabla[5] = "M";
		tabla[6] = "Y";
		tabla[7] = "F";
		tabla[8] = "P";
		tabla[9] = "D";
		tabla[10] = "X";
		tabla[11] = "B";
		tabla[12] = "N";
		tabla[13] = "J";
		tabla[14] = "Z";
		tabla[15] = "S";
		tabla[16] = "Q";
		tabla[17] = "V";
		tabla[18] = "H";
		tabla[19] = "L";
		tabla[20] = "C";
		tabla[21] = "K";
		tabla[22] = "E";
		
		String Letra = cadena.substring(8,9).toString();
		
		String cad  = cadena.substring(0,8).toString();
		//System.out.println(cad);
		if (isNumeric(cad)==true) {
			
			int resto = Integer.parseInt(cad)%23;
			
			if (resto >= 0 && resto <= 22) {
				
				if (tabla[resto].equalsIgnoreCase(Letra))
					bandera = true;
						
			}
		}
		return bandera;
	}
	
	//Metodos para probar
	
	public int longitud(String cadena) {
		
		return cadena.length();
		
	}
	
	public String ultimaLetraDni(String cadena) {
		int resto=0;
		
		String[] tabla = new String[23];
		tabla[0] = "T";
		tabla[1] = "R";
		tabla[2] = "W";
		tabla[3] = "A";
		tabla[4] = "G";
		tabla[5] = "M";
		tabla[6] = "Y";
		tabla[7] = "F";
		tabla[8] = "P";
		tabla[9] = "D";
		tabla[10] = "X";
		tabla[11] = "B";
		tabla[12] = "N";
		tabla[13] = "J";
		tabla[14] = "Z";
		tabla[15] = "S";
		tabla[16] = "Q";
		tabla[17] = "V";
		tabla[18] = "H";
		tabla[19] = "L";
		tabla[20] = "C";
		tabla[21] = "K";
		tabla[22] = "E";
		
		String cad  = cadena.substring(0,8).toString();
		//System.out.println(cad);
		if (isNumeric(cad)==true) {
			
			resto = Integer.parseInt(cad)%23;
		}
		return tabla[resto];
	}
	
}
