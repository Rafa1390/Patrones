package cr.ac.cenfotec.examen.test;

import static org.junit.Assert.*;
import org.junit.Test;

import cr.ac.cenfotec.examen.logica.Carta;
import cr.ac.cenfotec.examen.logica.TipoNombre;
import cr.ac.cenfotec.examen.logica.TipoPalo;

public class CartaTest {

	@Test
	public void crearCartaTest() throws Exception {
		Carta cartTest = new Carta(TipoNombre.SIETE, TipoPalo.ESCUDOS, 7);
		assertEquals(cartTest.getValor(), cartTest.crearCarta(TipoNombre.SIETE, TipoPalo.ESCUDOS).getValor());
	}

}
