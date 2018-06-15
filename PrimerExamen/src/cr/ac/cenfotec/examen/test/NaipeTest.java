package cr.ac.cenfotec.examen.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import cr.ac.cenfotec.examen.logica.Carta;
import cr.ac.cenfotec.examen.logica.Naipe;

public class NaipeTest {
	Naipe naipe = new Naipe();
	ArrayList<Carta> lista = new ArrayList<Carta>();
	
	@Test
	public void obtenerNaipeTest() throws Exception {
		assertEquals(52, naipe.obtenerNaipe().size());
	}

}
