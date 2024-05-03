public class SensorTemperatura extends Sensor
{
	//private static double MIN_T = -25;
    //private static double MAX_T = 100;

	public SensorTemperatura(int id, Temperatura u)
    {
		super(id, u, u.getMin(), u.getMax());
	}

	public SensorTemperatura(SensorTemperatura s)
	{
		super(s);
	}

	protected Object clone()
    {
      return new SensorTemperatura(this);
    }

	public boolean dinsLlindar(double valor)
	{
		if (valor >= 0.9 * this.getUnitatMesura().getMax() || valor <= 0.1 * this.getUnitatMesura().getMin())
			return (false);
		return (true);
	}

	private void passarAKelvins()
	{
		Medicio[] m = this.getMesures();

		if (this.getUnitatMesura().getNom().equals("Kelvins"))
			return ;
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null)
			{
				m[i]=new Medicio(m[i].getValor()+273,new KelvinsTemperatura());
			}
		}
		this.setUnitatMesura(new KelvinsTemperatura());
		System.out.println("Mesures canviades a Kelvins");
	}

	private void passarAGraus()
	{
		Medicio[] m = this.getMesures();

		if (this.getUnitatMesura().getNom().equals("Graus Celcius"))
			return ;
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] != null)
			{
				m[i].setValor(m[i].getValor() - 273.15);
			}
		}
		this.setUnitatMesura(new GrausCelciusTemperatura());
		System.out.println("Mesures canviades a Graus Celcius");
	}

	@Override
	public void convertirMesures(UnitatMesura u) {
		if (u.getSimbol().equals("K"))
			passarAKelvins();
		else if (u.getSimbol().equals("°C"))
			passarAGraus();
		else
			System.out.println("No es pot canviar la unitat de mesura de les medicions");
	}
}
