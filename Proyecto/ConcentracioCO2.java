public abstract class ConcentracioCO2 extends UnitatMesura
{
	public ConcentracioCO2()
	{
		super("Parts per milió CO2", "ppmCO2");
	}

	public ConcentracioCO2(String ppm, String s)
	{
		super(ppm, s);
	}

	public ConcentracioCO2(ConcentracioCO2 t)
	{
		super(t);
	}

	protected abstract Object clone();
    
}
