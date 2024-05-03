public class Microgramsmetre3Concentracio extends ConcentracioCO2
{
	private static double MAX_C = 240;

	public Microgramsmetre3Concentracio()
	{
		super("Microgramos pos metro cubico", "uh/m3");
		setMin(0);
		setMax(MAX_C);
	}

	protected Object clone()
	{
		return new Microgramsmetre3Concentracio();
	}

	public static double getMAX_C() {
		return MAX_C;
	}

	public static void setMAX_C(double mAX_C) {
		MAX_C = mAX_C;
	}
}
