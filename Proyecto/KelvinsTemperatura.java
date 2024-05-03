public class KelvinsTemperatura extends Temperatura
{
	private static double MIN_T = 248;
    private static double MAX_T = 373;

	public KelvinsTemperatura()
	{
		super("Kelvins", "K");
		setMin(MIN_T);
		setMax(MAX_T);
	}

	protected Object clone()
	{
		return new KelvinsTemperatura();
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
