
public class Rectangle2D
{
	private double base;
	private double costat;
	private Punt2D puntOrigen;

	public Rectangle2D(double base, double costat, Punt2D puntOrigen)
	{
		this.base = base;
		this.costat = costat;
		this.puntOrigen = new Punt2D(puntOrigen);
	}

	public Rectangle2D(Rectangle2D cpy)
	{
		this.base = cpy.base;
		this.costat = cpy.costat;
		this.puntOrigen = new Punt2D(cpy.puntOrigen);
	}

	public double area()
	{
		return (this.base * this.costat);
	}

	public double perimetre()
	{
		return (this.base * 2 + this.costat * 2);
	}

	public double getBase()
	{
		return (this.base);
	}

	public double getCostat()
	{
		return (this.costat);
	}

	public Punt2D getPuntOrigen()
	{
		return (this.puntOrigen);
	}
	
	public void setBase(double base)
	{
		this.base = base;
	}

	public void setCostat(double costat)
	{
		this.costat = costat;
	}

	public void setPunt(Punt2D punt)
	{
		this.puntOrigen = new Punt2D(punt);
	}
}
