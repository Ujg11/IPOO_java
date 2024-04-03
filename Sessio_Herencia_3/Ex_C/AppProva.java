package Ex_C;

public class AppProva extends App
{
	private boolean funciona;
	private int numTelefon;

	private static int PERIODE_PROBA = 2;

	public AppProva(String n, String d, String nomDesenv, int versio, boolean f)
	{
		super(n, d, nomDesenv, versio);
		this.funciona = f;
		this.numTelefon = 0;
	}

	public AppProva(String n, String d, String nomDesenv, int versio,boolean f, int tel)
	{
		super(n, d, nomDesenv, versio);
		this.funciona = f;
		this.numTelefon = tel;
	}

	public double consultarCost()
	{
		return (0);
	}

	public String toString()
	{
		String s = "";

		s += super.toString() + "\n" +
			"Funciona: " + funciona;
		if (numTelefon > 0)
		{
			s += "\n" + "Numero de telèfon: " + numTelefon;
		}
		return (s);
	}

	public boolean getFunciona()
	{
		return (this.funciona);
	}

	public int getNumTelefon()
	{
		return (this. numTelefon);
	}

	public int getPERIODE_PROBA()
	{
		return (PERIODE_PROBA);
	}

	public void setPERIODE_PROBA(int n)
	{
		PERIODE_PROBA = n;
	}

	public void deixaDeFuncionar()
	{
		this.funciona = false;
	}

	

	
}
