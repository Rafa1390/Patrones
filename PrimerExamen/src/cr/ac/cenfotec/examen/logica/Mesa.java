package cr.ac.cenfotec.examen.logica;

import java.util.ArrayList;

public class Mesa {
	private Repartidor repartidor = new Repartidor();
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public boolean agregarjugador(int cantJugadores) throws Exception{
		if(cantJugadores > 4 || cantJugadores <= 0) {
			throw new Exception("Solo pueden haber 4 jugadores en la mesa");
		}else {
			return true;
		}
	}
	
	public ArrayList<Jugador> empezarAJugar21(ArrayList<Jugador> pJugadores)throws Exception{
		Jugador jugador = new Jugador();
		ArrayList<Carta> mano = new ArrayList<Carta>();
		ArrayList<Jugador> jugadoresAct = new ArrayList<Jugador>();
		
		for(int i = 0; i < pJugadores.size(); i++) {
			for(int j = 0; j < 2; j++) {
				jugador = pJugadores.get(i);
				mano = jugador.getMano();
				mano.add(repartidor.darCarta());
				jugador.setMano(mano);
			}
			jugadoresAct.add(jugador);
		}
		return jugadoresAct;
	}
}
