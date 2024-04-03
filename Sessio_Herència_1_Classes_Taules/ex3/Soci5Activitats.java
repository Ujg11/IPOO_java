package ex3;

public class Soci5Activitats extends SociNActivitats
{
	private static double QUOTA_5_ACTIVITATS = 2;

	public Soci5Activitats(String DNI, String nombre, int nActivitats)
	{
		super(DNI, nombre, nActivitats);
	}

	public double quotaMensual()
	{
		return (super.quotaMensual() + getNActivitats() * QUOTA_5_ACTIVITATS);
	}

	public String toString()
	{
		String s;

		s = "Socio maximo 5 actividades\n" + super.toString();
		return (s); 
	}

}
