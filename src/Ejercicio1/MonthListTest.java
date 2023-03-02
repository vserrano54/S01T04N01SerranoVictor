package Ejercicio1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class MonthListTest {

	MonthList lista = new MonthList();
    ArrayList<Month> meses;
	
	@Test
	public void testListaNula() {
		
		meses = new ArrayList<Month>(lista.insertarMeses());
		assertNotNull("La lista es nula",meses);
	}

	@Test
	public void testTamañoLista() {
		
		meses = new ArrayList<Month>(lista.insertarMeses());
		assertEquals(12, meses.size());
		
	}

	@Test
	public void testConsultarMesSegunPosicion() {
		meses = new ArrayList<Month>(lista.insertarMeses());
		assertNotEquals("Agosto", meses.get(8).toString() );
		/*
		Esta condición es verdadera por que la posición 8 no contiene al mes de agosto, 
		ya que las listas inician desde la posición 0, por lo tanto agosto
		 se encuentra en la posición 7
		 */
	}

}
