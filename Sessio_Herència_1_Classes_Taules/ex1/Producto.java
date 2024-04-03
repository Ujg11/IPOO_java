package ex1;

public abstract class Producto
{
	private int id;
	private String descripcion;
	private double precio;

	public Producto(int id, String descrip, double precio)
	{
		this.id = id;
		this.descripcion = descrip;
		this.precio = precio;
	}

	public int getId()
	{
		return (this.id);
	}

	public String getDescripcion()
	{
		return (this.descripcion);
	}

	public void setDescripcion(String d)
	{
		this.descripcion = d;
	}

	public double getPrecioSinIVA()
	{
		return (this.precio);
	}

	public void setPrecioSinIVA(double p)
	{
		this.precio = p;
	}

	public abstract double getPrecioConIVA();

	public String toString()
	{
		String s = "";

		s += "Identificador: " + this.id + "\n" +
			"Descripcion: " + this.descripcion + "\n" +
			"Preu sense IVA: " + this.precio;
		return (s);
	}

}
