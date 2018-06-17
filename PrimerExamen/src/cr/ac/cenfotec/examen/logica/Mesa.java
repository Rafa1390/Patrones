package cr.ac.cenfotec.examen.logica;

import java.util.ArrayList;

public class Mesa {
	private Repartidor repartidor = new Repartidor();
	
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
	
	public Jugador recibirManos(ArrayList<Jugador> pJugadores)throws Exception{
		Jugador jugador = new Jugador();
		Jugador jugGan = new Jugador();
		ArrayList<Carta> mano = new ArrayList<Carta>();
		int sumManos = 0, manoMayor = 0;
		
		for(int i = 0; i < pJugadores.size(); i++) {
			jugador = pJugadores.get(i);
			mano = jugador.getMano();
			for(int j = 0; j < mano.size(); j++) {
				sumManos = sumManos + mano.get(j).getValor();
				if(mano.get(j).getValor() == 1) {
					sumManos = 21;
					break;
				}
			}
			if(sumManos == 21) {
				sumManos = 21;
			}
			if(sumManos > manoMayor) {
				manoMayor = sumManos;
				jugGan = jugador;
			}
			sumManos = 0;
		}
		
		return jugGan;
	}
	
	public ArrayList<Carta> verificarCambioDeMano(ArrayList<Carta> pMano)throws Exception{
		Carta cartaAct = new Carta();
		Carta nueCart = new Carta();
		ArrayList<Carta> nueMano = new ArrayList<Carta>();
		
		for(int i = 0; i < pMano.size(); i++) {
			cartaAct = pMano.get(i);
			switch(cartaAct.getNombre()) {
			case JOTA:
			case QUINA:
			case KA:
			case TRES:
				nueCart = repartidor.darCarta();
				nueMano.add(nueCart);
				break;
			default:
				nueMano.add(cartaAct);
				break;
			}
		}
		
		return nueMano;
	}
	
	public ArrayList<Jugador> empezarPartidaDeRon(ArrayList<Jugador> pJugadores)throws Exception{
		Jugador jugador = new Jugador();
		ArrayList<Carta> mano = new ArrayList<Carta>();
		ArrayList<Jugador> jugadoresAct = new ArrayList<Jugador>();
		
		for(int i = 0; i < pJugadores.size(); i++) {
			for(int j = 0; j < 7; j++) {
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
