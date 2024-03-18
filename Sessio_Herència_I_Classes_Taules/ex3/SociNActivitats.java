package ex3;

public class SociNActivitats extends Soci
{
	private int nActivitats;

	private static double QUOTA_BASE_ACTIVITATS = 2;
	
	public SociNActivitats(String DNI, String nombre, int nActivitats)
	{
		super(DNI, nombre);
		this.nActivitats = nActivitats;
	}

	public double quotaMensual()
	{
		return (getQUOTA_BASE() + nActivitats * QUOTA_BASE_ACTIVITATS);
	}

	public String toString()
	{
		String s;

		s = "Numero de Actividades: " + nActivitats + "\n" + super.toString();
		return (s);
	}

	public int getNActivitats()
	{
		return (this.nActivitats);
	}
}
