public class Mapa {
	private Tresor[][] tresors;
	private int files;
	private int columnes;

	public Mapa(int files, int columnes)
	{
		this.tresors = new Tresor[files][columnes];
		this.files = files;
		this.columnes = columnes;
	}

	public Mapa(int files, int columnes, BuscaTroba buscaTroba)
	{
		int i = 0;

		this.tresors = new Tresor[files][columnes];
		this.files = files;
		this.columnes = columnes;
		while (i < buscaTroba.quantsTresors())
		{
			afegirTresor(buscaTroba.getTresor(i));
			i++;
		}
	}

	public Mapa(Mapa cpy)
	{
		int f = 0;
		int c = 0;

		this.tresors = new Tresor[cpy.getFiles()][cpy.getColumnes()];
		while (f < cpy.getFiles())
		{
			c = 0;
			while (c < cpy.getColumnes())
			{
				this.tresors[f][c] = new Tresor(cpy.getTresor(f, c));
				c++;
			}
			f++;
		}
	}

	public boolean posicioOcupada(int f, int c)
	{
		if (f >= 0 && f <= this.files && c >= 0 && c <= this.columnes)
		{
			if (tresors[f][c] == null)
				return (false);
			return (true);
		}
		return (false);
	}

	public Tresor trobaTresor(int f, int c)
	{
		if (f >= 0 && f <= this.files && c >= 0 && c <= this.columnes)
		{
			return (tresors[f][c]);
		}
		return (null);
	}

	public void afegirTresor(Tresor t)
	{
		if (this.posicioOcupada((int)(t.getLocalitzacio().getX()), (int)t.getLocalitzacio().getY()))
			this.tresors[(int)t.getLocalitzacio().getX()][(int)t.getLocalitzacio().getY()].actualitzaTresor(t.getDescripcio(), t.getValoracio());
		else
			this.tresors[(int)(t.getLocalitzacio().getX())][(int)t.getLocalitzacio().getY()] = new Tresor(t);
	}

	public int getFiles()
	{
		return (this.files);
	}

	public int getColumnes()
	{
		return (this.columnes);
	}

	public Tresor getTresor(int i, int j)
	{
		return (this.tresors[i][j]);
	}

}
