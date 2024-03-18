package ex1;
public class Sobremesa extends Ordenador
{
	private String monitor;

	public Sobremesa(String procesador, double velocidad, int RAM, String monitor)
	{
		super(procesador, velocidad, RAM);
		this.monitor = monitor;
	}

	public Sobremesa(Sobremesa s)
	{
		super(s);
		this.monitor = s.monitor;
	}

	public String toString()
	{
		String s;

		s = super.toString() + "\n" +
			"Monitor: " +  monitor + "\n";
		return (s);
	}

	public String getMonitor()
	{
		return (this.monitor);
	}

	public void setMonitor(String monitor)
	{
		this.monitor = monitor;
	}

}
