package cr.ac.cenfotec.examen.logica;

import java.util.ArrayList;
import java.util.Random;

public class Repartidor {
	
	public static ArrayList<Carta> randomNaipe = new ArrayList<Carta>();
	public static int contaCartas = 52;
	
	public ArrayList<Carta> barajarNaipe() throws Exception{
		Naipe naipeFunc = new Naipe();
		ArrayList<Carta> naipe = naipeFunc.obtenerNaipe();
		Random rdm = new Random();
		
		for(int i = 0; i < naipe.size(); i++) {
			
			int indice = rdm.nextInt(naipe.size());
			randomNaipe.add(naipe.get(indice));
		}
		
		return randomNaipe;
	}
	
	public Carta darCarta(ArrayList<Carta> naipe) throws Exception{
		Carta carta = randomNaipe.get(contaCartas);
		randomNaipe.remove(contaCartas);
		contaCartas--;
		return carta;
	}
}
