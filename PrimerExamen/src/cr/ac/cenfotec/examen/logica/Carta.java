package cr.ac.cenfotec.examen.logica;

public class Carta {
	private TipoNombre nombre;
	private TipoPalo palo;
	private int valor;
	
	public GeneradorValores genNum = new GeneradorValores();
	
	public Carta(){
		
	}
	
	public Carta(TipoNombre nombre, TipoPalo palo, int valor) {
		super();
		this.nombre = nombre;
		this.palo = palo;
		this.valor = valor;
	}
	
	public TipoNombre getNombre() {
		return nombre;
	}

	public void setNombre(TipoNombre nombre) {
		this.nombre = nombre;
	}

	public TipoPalo getPalo() {
		return palo;
	}

	public void setPalo(TipoPalo palo) {
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Carta crearCarta(TipoNombre nombre, TipoPalo palo) throws Exception{
		int valor = genNum.obtenerValor(nombre);
		Carta carta = new Carta(nombre, palo, valor);
		return carta;
	}
	
	
	
}
