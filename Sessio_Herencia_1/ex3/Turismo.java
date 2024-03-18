package ex3;

public class Turismo extends Vehiculo
{
	public Turismo(String matricula, int plazas)
	{
		super(matricula, plazas);
		this.setTipo("Turismo");
	}

	public boolean potCircular(int h, int ocupacio)
	{
		if (super.potCircular(h, ocupacio) || (h >= 6 && h <= 22 && ocupacio >= 0.5 * getNumPlazas()))
			return (true);
		return (false);
	}
}
