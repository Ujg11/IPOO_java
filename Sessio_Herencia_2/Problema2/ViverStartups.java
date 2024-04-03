public class ViverStartups
{
	private int localsTotals;
	private int localsOcupats;
	private Startup[] locals;

	public ViverStartups(int localsTotals)
	{
		this.localsTotals = localsTotals;
		localsOcupats = 0;
		locals = new Startup[localsTotals];
		for (int i = 0; i < localsTotals; i++)
			locals[i] = null;
	}

	public int assignarLocal(Startup s)
	{
		int ret_val;
	
		if (localsOcupats < localsTotals)
		{
			locals[localsOcupats] = s;
			ret_val = localsOcupats;
			localsOcupats++;
		}
		else
			ret_val = -1;
		return (ret_val);
	}

	public int numLocalsLliures()
	{
		return (localsTotals - localsOcupats);
	}

	public int getLocal(String cif)
	{
		if (localsOcupats == 0)
			return (-1);
		for(int i = 0; i < localsOcupats; i++)
		{
			if (locals[i].getCif() == cif)
				return (i);
		}
		return (-1);
	}

	public Startup getStartup(int i)
	{
		if (i >= 0 && i <= localsTotals - 1)
		{
			return (locals[i]);
		}
		return (null);
	}

	public String toString()
	{
		String s = "";
	
		for (int i = 0; i < localsOcupats; i++)
		{
			s += "Local " + i + ":" + "\n"
			+ locals[i] + "\n\n";
		}
		return (s);
	}
}
