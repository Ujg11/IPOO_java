
public class SensorHumitat extends Sensor
{
	private static double MAX_H = 100;

	public SensorHumitat(int id, Humitat u)
    {
		super(id, u, 0, MAX_H);
	}

	public SensorHumitat(SensorHumitat s)
	{
		super(s);
	}

	protected Object clone()
    {
      return new SensorHumitat(this);
    }

	public boolean dinsLlindar(double valor)
	{
		if (valor >= 0.8 * MAX_H)
			return (false);
		return (true);
	}

	public void convertirMesures(UnitatMesura u)
	{
		System.out.println("No es pot canviar la unitat de mesura de les medicions");
	}
}
