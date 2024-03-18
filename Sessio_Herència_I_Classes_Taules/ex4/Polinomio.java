package ex4;

public class Polinomio
{
	private int gradoPolinomio;
	private double[] coeficientes;

	public Polinomio()
	{
		coeficientes = new double[1];
		coeficientes[0] = 0;
	}

	public Polinomio(double[] coeficientes)
	{
		int	grado = coeficientes.length - 1;

		while (grado >= 0 && coeficientes[grado] == 0)
			grado--;
		this.coeficientes = new double[grado + 1];
		this.gradoPolinomio = grado;
		for (int i = 0; i < grado + 1; i++)
		{
			this.coeficientes[i] = coeficientes[i];
		}
	}

	public int getGradoPolinomio()
	{
		return (this.gradoPolinomio);
	}

	public Polinomio suma(Polinomio p)
	{
		int grado = this.gradoPolinomio;
		if (grado < p.getGradoPolinomio())
			grado = p.getGradoPolinomio();
		double[] sumaCoeficientes = new double[grado + 1];

		if (this.gradoPolinomio == p.getGradoPolinomio())
		{
			for (int i = 0; i < grado + 1; i++)
				sumaCoeficientes[i] = this.coeficientes[i] + p.coeficientes[i];
		}
		else if (this.gradoPolinomio > p.getGradoPolinomio())
		{
			for (int i = this.gradoPolinomio; i >= 0; i--)
			{
				if (i > p.gradoPolinomio)
					sumaCoeficientes[i] = this.coeficientes[i];
				else
					sumaCoeficientes[i] = this.coeficientes[i] + p.coeficientes[i];
			}
		}
		else if (this.gradoPolinomio < p.getGradoPolinomio())
		{
			for (int i = p.gradoPolinomio; i >= 0; i--)
			{
				if (i > this.gradoPolinomio)
					sumaCoeficientes[i] = p.coeficientes[i];
				else
					sumaCoeficientes[i] = this.coeficientes[i] + p.coeficientes[i];
			}
		}
		return (new Polinomio(sumaCoeficientes));		
	}

	public Polinomio resta(Polinomio p)
	{
		int grado = this.gradoPolinomio;
		if (grado < p.getGradoPolinomio())
			grado = p.getGradoPolinomio();
		double[] restaCoeficientes = new double[grado + 1];

		if (this.gradoPolinomio == p.getGradoPolinomio())
		{
			for (int i = 0; i < grado + 1; i++)
				restaCoeficientes[i] = this.coeficientes[i] - p.coeficientes[i];
		}
		else if (this.gradoPolinomio > p.getGradoPolinomio())
		{
			for (int i = grado; i >= 0; i--)
			{
				if (i > p.gradoPolinomio)
					restaCoeficientes[i] = this.coeficientes[i];
				else
					restaCoeficientes[i] = this.coeficientes[i] - p.coeficientes[i];
			}
		}
		else if (this.gradoPolinomio < p.getGradoPolinomio())
		{
			for (int i = grado; i >= 0; i--)
			{
				if (i > this.gradoPolinomio)
					restaCoeficientes[i] = p.coeficientes[i] * -1;
				else
					restaCoeficientes[i] = this.coeficientes[i] - p.coeficientes[i];
			}
		}
		Polinomio pol = new Polinomio(restaCoeficientes);
		return (pol);		
	}

	public String toString()
	{
		String s = "";
		boolean flag = false;

		for (int i = gradoPolinomio; i >= 0; i--)
		{
			if (coeficientes[i] >= 0 && flag == false)
			{
				if (i == 0)
					s += coeficientes[i];
				else if (i == 1)
					s += coeficientes[i] + "x";
				else
					s += coeficientes[i] + "x^" + i;
			}
			else if (coeficientes[i] >= 0 && flag == true)
			{
				if (i == 0)
					s += "+" + coeficientes[i];
				else if (i == 1)
					s += "+" + coeficientes[i] + "x";
				else
					s += "+" + coeficientes[i] + "x^" + i;
			}
			else
			{
				if (i == 0)
					s += coeficientes[i];
				else if (i == 1)
					s += coeficientes[i] + "x";
				else
					s += coeficientes[i] + "x^" + i;
			}
			flag = true;
		}
		return (s);
	}
}

