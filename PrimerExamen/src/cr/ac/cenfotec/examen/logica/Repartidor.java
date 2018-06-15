package cr.ac.cenfotec.examen.logica;

import java.util.ArrayList;
import java.util.Random;

public class Repartidor {
	public ArrayList<Carta> barajarNaipe() throws Exception{
		Naipe naipeFunc = new Naipe();
		ArrayList<Carta> naipe = naipeFunc.obtenerNaipe();
		ArrayList<Carta> randomNaipe = new ArrayList<Carta>();
		Random rdm = new Random();
		
		for(int i = 0; i < naipe.size(); i++) {
			
			int indice = rdm.nextInt(naipe.size());
			randomNaipe.add(naipe.get(indice));
		}
		
		return randomNaipe;
	}
}
