package ex3;

public class Carga extends Vehiculo
{
	public boolean autorizacion;
	
	public Carga(String matricula, int plazas, boolean autorizacion)
	{
		super(matricula, plazas);
		this.autorizacion = autorizacion;
		this.setTipo("Carga");
	}

	public boolean potCircular(int h, int ocupacio)
	{
		if (super.potCircular(h, ocupacio) || autorizacion == true)
			return (true);
		return (false);
	}

	public String toString()
	{
		String s = "";

		s += super.toString() +  "\n" +"Autoritzacio: " + this.autorizacion;
		return (s);
	}

}
