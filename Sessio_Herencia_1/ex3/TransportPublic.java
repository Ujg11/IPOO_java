package ex3;

public class TransportPublic extends Vehiculo
{
	public TransportPublic(String matricula, int plazas)
	{
		super(matricula, plazas);
		this.setTipo("Transport Public");
	}

	public boolean potCircular()
	{
		return (true);
	}
}
