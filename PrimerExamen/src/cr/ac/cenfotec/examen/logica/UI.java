package cr.ac.cenfotec.examen.logica;

import java.util.ArrayList;

public class UI {

	public static void main(String[] args) throws Exception {
		
		/*Carta carta = new Carta();
		Carta carta1;
		
		carta1 = carta.crearCarta(TipoNombre.SIETE, TipoPalo.ESCUDOS);
		
		System.out.println(carta1.getValor());*/
		
		Naipe naipe = new Naipe();
		ArrayList<Carta> lista = new ArrayList<Carta>();
		
		lista = naipe.obtenerNaipe();
		
		System.out.println(lista.get(51).getNombre() + " " + lista.get(51).getPalo());
	}

}
