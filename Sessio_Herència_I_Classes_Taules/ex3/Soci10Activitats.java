package ex3;

public class Soci10Activitats extends SociNActivitats
{
	private static double QUOTA_10_ACTIVITATS = 1;

	public Soci10Activitats(String DNI, String nombre, int nActivitats)
	{
		super(DNI, nombre, nActivitats);
	}

	public double quotaMensual()
	{
		return (super.quotaMensual() + 6 + getNActivitats() * QUOTA_10_ACTIVITATS);
	}

	public String toString()
	{
		String s;

		s = "Socio maximo 10 actividades\n" + super.toString();
		return (s); 
	}
}

