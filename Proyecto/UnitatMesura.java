
public abstract class UnitatMesura
{
	private	String	nom;
	private	String	simbol;
	private double	min;
	private double	max;

	public UnitatMesura(String nom, String simbol)
	{
		this.nom = nom;
		this.simbol = simbol;
	}
	
	protected abstract Object clone();

	public UnitatMesura(UnitatMesura u)
	{
		if (u != null)
		{
			this.nom = u.nom;
			this.simbol = u.simbol;
			this.min = u.min;
			this.max = u.max;
		}	
	}

	public boolean equals(Object s)
    {
        if (this == s)
            return (true);
        if (s == null || getClass() != s.getClass())
            return (false);
        UnitatMesura sens = (UnitatMesura) s;
        return (this.getNom().equals(sens.getNom()));
    }

	public String getNom()
	{
		return (this.nom);
	}

	public String getSimbol()
	{
		return (this.simbol);
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public void setSimbol(String simbol)
	{
		this.simbol = simbol;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public String toString()
	{
		String s;

		s = simbol;
		return (s);
	}
}