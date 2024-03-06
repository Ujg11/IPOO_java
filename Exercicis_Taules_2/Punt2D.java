
public class Punt2D {
	private double x;
	private double y;

	public Punt2D()
	{
		this(0,0);
	}

	public Punt2D(Punt2D cpy)
	{
		this.x = cpy.x;
		this.y = cpy.y;
	}

	public Punt2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	public double distanciaX(Punt2D punt)
	{
		double distancia;

		distancia = Math.abs(this.x - punt.getX());
		return (distancia);
	}

	public double distanciaX(double coord_x)
	{
		return (Math.abs(this.x - coord_x));
	}
	
	public double distanciaY(Punt2D punt)
	{
		double distancia;

		distancia = Math.abs(this.y - punt.getY());
		return (distancia);
	}

	public double distanciaY(double coord_y)
	{
		return (Math.abs(this.y - coord_y));
	}

	public double distanciaPunto(Punt2D punt)
	{
		double distancia;

		distancia = Math.sqrt(((punt.getX() - x) * (punt.getX() - x)) + ((punt.getY() - y) * (punt.getY() - y)));
		return (distancia);
	}

	public double distanciaPunto(double x, double y)
	{
		return (Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)));
	}

	public String toString()
	{
		return ("(" + this.getX() + " , " + this.getY() + ")");
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
