package cr.ac.cenfotec.examen.logica;

public class GeneradorValores {
	public int obtenerValor(TipoNombre nombre) throws Exception{
		int numero = 0;
		
		switch(nombre) {
		case AS:
			numero = 1;
			break;
		case DOS:
			numero = 2;
			break;
		case TRES:
			numero = 3;
			break;
		case CUATRO:
			numero = 4;
			break;
		case CINCO:
			numero = 5;
			break;
		case SEIS:
			numero = 6;
			break;
		case SIETE:
			numero = 7;
			break;
		case OCHO:
			numero = 8;
			break;
		case NUEVE:
			numero = 9;
			break;
		case DIEZ:
		case JOTA:
		case QUINA:
		case KA:
			numero = 10;
			break;
		}
		
		return numero;
	}
}
