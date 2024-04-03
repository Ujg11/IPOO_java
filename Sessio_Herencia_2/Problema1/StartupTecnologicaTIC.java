public class StartupTecnologicaTIC extends StartupTecnologica
{
	private static double costoPuestoTrabajo = 2300;

	public StartupTecnologicaTIC(String cif, String nom, double social, double inversions, int nTreb, String descripcio, int nPat, double vMitja)
	{
		super(cif, nom, social, inversions, nTreb, descripcio, nPat, vMitja);
	}

	public String toString()
	{
		String s = "";

		s += super.toString() + "\n" +
			"Coste del puesto de trabajo: " + costoPuestoTrabajo;
		return (s);
	}

	public double calcularInmobilitzatMaterial()
	{
		return (costoPuestoTrabajo * getNumTreballadors());
	}

	public static double getCostoPuestoTrabajo()
	{
		return (costoPuestoTrabajo);
	}

	public static void setCostoPuestoTrabajo(double c)
	{
		costoPuestoTrabajo = c;
	}
}
