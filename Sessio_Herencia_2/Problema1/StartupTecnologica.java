public class StartupTecnologica extends Startup
{
	private int numPatents;
	private double valorMitjaPatents;

	public StartupTecnologica(String cif, String nom, double social, double inversions, int nTreb, String descripcio, int nPat, double vMitja)
	{
		super(cif, nom, social, inversions, nTreb, descripcio);
		this.numPatents = nPat;
		this.valorMitjaPatents = vMitja;
	}

	public String toString()
	{
		String s = "";

		s += super.toString() + "\n" + 
			"Numero de patents: " + numPatents + "\n" + 
			"Valor mitjà de les patents: " + valorMitjaPatents;
		return (s);
	}

	public double calcularInmobilitzatInmaterial()
	{
		return (valorMitjaPatents * numPatents);
	}

	
	public int getNumPatents()
	{
		return (numPatents);
	}

	public double getValorMitjaPatents()
	{
		return (this.valorMitjaPatents);
	}

	public void setNumPatents(int n)
	{
		this.numPatents = n;
	}

	public void setValorMitjaPatents(int v)
	{
		this.valorMitjaPatents = v;
	}
}
