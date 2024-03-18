package ex3;

public class SociObert extends Soci
{
	private static double QUOTA_ADICIONAL = 38;

	public SociObert(String DNI, String nombre)
	{
		super(DNI, nombre);
	}

	public double quotaMensual()
	{
		return (getQUOTA_BASE() + QUOTA_ADICIONAL);
	}

	public String toString()
	{
		String s;

		s = "Socio Abierto\n" + super.toString();
		return (s); 
	}

	public static double getQUOTA_ADICIONAL()
	{
		return (QUOTA_ADICIONAL);
	}

	public static void setQUOTA_ADICIONAL(double q)
	{
		QUOTA_ADICIONAL = q;
	}
}
