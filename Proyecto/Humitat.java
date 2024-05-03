public class Humitat extends UnitatMesura
{
	public Humitat()
	{
		super("Humitat Relativa", "%HR");
	}

	public Humitat(Humitat t)
	{
		super(t);
	}

	protected Object clone()
    {
    	return new Humitat(this);
    }
}
