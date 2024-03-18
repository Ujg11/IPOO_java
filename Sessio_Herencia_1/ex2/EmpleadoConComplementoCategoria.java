package ex2;

public class EmpleadoConComplementoCategoria extends Empleado
{
	private double complemento;

	public EmpleadoConComplementoCategoria(int dni,  String nombre, String apellido1, String apellido2, double sueldoBase, double complemento)
	{
		super(dni, nombre, apellido1, apellido2, sueldoBase);
		this.complemento = complemento;
	}

	public EmpleadoConComplementoCategoria(EmpleadoConComplementoCategoria e)
	{
		super(e);
		this.complemento = e.complemento;
	}

	public double nominaMensual()
	{
		return (super.nominaMensual() + complemento);
	}

}
