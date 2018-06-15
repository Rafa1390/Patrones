package cr.ac.cenfotec.examen.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.examen.logica.Mesa;

public class MesaTest {

	Mesa mesa = new Mesa();
	
	@Test(expected = Exception.class)
	public void agregarjugadorTest() throws Exception {
		assertEquals(true,mesa.agregarjugador(5));
	}

}
