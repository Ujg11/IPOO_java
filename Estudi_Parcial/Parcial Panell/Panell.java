public class Panell
{
	private boolean[][] taulell;

	private static int TAMANY = 5;

	public Panell()
	{
		this.taulell = new boolean[TAMANY][TAMANY];
		for (int i = 0; i < TAMANY; i++)
		{
			for (int j = 0; j < TAMANY; j++)
			{
				taulell[i][j] = false;
			}
		}
	}

	public Panell(int n)
	{
		this.taulell = new boolean[TAMANY][TAMANY];
		for (int i = 0; i < TAMANY; i++)
		{
			for (int j = 0; j < TAMANY; j++)
			{
				taulell[i][j] = false;
			}
		}
		if (n == 0)
			dibuixa_X();
		else if (n == 1)
			dibuixa_1();
		else if (n == 2)
			dibuixa_2();
	}

	public Panell(Panell p)
	{
		for (int i = 0; i < TAMANY; i++)
		{
			for (int j = 0; j < TAMANY; j++)
			{
				if (p.getPosicio(i, j))
					this.taulell[i][j] = true;
				else
					this.taulell[i][j] = false;
			}
		}
	}

	private void dibuixa_X()
	{
		for (int i = 0; i < TAMANY; i++)
		{
			taulell[i][i] = true;
			taulell[i][TAMANY - i - 1] = true;
		}
	}

	private void dibuixa_1()
	{
		for (int i = 0; i < TAMANY; i++)
			taulell[i][2] = true;
		taulell[1][1] = true;
	}

	private void dibuixa_2()
	{
		for (int i = 0; i < TAMANY; i = i + 2)
		{
			for (int j = 1; j < TAMANY - 1; j++);
				taulell[i][j] = true;
		}
		taulell[1][3]=true;
		taulell[3][1]=true;
	}

	public boolean getPosicio(int i, int j)
	{
		return (this.taulell[i][j]);
	}
}
