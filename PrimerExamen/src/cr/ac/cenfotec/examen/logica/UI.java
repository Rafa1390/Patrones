package cr.ac.cenfotec.examen.logica;

import java.util.ArrayList;
import java.util.Arrays;

public class UI {

	public static void main(String[] args) throws Exception {
		Mesa mesa = new Mesa();
		ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
		Jugador jugador = new Jugador();
		ArrayList<Carta> mano = new ArrayList<Carta>();
		
		ArrayList<Jugador> jugadoresTest;
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		Jugador jugador3 = new Jugador();
		
		jugador1.setNombre("Julio");
		jugador2.setNombre("Pedro");
		jugador3.setNombre("Juan");
		listaJugadores.addAll(Arrays.asList(jugador1,jugador2,jugador3));
		jugadoresTest = mesa.empezarAJugar21(listaJugadores);
		
		for(int i = 0; i < jugadoresTest.size(); i++) {
			jugador = jugadoresTest.get(i);
			mano = jugador.getMano();
			for(int j = 0; j < mano.size(); j++) {
				System.out.println(mano.get(j).getNombre() + " " + mano.get(j).getPalo() + " " + mano.get(j).getValor());
			}
			
		}
		
		//System.out.println(jugadoresTest.get(2).getMano().size());
	}

}
