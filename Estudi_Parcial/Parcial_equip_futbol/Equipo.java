
public class Equipo {
	// Atributs d'objecte
	private Jugador[] jugadores;
	private int numJugadores;
	
	// Atributs de classe
	private static int MAXIMO_NUM_JUGADORES = 25;
	
	// Constructors
	public Equipo() {
		this.jugadores = new Jugador[MAXIMO_NUM_JUGADORES];
		this.numJugadores = 0;
	}

	// Getters i setters d'objecte
	public int getNumJugadores() {
		return numJugadores;
	}
	
	// Getters i setters de classe
	public static int getMAXIMO_NUM_JUGADORES() {
		return MAXIMO_NUM_JUGADORES;
	}

	public static void setMAXIMO_NUM_JUGADORES(int max) {
		MAXIMO_NUM_JUGADORES = max;
	}

	// Metodes especifics d'objecte
	public boolean estaCompleto() {
		return getNumJugadores()==getMAXIMO_NUM_JUGADORES();
	}
	
	public Jugador getJugador(int dorsal) {
		for(int i=0; i<getNumJugadores(); i++)
		{
			if(this.jugadores[i].getDorsal() == dorsal)
				return this.jugadores[i];
		}
		return null;
	}
	
	public boolean anadir(Jugador j) {
		if(estaCompleto())
			return false;
		if(getJugador(j.getDorsal()) != null)
			return false;
		this.jugadores[numJugadores] = j; // = new Jugador(j);
		numJugadores++;
		return true;
	}
	
	public boolean eliminar(int dorsal) {
		for(int i=0; i<getNumJugadores(); i++) {
			if(this.jugadores[i].getDorsal()== dorsal) {
				return eliminarPosicion(i);
			}
		}
		return false;
	}

	private boolean eliminarPosicion(int pos) {
		if(pos >= numJugadores)
			return false;
		for(int i = pos; i < numJugadores - 1; i++)
		{
			jugadores[i] = jugadores[i+1]; 
		}
		numJugadores--;
		jugadores[numJugadores] = null;
		return true;
	}
	
	public Jugador jugadorMasValioso() {
		if(numJugadores==0)
			return null;
		Jugador jugadorMasValioso = jugadores[0];
		for(int i=1; i<numJugadores; i++) {
			if(jugadores[i].puntuacion() > jugadorMasValioso.puntuacion())
			{
				jugadorMasValioso = jugadores[i];
			}
		}
		return jugadorMasValioso;
	}
	
	public int valor() {
		int sumaPuntos = 0;
		for(int i=0; i<numJugadores; i++) {
			sumaPuntos += jugadores[i].puntuacion();
		}
		return sumaPuntos;
	}

	// Metode toString
	public String toString() {
		String s ="Equipo = [";
		for(int i=0; i<numJugadores-1; i++) {
			s += "\n" + jugadores[i] + ",";
		}
		if(numJugadores>0) s += "\n" + jugadores[numJugadores-1] + "\n";
		return s + "]";
	}	
	
}
