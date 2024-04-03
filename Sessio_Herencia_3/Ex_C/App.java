package Ex_C;

public abstract class App implements Puntuable
{
	private String name;
	private String descripcio;
	private String nomDesenvolupador;
	private int versio;

	private int numVots;
	private double puntuacioMitjana;
	private int puntsTotals;

	public App(String n, String d, String nomDesenv, int versio)
	{
		this.name = n;
		this.descripcio = d;
		this.nomDesenvolupador = nomDesenv;
		this.versio = versio;
		this.numVots = 0;
		this.puntsTotals = 0;
		this.puntuacioMitjana = 0;
	}

	public abstract double consultarCost();

	public String toString()
	{
		String	s = "";

		s += "Nom de la App: " + name + "\n" +
			"Descripció: " + descripcio + "\n" +
			"Nom del Desenvolupador: " + nomDesenvolupador + "\n" +
			"Versió: " + versio;
		return (s);
	}

	public boolean puntuar(int punt)
	{
		if (punt >= 0 && punt <= 10)
		{
			numVots++;
			puntsTotals += punt;
			this.puntuacioMitjana = puntsTotals / numVots;
		}
		return (false);
	}

	public String puntuacioToString()
	{
		String s = "";

		s += "Puntuació: " + this.puntuacioMitjana + "\n" +
			"Vots realitzats: " + this.numVots;
		return (s);
	}

	public double puntuacioMitjana()
	{
		return (this.puntuacioMitjana);
	}

	public double puntuacioMitjanaNormalitzada()
	{
		double puntuacio;

		puntuacio = (puntuacioMitjana() - 0) / (10 - 0);
		return (puntuacio);
	}

	public boolean equals(Object o)
	{
		if (this == o)
			return (true);
		if (o == null)
			return (false);
		if (getClass() != o.getClass())
			return (false);
		App other = (App) o;
		return (this.name.equals(other.name) && this.nomDesenvolupador.equals(other.nomDesenvolupador) && this.versio == other.versio);
	}

	public String getName()
	{
		return (this.name);
	}

	public String getDescripcio()
	{
		return (this.descripcio);
	}

	public String getNomDesenvolupador()
	{
		return (this.nomDesenvolupador);
	}

	public int getVersio()
	{
		return (this.versio);
	}

	public void setName(String n)
	{
		this.name = n;
	}

	public void setDescripcio(String d)
	{
		this.descripcio = d;
	}

	public void setNomDesenvolupador(String nd)
	{
		this.nomDesenvolupador = nd;
	}

	public void setVersio(int v)
	{
		this.versio = v;
	}
}
