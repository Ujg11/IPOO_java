
public class TestJugador {

	public static void main(String[] args) {
		Jugador j1 = new Jugador(3,new String("Joan"),"defensa central");
		Jugador j2 = new Jugador(3,new String("Joan"),"defensa central");
		Jugador j3 = new Jugador(5,new String("Joan"),"delantero centro");
		Jugador j4 = new Jugador(3,new String("Pep"),"defensa lateral derecho");
		
		Jugador j5 = new Jugador(3, "Hola", "aA");
		Jugador j6 = new Jugador(3, "Hola", "dfn");


		System.out.println("j1: " + j1);
		System.out.println("j2: " + j2);
		System.out.println("j3: " + j3);
		System.out.println("j4: " + j4);
		System.out.println();
		
		System.out.println("Son iguales j1 y j2? " + j1.equals(j2));
		System.out.println("Son iguales j1 y j3? " + j3.equals(j2));
		System.out.println("Son iguales j1 y j4? " + j3.equals(j2));
		System.out.println("Son iguales j1 y j4? " + j5.equals(j6));
		System.out.println();
		
		j1.actualizarGoles(1);
		j1.actualizarPasesExito(10);
		j1.actualizarBalonesRecuperados(5);
		j1.actualizarBalonesPerdidos(3);
		System.out.println("j1: " + j1);			
		System.out.println();
	}

}
