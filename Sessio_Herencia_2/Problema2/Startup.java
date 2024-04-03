public class Startup
{
	private String	cif;
	private String	nom;
	private double	capitalSocial;
	private double	inversions;
	private int		numTreballadors;
	private String	descripcio;

	public Startup(String cif, String nom, double social, double inversions, int nTreb, String descripcio)
	{
		this.cif = cif;
		this.nom = nom;
		this.capitalSocial = social;
		this.inversions = inversions;
		this.numTreballadors = nTreb;
		this.descripcio = descripcio;
	}

	public void altaTreballador()
	{
		numTreballadors++;
	}

	public boolean baixaTreballador()
	{
		if (this.numTreballadors - 1 >= 1)
		{
			this.numTreballadors--;
			return (true);
		}
		else
			return (false);
	}

	public double calcularInmobilitzatInmaterial()
	{
		return (0);
	}

	public double calcularInmobilitzatMaterial()
	{
		return (0);
	}

	public double calcularInmobilitzat()
	{
		return (calcularInmobilitzatMaterial() + calcularInmobilitzatInmaterial() + inversions);
	}

	public String toString()
	{
		String s = "";

		s += "Nom de la Startup: " + nom + "\n" +
			"Cif: " + cif + "\n" + 
			"Capital Social: " + capitalSocial + "\n" + 
			"Import dedicat a Inversions: " + inversions + "\n" + 
			"Numero de treballadors: " + numTreballadors + "\n" +
			"Descripció: " + descripcio;
		return (s);
	}

	public boolean equals(Object obj)
	{
		if (this == obj)
			return (true);
		if (obj == null)
			return (false);
		Startup other = (Startup) obj;
		return (this.cif == other.cif);
	}
	
	public String getCif()
	{
		return (this.cif);
	}

	public String getNom()
	{
		return (this.nom);
	}

	public double getCapitalSocial()
	{
		return (this.capitalSocial);
	}

	public double getInversions()
	{
		return (this.inversions);
	}

	public int getNumTreballadors()
	{
		return (this.numTreballadors);
	}

	public String getDescripcio()
	{
		return (this.descripcio);
	}
	
	public void setCapitalSocial(double c)
	{
		this.capitalSocial = c;
	}

	public void setCapitalInversions(double c)
	{
		this.inversions = c;
	}

	public void setNumTreballadors(int n)
	{
		this.numTreballadors = n;
	}

	public void setDescripcio(String d)
	{
		this.descripcio = d;
	}
}
