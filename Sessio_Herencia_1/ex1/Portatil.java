package ex1;
public class Portatil extends Ordenador
{
	private double peso;
	private double horasAutonomia;

	public Portatil(String procesador, double velocidad, int RAM, double peso, double hAutonomia)
	{
		super(procesador, velocidad, RAM);
		this.peso = peso;
		this.horasAutonomia = hAutonomia;
	}

	public Portatil(Portatil p)
	{
		super(p);
		this.peso = p.peso;
		this.horasAutonomia = p.horasAutonomia;
	}

	public String toString()
	{
		String s;

		s = super.toString() + "\n" +
			"Peso: " + peso + "kg" + "\n" +
			"Horas de autonomia: " + horasAutonomia + "\n";
		return (s);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return (true);
		if (obj == null)
			return (false);
		Portatil other = (Portatil) obj;
		return (super.equals(other) && Double.compare(peso, other.peso) == 0 
				&& Double.compare(horasAutonomia, other.horasAutonomia) == 0);
	}	

	public double getPeso()
	{
		return (this.peso);
	}

	public double getHorasAutonomia()
	{
		return (this.horasAutonomia);
	}

	public void setPeso(double p)
	{
		this.peso = p;
	}

	public void setHorasAutonomia(double h)
	{
		this.horasAutonomia = h;
	}
}

//Les Classes tenen: constructors, toString, equals

/*protected Object clone()
{
	return (new Portatil(this));
}
*/