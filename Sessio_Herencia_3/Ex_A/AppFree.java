package Ex_A;

public class AppFree extends App
{
	private String patrocinador;
	private String publicitat;


	public AppFree(String n, String d, String nomDesenv, int versio, String p, String publi)
	{
		super(n, d, nomDesenv, versio);
		this.patrocinador = p;
		this.publicitat = publi;
	}

	public double consultarCost()
	{
		return (0);
	}

	public String toString()
	{
		String s = "";

		s += super.toString() + "\n" +
			"Patrocinador: " + patrocinador + "\n" +
			"Publicitat: " + publicitat;
		return (s);
	}

	public String getPatrocinador()
	{
		return (this.patrocinador);
	}

	public String getPublicitat()
	{
		return (this.publicitat);
	}
}
