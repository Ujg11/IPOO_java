package ex3;

public class Vehiculo
{
	private String tipo;
	private String matricula;
	private int numPlazas;

	public Vehiculo(String matricula, int plazas)
	{
		this.matricula = matricula;
		this.numPlazas = plazas;
		this.tipo = "Vehiculo";
	}

	public boolean potCircular(int h, int ocupacio)
	{
		if (ocupacio > 0)
		{
			if (h >= 22 && h <= 23 && h >= 0 && h <= 6)
			{
				return (true);
			}
		}
		return (false);
	}

	public String toString()
	{
		String s = "";

		s += "Tipus de Vehicle: " + this.tipo + "\n" +
			"Matricula: " + this.matricula + "\n" + 
			"Numero de places: " + this.numPlazas;
		return (s);
	}

	public String getTipo()
	{
		return (this.tipo);
	}

	public int getNumPlazas()
	{
		return (this.numPlazas);
	}

	public String getMatricula()
	{
		return (this.matricula);
	}

	public void setTipo(String t)
	{
		this.tipo = t;
	}
}
