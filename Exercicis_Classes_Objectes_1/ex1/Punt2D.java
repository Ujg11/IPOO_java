

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

		distancia = Math.abs(this.x - punt.x);
		return (distancia);
	}
	
	public double distanciaY(Punt2D punt)
	{
		double distancia;

		distancia = Math.abs(this.y - punt.y);
		return (distancia);
	}

	public double distanciaPunto(Punt2D punt)
	{
		double distancia;

		distancia = Math.sqrt(((punt.x - x) * (punt.x - x)) + ((punt.y - y) * (punt.y - y)));
		return (distancia);
	}
}
