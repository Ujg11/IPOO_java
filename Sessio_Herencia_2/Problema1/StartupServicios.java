public class StartupServicios extends Startup
{
	private boolean callCenter;

	public StartupServicios(String cif, String nom, double social, double inversions, int nTreb, String descripcio, boolean callCenter)
	{
		super(cif, nom, social, inversions, nTreb, descripcio);
		this.callCenter = callCenter;
	}

	public String toString()
	{
		String s = "";

		s += super.toString() + "\n" +
			"Tiene call center? " + callCenter;
		return (s);
	}

	public boolean getCallCenter()
	{
		return (callCenter);
	}

	public void setCallCenter(boolean c)
	{
		this.callCenter = c;
	}
}
