package ex2;

public class Empleado extends Persona
{
	private double sueldoBase;

	public Empleado(int dni,  String nombre, String apellido1, String apellido2, double sueldoBase)
	{
		super(dni, nombre, apellido1, apellido2);
		this.sueldoBase = sueldoBase;
	}

	public Empleado(Empleado e)
	{
		super(e);
		this.sueldoBase = e.sueldoBase;
	}

	public double nominaMensual()
	{
		return (this.sueldoBase);
	}

	public String toString()
	{
		String s = "";

		s += super.toString(); /*+ "\n"; +
			"Nomina mensual: " + this.nominaMensual();*/
		return (s);
	}

	public double getSueldoBase()
	{
		return (sueldoBase);
	}

	
}
