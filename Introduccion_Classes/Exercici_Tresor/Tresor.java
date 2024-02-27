package Exercicis_repo.Introduccion_Classes.Exercici_Tresor.Exercici_Tresor;

public class Tresor {
	public String descripcio;
	public int altura;
	public double valoracio;
	public static double limitValuos = 100;

	public Tresor(String descrip, int altura, double valor)
	{
		this.descripcio = descrip;
		this.altura = altura;
		this.valoracio = valor;
	}

	public void actualitzaTresor(String descrip, double valor)
	{
		this.descripcio = descrip;
		this.valoracio = valor;
	}

	public boolean esValuos()
	{
		if (this.valoracio >= limitValuos)
			return (true);
		return (false);
	}

	public void printTresor()
	{
		System.out.println("Descripció: " + descripcio);
		System.out.println("Altura: " + altura);
		System.out.println("Valoració: " + valoracio);
	}
}

