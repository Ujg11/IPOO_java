package ex3;

public abstract class Soci
{
	private String DNI;
	private String nombre;

	private static double QUOTA_BASE = 10;

	public Soci(String DNI, String nombre)
	{
		this.DNI = DNI;
		this.nombre = nombre;
	}

	public abstract double quotaMensual();

	public String toString()
	{
		String s = "";

		s += "DNI: " + DNI + "\n" +
			"Nombre y Apellidos: " + nombre + "\n" +
			"Cuota mensual: " + quotaMensual();
		return (s);
 	}

	public static double getQUOTA_BASE()
	{
		return (QUOTA_BASE);
	}

	public static void setQUOTA_BASE(double q)
	{
		QUOTA_BASE = q;
	}

	public String getDNI()
	{
		return (this.DNI);
	}

	public String getNombre()
	{
		return (this.nombre);
	}
}
