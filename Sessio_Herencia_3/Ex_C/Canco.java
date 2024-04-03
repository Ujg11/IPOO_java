package Ex_C;

public class Canco implements Puntuable
{
	private String titol;
	private String cantant;
	private double duracio;
	private double preuVenda;

	private int[] vots;

	public Canco(String t, String c, double d, double preuVenda)
	{
		this.titol = t;
		this.cantant = c;
		this.duracio = d;
		this.preuVenda = preuVenda;
		this.vots = new int[5];
	}

	public Canco(String t, String c, double preuVenda)
	{
		this.titol = t;
		this.cantant = c;
		this.duracio = -1;
		this.preuVenda = preuVenda;
		this.vots = new int[5];
	}

	public boolean puntuar(int punt)
	{
		if (punt >= 0 && punt <= 4)
		{
			this.vots[punt]++;
			return (true);
		}
		return (false);
	}

	public String puntuacioToString()
	{
		String s = "";

		s += "Puntuació: \n";
		for (int i = 0; i < this.vots.length; i++)
		{
			s += "\t" + i + "* " + vots[i] + "\n";
		}
		return (s);
	}

	public double puntuacioMitjana()
	{
		double	mitjana = 0;
		int		numVots = 0;
	
		for (int i = 0; i < vots.length; i++)
		{
			mitjana += i * vots[i];
			numVots += vots[i];
		}
		if (numVots == 0)
			return (0);
		mitjana  = mitjana / numVots;
		return (mitjana);
	}

	public double puntuacioMitjanaNormalitzada()
	{
		double	puntuacio;
		double	mitjana;

		mitjana = puntuacioMitjana();
		puntuacio = (mitjana - 0) / (4 - 0);
		return (puntuacio);
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
