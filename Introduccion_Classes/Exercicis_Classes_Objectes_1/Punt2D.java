package Sessio_2.Exercicis_Classes_Objectes_1;


public class Punt2D {
	public double x;
	public double y;

	public Punt2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double distanciaX(Punt2D punt)
	{
		double distancia;

		distancia = this.x - punt.x;
		if (distancia >= 0)
			return (distancia);
		else
			return (distancia * -1);
	}
	
	public double distanciaY(Punt2D punt)
	{
		double distancia;

		distancia = this.y - punt.y;
		if (distancia >= 0)
			return (distancia);
		else
			return (distancia * -1);
	}

	public double distanciaPunto(Punt2D punt)
	{
		double distancia;

		distancia = Math.sqrt(((punt.x - x) * (punt.x - x)) + ((punt.y - y) * (punt.y - y)));
		return (distancia);
	}
}
