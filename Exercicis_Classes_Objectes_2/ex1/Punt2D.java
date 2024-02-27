
public class Punt2D {
	private double x;
	private double y;

	public Punt2D()
	{
		
	}

	/*public Punt2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}*/

	public double distanciaX(Punt2D punt)
	{
		double distancia;

		distancia = Math.abs(this.x - punt.getX());
		return (distancia);
	}
	
	public double distanciaY(Punt2D punt)
	{
		double distancia;

		distancia = Math.abs(this.y - punt.getY());
		return (distancia);
	}

	public double distanciaPunto(Punt2D punt)
	{
		double distancia;

		distancia = Math.sqrt(((punt.getX() - x) * (punt.getX() - x)) + ((punt.getY() - y) * (punt.getY() - y)));
		return (distancia);
	}

	public double getX()
	{
		return (this.x);
	}

	public double getY()
	{
		return (this.y);
	}

	public void setX(double x)
	{
		this.x = x;
	}

	public void setY(double y)
	{
		this.y = y;
	}
}
