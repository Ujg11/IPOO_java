package Exercicis_repo.Introduccion_Classes.Exercici_Tresor.Exercici_Tresor;
import java.util.Scanner;
//import Sessio_2.Exercici_Tresor.Tresor;

public class TestTresor {
	public static void main(String[] argv)
	{
		Scanner scan = new Scanner(System.in);
		String descripcio;
		int altura;
		double valoracio;
		Tresor tresor;

		System.out.println("Introdueix la descripció del tresor:");
		descripcio = scan.next();
		System.out.println("Introdueix l'altura:");
		altura = scan.nextInt();
		System.out.println("Introdueix la valoració");
		valoracio = scan.nextDouble();
		tresor = new Tresor(descripcio, altura, valoracio);
		tresor.printTresor();

		System.out.println("Introdueix la nova descripció: ");
		tresor.descripcio = scan.next();
		System.out.println("Introdueix la nova valoració: ");
		tresor.valoracio = scan.nextDouble();
		tresor.printTresor();

		scan.close();
	}
}
