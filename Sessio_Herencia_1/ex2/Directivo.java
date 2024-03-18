package ex2;

public class Directivo extends EmpleadoConComplementoCategoria
{
	private double complementoDirectivo;

	public Directivo(int dni,  String nombre, String apellido1, String apellido2, double sueldoBase, double complemento, double dir)
	{
		super(dni, nombre, apellido1, apellido2, sueldoBase, complemento);
		this.complementoDirectivo = dir;
	}

	public Directivo(Directivo d)
	{
		super(d);
		d.complementoDirectivo = d.complementoDirectivo;
	}

	public double nominaMensual()
	{
		return (super.nominaMensual() + complementoDirectivo);
	}

}
