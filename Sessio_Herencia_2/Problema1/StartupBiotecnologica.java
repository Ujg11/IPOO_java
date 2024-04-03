public class StartupBiotecnologica extends StartupTecnologica
{
	private String ambit;
	private double valoracio;

	public StartupBiotecnologica(String cif, String nom, double social, double inversions, int nTreb, String descripcio, int nPat, double vMitja, String ambit, double val)
	{
		super(cif, nom, social, inversions, nTreb, descripcio, nPat, vMitja);
		this.ambit = ambit;
		this.valoracio = val;
	}

	public String toString()
	{
		String s = "";

		s += super.toString() + "\n" + 
			"Ambit: ";
		if (ambit == "blanc")
			s += "industrial";
		else if (ambit == "verd")
			s += "agrícola";
		else if (ambit == "blau")
			s += "marina";
		else if (ambit == "gris")
			s += "medi ambient";
		else
			s += "sense definir";
		s += " \n" + "Valoració " + valoracio;
		return (s);
	}

	public double calcularInmobilitzatMaterial()
	{
		return (valoracio);
	}

	public String getAmbit()
	{
		return (this.ambit);
	}

	public double getValoracio()
	{
		return (this.valoracio);
	}

	public void setAmbit(String ambit)
	{
		this.ambit = ambit;
	}

	public void setValoracio(double v)
	{
		this.valoracio = v;
	}
}
