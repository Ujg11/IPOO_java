import java.time.LocalDateTime;

public class Medicio
{
	private double valor;
	private LocalDateTime momentMedicio;
	private UnitatMesura unitatMesura;
	
	public Medicio(double valor, UnitatMesura unitat)
	{
		this.valor = valor;
		momentMedicio = LocalDateTime.now();
		unitatMesura = (UnitatMesura)unitat.clone();
	}

	public Medicio(Medicio m)
	{
		if (m != null)
		{
			this.valor = m.getValor();
			this.momentMedicio = m.getMomentMedicio();
			this.unitatMesura = (UnitatMesura)m.unitatMesura.clone();
		}
	}

	public double getValor()
	{
		return (this.valor);
	}

	public LocalDateTime getMomentMedicio()
	{
		return (this.momentMedicio);
	}

	public UnitatMesura getUnitatMesura()
	{
		return (this.unitatMesura);
	}

	public void setValor(double v)
	{
		this.valor = v;
	}

	public String toString()
	{
		String s = "";

		s += "Fecha y hora: " + momentMedicio + "\n" +
			"Valor de la Medicio: " + valor + " " + unitatMesura;
		return (s);
	}
}


