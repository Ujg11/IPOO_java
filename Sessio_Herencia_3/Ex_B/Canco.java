package Ex_B;

public class Canco
{
	private String titol;
	private String cantant;
	private double duracio;
	private double preuVenda;

	public Canco(String t, String c, double d, double preuVenda)
	{
		this.titol = t;
		this.cantant = c;
		this.duracio = d;
		this.preuVenda = preuVenda;
	}

	public Canco(String t, String c, double preuVenda)
	{
		this.titol = t;
		this.cantant = c;
		this.duracio = -1;
		this.preuVenda = preuVenda;
	}

	public String toString()
	{
		String s = "";

		s += "Titol: " + titol + "\n" +
			"Cantant: " + cantant + "\n";
		if (duracio > 0)
		{
			s += "Duracio: " + duracio + "\n";
		}
		s += "Preu de Venda: " + preuVenda;
	
		return (s);
	}

	public boolean equals(Object o)
	{
		if (this == o)
			return (true);
		if (o == null)
			return (false);
		if (getClass() != o.getClass())
			return (false);
		Canco c = (Canco) o;
		return (this.titol.equals(c.titol) && this.cantant.equals(c.cantant));
	}

	public String getTitol()
	{
		return (this.titol);
	}

	public String getCantant()
	{
		return (this.cantant);
	}

	public double getDuracio()
	{
		return (this.duracio);
	}

	public double getPreuVenda()
	{
		return (this.preuVenda);
	}

	public void setTitol(String t)
	{
		this.titol = t;
	}

	public void setCantant(String c)
	{
		this.cantant = c;
	}

	public void setDuracio(double d)
	{
		this.duracio = d;
	}

	public void setPreuVenda(double pv)
	{
		this.preuVenda = pv;
	}
}
