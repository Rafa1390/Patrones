package cr.ac.cenfotec.examen.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import cr.ac.cenfotec.examen.logica.Carta;
import cr.ac.cenfotec.examen.logica.Jugador;
import cr.ac.cenfotec.examen.logica.Mesa;

public class MesaTest {

	Mesa mesa = new Mesa();
	ArrayList<Jugador> listaJugadores;
	
	@Test(expected = Exception.class)
	public void agregarjugadorTest() throws Exception {
		assertEquals(true,mesa.agregarjugador(5));
	}
	
	@Test
	public void empezarAJugar21Test() throws Exception{
		Mesa mesa = new Mesa();
		ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
		
		ArrayList<Jugador> jugadoresTest;
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		Jugador jugador3 = new Jugador();
		
		jugador1.setNombre("Julio");
		jugador2.setNombre("Pedro");
		jugador3.setNombre("Juan");
		listaJugadores.addAll(Arrays.asList(jugador1,jugador2,jugador3));
		jugadoresTest = mesa.empezarAJugar21(listaJugadores);
		int tamMano = jugadoresTest.get(2).getMano().size();
		assertEquals(2,tamMano);
	}
}
