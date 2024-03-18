
public class Jugador {
	// Atributs d'objecte
	private int dorsal;
	private String nombre;
	private String posicionIdeal;
	private int goles;
	private int pasesExito;
	private int balonesPerdidos;
	private int balonesrecuperados;
	
	// Atributs de classe
	private static int VALOR_GOL = 5;
	private static int VALOR_PASE = 2;
	private static int VALOR_RECUPERACION = 3;
	private static int PENALIZACION_PERDIDO = 2;

	// Constructors
	public Jugador(int dorsal, String nom, String posicionIdeal) {
		super();
		this.dorsal = dorsal;
		this.nombre = nom;
		this.posicionIdeal = posicionIdeal;
		this.goles = 0;
		this.pasesExito = 0;
		this.balonesPerdidos = 0;
		this.balonesrecuperados = 0;
	}

	// Getters i setters d'objecte
	public int getDorsal() {
		return dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nom) {
		this.nombre = nom;
	}
	
	public String getPosicionIdeal() {
		return posicionIdeal;
	}

	public void setPosicionIdeal(String posicionIdeal) {
		this.posicionIdeal = posicionIdeal;
	}


	public int getGoles() {
		return goles;
	}

	public int getPasesExito() {
		return pasesExito;
	}

	public int getBalonesPerdidos() {
		return balonesPerdidos;
	}

	public int getBalonesrecuperados() {
		return balonesrecuperados;
	}

	// Getters i setters de classe
	public static int getVALOR_GOL() {
		return VALOR_GOL;
	}

	public static void setVALOR_GOL(int v) {
		VALOR_GOL = v;
	}

	public static int getVALOR_PASE() {
		return VALOR_PASE;
	}

	public static void setVALOR_PASE(int v) {
		VALOR_PASE = v;
	}

	public static int getVALOR_RECUPERACION() {
		return VALOR_RECUPERACION;
	}

	public static void setVALOR_RECUPERACION(int v) {
		VALOR_RECUPERACION = v;
	}

	public static int getPENALIZACION_PERDIDO() {
		return PENALIZACION_PERDIDO;
	}

	public static void setPENALIZACION_PERDIDO(int p) {
		PENALIZACION_PERDIDO = p;
	}

	// Metodes especifics d'objecte
	public void actualizarGoles(int goles) {
		this.goles += goles;
	}
	
	public void actualizarPasesExito(int pasesExito) {
		this.pasesExito += pasesExito;
	}
	
	public void actualizarBalonesPerdidos(int balonesPerdidos) {
		this.balonesPerdidos += balonesPerdidos;
	}
	
	public void actualizarBalonesRecuperados(int balonesRecuperados) {
		this.balonesrecuperados += balonesRecuperados;
	}
	
	public int puntuacion() {
		return getGoles()*getVALOR_GOL() + getPasesExito()*getVALOR_PASE() + 
			   getBalonesrecuperados()*getVALOR_RECUPERACION() - 
			   getBalonesPerdidos()*getPENALIZACION_PERDIDO();
	}

	// Metode toString
	public String toString() {
		return "Jugador [\n\t dorsal=" + dorsal + 
				",\n\t nom=" + nombre + 
				",\n\t posicionIdeal=" + posicionIdeal + 
				",\n\t goles=" + goles + 
				",\n\t pasesExito=" + pasesExito + 
				",\n\t balonesPerdidos=" + balonesPerdidos + 
				",\n\t balonesrecuperados=" + balonesrecuperados + 
				",\n\t puntuacion()=" + puntuacion() + "\n]";
	}
	
	// Metode equals
	public boolean equals(Jugador j) {
		return this.dorsal == j.dorsal && this.nombre.equals(j.nombre);
	}	
}
