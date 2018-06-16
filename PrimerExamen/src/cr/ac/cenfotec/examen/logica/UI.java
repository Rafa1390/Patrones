package cr.ac.cenfotec.examen.logica;

import java.util.ArrayList;
import java.util.Arrays;

public class UI {

	public static void main(String[] args) throws Exception {
		Mesa mesa = new Mesa();
		ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
		Jugador jugadorGanador;
		
		Jugador jugador1 = new Jugador(); jugador1.setNombre("Julio");
		Jugador jugador2 = new Jugador(); jugador2.setNombre("Pedro");
		Jugador jugador3 = new Jugador(); jugador3.setNombre("Juan");
		
		Carta carta1 = new Carta(); carta1.setValor(10);
		Carta carta2 = new Carta(); carta2.setValor(10);
		
		Carta carta3 = new Carta(); carta3.setValor(2);
		Carta carta4 = new Carta(); carta4.setValor(1);
		
		Carta carta5 = new Carta(); carta5.setValor(10);
		Carta carta6 = new Carta(); carta6.setValor(2);
		
		ArrayList<Carta> mano1 = new ArrayList<Carta>(); mano1.addAll(Arrays.asList(carta1,carta2)); jugador1.setMano(mano1);
		ArrayList<Carta> mano2 = new ArrayList<Carta>(); mano2.addAll(Arrays.asList(carta3,carta4)); jugador2.setMano(mano2);
		ArrayList<Carta> mano3 = new ArrayList<Carta>(); mano3.addAll(Arrays.asList(carta5,carta6)); jugador3.setMano(mano3);
		
		listaJugadores.addAll(Arrays.asList(jugador1,jugador2,jugador3));
		jugadorGanador = mesa.recibirManos(listaJugadores);
		System.out.println(jugadorGanador.getNombre());
	}

}
