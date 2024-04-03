package Ex_A;

public class AppPagament extends App
{

	private double preu;

	public AppPagament(String n, String d, String nomDesenv, int versio, double p)
	{
		super(n, d, nomDesenv, versio);
		this.preu = p;
	}

	public double consultarCost()
	{
		return (preu);
	}

	public String toString()
	{
		String s = "";

		s += super.toString() + "\n" +
			"Preu: " + preu;
		return (s);
	}

	public void setPreu(double p)
	{
		this.preu = p;
	}
}
