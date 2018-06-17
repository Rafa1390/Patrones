package cr.ac.cenfotec.examen.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import cr.ac.cenfotec.examen.logica.Carta;
import cr.ac.cenfotec.examen.logica.Jugador;
import cr.ac.cenfotec.examen.logica.Mesa;
import cr.ac.cenfotec.examen.logica.TipoNombre;

public class MesaTest {

	Mesa mesa = new Mesa();
	
	@Test(expected = Exception.class)
	public void agregarjugadorTest() throws Exception {
		assertEquals(true,mesa.agregarjugador(5));
	}
	
	@Test
	public void empezarAJugar21Test() throws Exception{
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
	
	@Test
	public void recibirManosTest() throws Exception{
		ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
		Jugador jugadorGanador;
		
		Jugador jugador1 = new Jugador(); jugador1.setNombre("Julio");
		Jugador jugador2 = new Jugador(); jugador2.setNombre("Pedro");
		Jugador jugador3 = new Jugador(); jugador3.setNombre("Juan");
		
		Carta carta1 = new Carta(); carta1.setValor(4); Carta carta2 = new Carta(); carta2.setValor(5);		
		Carta carta3 = new Carta(); carta3.setValor(10); Carta carta4 = new Carta(); carta4.setValor(10);	
		Carta carta5 = new Carta(); carta5.setValor(3); Carta carta6 = new Carta(); carta6.setValor(2);
		
		ArrayList<Carta> mano1 = new ArrayList<Carta>(); mano1.addAll(Arrays.asList(carta1,carta2)); jugador1.setMano(mano1);
		ArrayList<Carta> mano2 = new ArrayList<Carta>(); mano2.addAll(Arrays.asList(carta3,carta4)); jugador2.setMano(mano2);
		ArrayList<Carta> mano3 = new ArrayList<Carta>(); mano3.addAll(Arrays.asList(carta5,carta6)); jugador3.setMano(mano3);
		
		listaJugadores.addAll(Arrays.asList(jugador1,jugador2,jugador3));
		jugadorGanador = mesa.recibirManos(listaJugadores);
		
		assertEquals(jugador2.getNombre(),jugadorGanador.getNombre());
	}
	
	@Test
	public void recibirManosTest2() throws Exception{
		ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
		Jugador jugadorGanador;
		
		Jugador jugador1 = new Jugador(); jugador1.setNombre("Julio");
		Jugador jugador2 = new Jugador(); jugador2.setNombre("Pedro");
		Jugador jugador3 = new Jugador(); jugador3.setNombre("Juan");
		
		Carta carta1 = new Carta(); carta1.setValor(4); Carta carta2 = new Carta(); carta2.setValor(5);		
		Carta carta3 = new Carta(); carta3.setValor(10); Carta carta4 = new Carta(); carta4.setValor(10);	
		Carta carta5 = new Carta(); carta5.setValor(1); Carta carta6 = new Carta(); carta6.setValor(2);
		
		ArrayList<Carta> mano1 = new ArrayList<Carta>(); mano1.addAll(Arrays.asList(carta1,carta2)); jugador1.setMano(mano1);
		ArrayList<Carta> mano2 = new ArrayList<Carta>(); mano2.addAll(Arrays.asList(carta3,carta4)); jugador2.setMano(mano2);
		ArrayList<Carta> mano3 = new ArrayList<Carta>(); mano3.addAll(Arrays.asList(carta5,carta6)); jugador3.setMano(mano3);
		
		listaJugadores.addAll(Arrays.asList(jugador1,jugador2,jugador3));
		jugadorGanador = mesa.recibirManos(listaJugadores);
		
		assertEquals(jugador3.getNombre(),jugadorGanador.getNombre());
	}
	
	@Test
	public void recibirManosTest3() throws Exception{
		ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
		Jugador jugadorGanador;
		
		Jugador jugador1 = new Jugador(); jugador1.setNombre("Julio");
		Jugador jugador2 = new Jugador(); jugador2.setNombre("Pedro");
		Jugador jugador3 = new Jugador(); jugador3.setNombre("Juan");
		
		Carta carta1 = new Carta(); carta1.setValor(10); Carta carta2 = new Carta(); carta2.setValor(1);		
		Carta carta3 = new Carta(); carta3.setValor(2); Carta carta4 = new Carta(); carta4.setValor(10);	
		Carta carta5 = new Carta(); carta5.setValor(2); Carta carta6 = new Carta(); carta6.setValor(2);
		
		ArrayList<Carta> mano1 = new ArrayList<Carta>(); mano1.addAll(Arrays.asList(carta1,carta2)); jugador1.setMano(mano1);
		ArrayList<Carta> mano2 = new ArrayList<Carta>(); mano2.addAll(Arrays.asList(carta3,carta4)); jugador2.setMano(mano2);
		ArrayList<Carta> mano3 = new ArrayList<Carta>(); mano3.addAll(Arrays.asList(carta5,carta6)); jugador3.setMano(mano3);
		
		listaJugadores.addAll(Arrays.asList(jugador1,jugador2,jugador3));
		jugadorGanador = mesa.recibirManos(listaJugadores);
		
		assertEquals(jugador1.getNombre(),jugadorGanador.getNombre());
	}
	
	@Test
	public void verificarCambioDeManoTest()throws Exception{
		Carta carta1 = new Carta(); carta1.setNombre(TipoNombre.QUINA); 
		Carta carta2 = new Carta(); carta2.setNombre(TipoNombre.AS);
		ArrayList<Carta> manoAct = new ArrayList<Carta>(); manoAct.addAll(Arrays.asList(carta1,carta2));
		
		ArrayList<Carta> nueMano = mesa.verificarCambioDeMano(manoAct);
		Carta nueCart1 = nueMano.get(0);
		Carta nueCart2 = nueMano.get(1);
		
		assertFalse(carta1.getNombre() == nueCart1.getNombre());
		assertTrue(carta2.getNombre() == nueCart2.getNombre());
	}
	
	@Test
	public void empezarPartidaDeRonTest() throws Exception{
		ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
		ArrayList<Jugador> jugadoresTest;
		
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		Jugador jugador3 = new Jugador();
		
		jugador1.setNombre("Julio");
		jugador2.setNombre("Pedro");
		jugador3.setNombre("Juan");
		
		listaJugadores.addAll(Arrays.asList(jugador1,jugador2,jugador3));
		jugadoresTest = mesa.empezarPartidaDeRon(listaJugadores);
		int tamMano = jugadoresTest.get(2).getMano().size();
		assertEquals(7,tamMano);
	}
}
