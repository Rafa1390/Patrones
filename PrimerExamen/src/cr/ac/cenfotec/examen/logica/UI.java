package cr.ac.cenfotec.examen.logica;

public class UI {

	public static void main(String[] args) throws Exception {
		
		Carta carta = new Carta();
		Carta carta1;
		
		carta1 = carta.crearCarta(TipoNombre.SIETE, TipoPalo.ESCUDOS);
		
		System.out.println(carta1.getValor());
	}

}
