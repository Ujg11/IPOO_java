public class PpmConcentracio extends ConcentracioCO2
{
	private static double MAX_C = 10000;

	public PpmConcentracio()
	{
		super("Parts per milió CO2", "ppmCO2");
		setMin(0);
		setMax(MAX_C);
	}

	protected Object clone()
	{
		return new PpmConcentracio();
	}

	public static double getMAX_C() {
		return MAX_C;
	}

	public static void setMAX_C(double mAX_C) {
		MAX_C = mAX_C;
	}
}
