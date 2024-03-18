import java.util.Arrays;

public class TestPanell {
	
	public static void mostra (char[][] taula){
		String cadena="";
		for (int i=0;i<5;i++){
			cadena=cadena+Arrays.toString(taula[i])+"\n";
		}
		System.out.println(cadena);
	}

	public static void main(String[] args) {
		Panell d = new Panell();
		char[][] canvis;
		
		System.out.println("Dibuix buit: ");
		System.out.println(d);
		
		canvis=d.canvi(0);
		mostra(canvis);
		
		System.out.println("Dibuix X: ");
		System.out.println(d);
		

		canvis=d.canvi(1);
		mostra(canvis);
		
		System.out.println("Dibuix 1: ");
		System.out.println(d);
		
		canvis=d.canvi(2);
		mostra(canvis);
		System.out.println("Dibuix 2: ");
		System.out.println(d);
		
		canvis=d.canvi(0);
		mostra(canvis);
		System.out.println("Dibuix X: ");
		System.out.println(d);
		
		canvis=d.canvi(2);
		mostra(canvis);
		System.out.println("Dibuix 2: ");
		System.out.println(d);
		
		canvis=d.canvi(1);
		mostra(canvis);
		System.out.println("Dibuix 1: ");
		System.out.println(d);
		
		canvis=d.canvi(0);
		mostra(canvis);
		System.out.println("Dibuix X: ");
		System.out.println(d);
		
		

	}

}
