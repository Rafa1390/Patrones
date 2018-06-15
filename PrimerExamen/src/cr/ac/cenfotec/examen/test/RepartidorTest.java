package cr.ac.cenfotec.examen.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;

import org.junit.Test;

import cr.ac.cenfotec.examen.logica.Carta;
import cr.ac.cenfotec.examen.logica.Naipe;
import cr.ac.cenfotec.examen.logica.Repartidor;

public class RepartidorTest {

	Repartidor repartidor = new Repartidor();
	Naipe naipe = new Naipe();
	
	@Test
	public void barajarNaipeTest()throws Exception {
		ArrayList<Carta> naipeRdm = repartidor.barajarNaipe();
		assertEquals(52, naipeRdm.size());
	}
	
	@Test
	public void barajarNaipeTest2()throws Exception {
		ArrayList<Carta> naipeRdm = repartidor.barajarNaipe();
		ArrayList<Carta> listCarts = naipe.obtenerNaipe();
		int valor1 = naipeRdm.get(5).getValor();
		int valor2 = listCarts.get(5).getValor();
		boolean comp = valor1 == valor2;
		
		assertFalse(comp);
	}

}
