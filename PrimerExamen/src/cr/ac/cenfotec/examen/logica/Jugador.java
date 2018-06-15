package cr.ac.cenfotec.examen.logica;

import java.util.ArrayList;

public class Jugador {
	private String nombre;
	private ArrayList<Carta> mano = new ArrayList<Carta>();
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Carta> getMano() {
		return mano;
	}
	
	public void setMano(ArrayList<Carta> mano) {
		this.mano = mano;
	}
}
