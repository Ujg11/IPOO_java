
public class SensorConcentracioCO2 extends Sensor
{
	//private static double MAX_C = 10000;

	public SensorConcentracioCO2(int id, ConcentracioCO2 u)
    {
		super(id, u, u.getMin(), u.getMax());
	}

	protected Object clone()
    {
    	return (new SensorConcentracioCO2(this));
    }

	public SensorConcentracioCO2(SensorConcentracioCO2 s)
	{
		super(s);
	}

	public boolean dinsLlindar(double valor)
	{
		if (valor > this.getUnitatMesura().getMax())
			return (false);
		return (true);
	}

	public void passarAPpm()
	{
		Medicio[]	m = this.getMesures();
		double		v;

		if (this.getUnitatMesura().getNom().equals("Parts per milió CO2"))
			return ;
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null)
			{
				v = m[i].getValor();
				v = (v * 22.414 * 1000000 / 44.01)*(8.314 / 101325);
				m[i].setValor(v);
			}
		}
		this.setUnitatMesura(new PpmConcentracio());
		System.out.println("Mesures canviades a Parts per milió CO2");
	}

	public void passarAUgPorm3()
	{
		Medicio[]	m = this.getMesures();
		double		v;

		if (this.getUnitatMesura().getNom().equals("Microgramos por metro cubico"))
			return ;
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null)
			{
				v = m[i].getValor();
				v = (v * 44.01 / 22.424 * 1000000) * (101325 / 8.314);
				m[i].setValor(v);
			}
		}
		this.setUnitatMesura(new Microgramsmetre3Concentracio());
		System.out.println("Mesures canviades a Microgramos por metro cubico");
	}

	public void convertirMesures(UnitatMesura u) {
		if (u.getSimbol().equals("ppmCO2"))
			passarAPpm();
		else if (u.getSimbol().equals("uh/m3"))
			passarAUgPorm3();
		else
			System.out.println("No es pot canviar la unitat de mesura de les medicions");
	}
}