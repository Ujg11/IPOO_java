
public class Data {
	private int	dia;
	private int	mes;
	private int any;

	//Constructor de copia
	public Data(Data cpy)
	{
		this.dia = cpy.dia;
		this.mes = cpy.mes;
		this.any = cpy.any;
	}

	public Data(int dia, int mes, int any)
	{
		this.dia = dia;
		this.mes = mes;
		this.any = any;
	}

	public int	anteriorPosteriorIgual(int dia, int mes, int any)
	{
		if (this.any < any)
			return (-1);
		else if (this.any < any)
			return (1);
		else
		{
			if (this.mes < mes)
				return (-1);
			else if (this.mes > mes)
				return (1);
			else
			{
				if (this.dia < dia)
					return (-1);
				else if (this.dia > dia)
					return (1);
			}
		}
		return (0);
	}

	public int	anteriorPosteriorIgual(Data d)
	{
		if (this.any < d.any)
			return (-1);
		else if (this.any < d.any)
			return (1);
		else
		{
			if (this.mes < d.mes)
				return (-1);
			else if (this.mes > d.mes)
				return (1);
			else
			{
				if (this.dia < d.dia)
					return (-1);
				else if (this.dia > d.dia)
					return (1);
			}
		}
		return (0);
	}

	public int anteriorPosteriorIgual2(Data d)
	{
		int data1 = this.any * 10000 + this.mes * 100 + this.dia;
		int data2 = d.any * 10000 + d.mes * 100 + d.dia;

		return (data1 - data2);
	}

	public String toString()
	{
		String str = "";

		str = "(" + this.dia + " / " + this.mes + " / " + this.any + ")";
		return (str);
	}

	public int getAny()
	{
		return any;
	}

	public int getDia()
	{
		return dia;
	}

	public int getMes()
	{
		return mes;
	}

	public void setAny(int any) {
		this.any = any;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}
}
