public class GrausCelciusTemperatura extends Temperatura
{
	private static double MIN_T = -25;
    private static double MAX_T = 100;

	public GrausCelciusTemperatura()
	{
		super("Graus Celcius", "°C");
		setMIN_T(MIN_T);
		setMAX_T(MAX_T);
	}

	protected Object clone()
	{
		return new GrausCelciusTemperatura();
	}

	public static double getMIN_T()
	{
		return MIN_T;
	}

	public static void setMIN_T(double mIN_T)
	{
		MIN_T = mIN_T;
	}

	public static double getMAX_T()
	{
		return MAX_T;
	}

	public static void setMAX_T(double mAX_T)
	{
		MAX_T = mAX_T;
	}	
}
