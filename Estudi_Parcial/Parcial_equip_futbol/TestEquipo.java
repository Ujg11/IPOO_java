
public class TestEquipo {

	public static void main(String[] args) {
		Jugador todos[]={
				new Jugador(3,new String("Joan"),"defensa central"),
				new Jugador(4,new String("Carles"),"defensa central"),
				new Jugador(5,new String("Joan"),"delantero centro"),
				new Jugador(3,new String("Pep"),"defensa lateral derecho"),
				new Jugador(7,new String("Pep"),"defensa lateral derecho"),
				new Jugador(8,new String("Lluis"),"defensa lateral derecho"),			
		};
		
		Equipo miEquipo= new Equipo();
		for(int i=0; i<todos.length;i++) {
			System.out.println(miEquipo.anadir(todos[i]));
		}
		System.out.println(miEquipo);
		System.out.println("Valor equipo: " + miEquipo.valor());
		System.out.println("Jugador mas valioso: " + miEquipo.jugadorMasValioso());
		System.out.println("Esta completo?: " + miEquipo.estaCompleto());
		System.out.println("Numero jugadores del equipo: " + miEquipo.getNumJugadores());		
		System.out.println();
		
		miEquipo.getJugador(3).actualizarGoles(5);
		miEquipo.getJugador(3).actualizarGoles(2);
		miEquipo.getJugador(7).actualizarGoles(2);
		miEquipo.getJugador(8).actualizarGoles(3);
	
		System.out.println(miEquipo);
		System.out.println("Valor equipo: " + miEquipo.valor());
		System.out.println("Jugador mas valioso: " + miEquipo.jugadorMasValioso());
		System.out.println();
		
		System.out.println("Eliminar jugador dorsal 11: " + miEquipo.eliminar(11));
		System.out.println("Eliminar jugador dorsal 3: " + miEquipo.eliminar(3));
		System.out.println();
	
		System.out.println(miEquipo);
		System.out.println("Valor equipo: " + miEquipo.valor());
		System.out.println("Jugador mas valioso: " + miEquipo.jugadorMasValioso());
		System.out.println();
	
		miEquipo.getJugador(7).actualizarPasesExito(10);
		miEquipo.getJugador(7).actualizarBalonesRecuperados(8);
		miEquipo.getJugador(7).actualizarBalonesPerdidos(2);
		miEquipo.getJugador(8).actualizarPasesExito(1);
		miEquipo.getJugador(8).actualizarBalonesRecuperados(2);
		miEquipo.getJugador(8).actualizarBalonesPerdidos(2);
		miEquipo.getJugador(4).actualizarPasesExito(10);
		miEquipo.getJugador(4).actualizarBalonesRecuperados(8);
		miEquipo.getJugador(4).actualizarBalonesPerdidos(2);
	
		System.out.println(miEquipo);
		System.out.println();		
		
		System.out.println("Valor equipo: " + miEquipo.valor());
		System.out.println("Jugador mas valioso: " + miEquipo.jugadorMasValioso());
		System.out.println();
	}
}
