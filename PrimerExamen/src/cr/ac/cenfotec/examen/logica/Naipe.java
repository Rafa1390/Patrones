package cr.ac.cenfotec.examen.logica;

import java.util.ArrayList;

public class Naipe {
	ArrayList<Carta> naipe = new ArrayList<Carta>();
	
	public ArrayList<Carta> obtenerNaipe() throws Exception {
		Carta carta = new Carta();
		
		for(TipoPalo palo : TipoPalo.values()) {
			for(TipoNombre nombre : TipoNombre.values()) {
				carta = carta.crearCarta(nombre, palo);
				naipe.add(carta);
			}
		}
		
		return naipe;
	}
}