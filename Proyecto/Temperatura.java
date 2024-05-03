public abstract class Temperatura extends UnitatMesura
{
	public Temperatura()
	{
		super("Graus Celcius", "°C");
	}

	public Temperatura(String n, String s)
	{
		super(n, s);
	}

	public Temperatura(Temperatura t)
	{
		super(t);
	}

	protected abstract Object clone();
}
