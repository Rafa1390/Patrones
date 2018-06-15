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
}
