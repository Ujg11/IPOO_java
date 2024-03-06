public class BuscaTroba {
	private Tresor[] taulaTresors;

	public BuscaTroba(Punt2D[] punts, int[] altures)
	{
		int nTresors = punts.length;

		if (nTresors != altures.length)
			System.out.println("Cuidado! Hi ha diferents punts i altures");
		else
		{
			this.taulaTresors = new Tresor[nTresors];
			for (int i = 0; i < nTresors; i++)
			{
				taulaTresors[i] = new Tresor(altures[i], punts[i]);
			}
		}
	}

	public void actualitzaTresor (int i, String novaDescrip, double nouValor)
	{
		if (i >= 0 && i < taulaTresors.length)
		{
			this.taulaTresors[i].setDescripcio(novaDescrip);
			this.taulaTresors[i].setValoracio(nouValor);
		}
	}

	public Tresor getTresor(int i)
	{
		if (i >= 0 && i < taulaTresors.length)
			return (this.taulaTresors[i]);
		else
			return (null);
	}

	public int quantsTresors()
	{
		return (this.taulaTresors.length);
	}

}
