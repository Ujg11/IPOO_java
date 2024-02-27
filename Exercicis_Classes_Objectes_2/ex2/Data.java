
public class Data {
	private int	dia;
	private int	mes;
	private int any;

	public Data()
	{
		
	}

	public Data(int dia, int mes, int any)
	{
		this.dia = dia;
		this.mes = mes;
		this.any = any;
	}

	int	anteriorPosteriorIgual(Data d)
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

	int anteriorPosteriorIgual2(Data d)
	{
		int data1 = this.any * 10000 + this.mes * 100 + this.dia;
		int data2 = d.any * 10000 + d.mes * 100 + d.dia;

		return (data1 - data2);
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
