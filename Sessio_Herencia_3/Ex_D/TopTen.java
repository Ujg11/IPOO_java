package Ex_D;

public class TopTen
{
	private Puntuable[] topTen;

	public TopTen(Puntuable[] topTen)
	{
		super();
		this.topTen = topTen;
	}

	public void actualitzarTopTen(Puntuable p)
	{
		boolean trobat = false;
		int 	pos = -1;

		if (p == null)
			return ;
		for (int i = 0; i < topTen.length; i++)
		{
			if (p.puntuacioMitjanaNormalitzada() > topTen[i].puntuacioMitjanaNormalitzada())
			{
				trobat = true;
				pos = i;
				break ;
			}
		}
		if (trobat)
		{
			for (int i = topTen.length - 1; i > pos; i--)
				topTen[i] = topTen[i - 1];
			topTen[pos] = p;
		}
	}

	public String toString()
	{
		String	s = "";

		s += "Elements de la llista:\n";
		for (int i = 0; i < topTen.length; i++)
		{
			s += "<---" + (i+1) + "--->\n" + topTen[i] + "\n" +
				"Puntuació Normalitzada = " + topTen[i].puntuacioMitjanaNormalitzada() + "\n";
		}
		return (s);
	}

	public String top()
	{
		String		s = "";
		Puntuable	p[];
		double		mitjana = 0;
		int			num = 0;
		int			pos = 0;

		for (int i = 0; i < this.topTen.length; i++)
		{
			if (topTen[i].puntuacioMitjanaNormalitzada() == mitjana && num != 0)
				num++;
			if (topTen[i].puntuacioMitjanaNormalitzada() > mitjana)
			{
				mitjana = topTen[i].puntuacioMitjanaNormalitzada();
				num = 1;
			}
		}
		p = new Puntuable[num];
		for (int i = 0; i < topTen.length; i++)
		{
			if (topTen[i].puntuacioMitjanaNormalitzada() == mitjana)
			{
				p[pos] = topTen[i];
				pos++;
			}
		}
		s += "Elements amb la màxima puntuació:\n";
		for (int i = 0; i < num; i++)
		{
			s += p[i] + "\n";
		}
		return (s);
	}
}
//puntuacio normalitzada: valor entre 0 i 1

//3, 4, 5, 6, 7
//
//0    0.5    1
//
//Es fa: (x - pmin)/(pmax - pmin)