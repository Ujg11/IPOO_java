public class TestMapa {
	public static void main(String argv[])
	{
		Punt2D[] localizaciones = { new Punt2D(1, 1), new Punt2D(2, 2), new Punt2D(0, 0) };
        int[] alturas = { 10, 20, 30 };
		BuscaTroba buscaTroba = new BuscaTroba(localizaciones, alturas);
		Mapa mapa = new Mapa(3, 3, buscaTroba);
		Tresor t = new Tresor(5, new Punt2D(1,0));
		System.out.println("El mapa té " + mapa.getFiles() + " Files i " + mapa.getColumnes() + " Columnes");

		mapa.afegirTresor(t);
		if (mapa.trobaTresor((int)t.getLocalitzacio().getX(), (int)t.getLocalitzacio().getY()) != null);
			System.out.println("Tresor t afegit correctament");
		if (!mapa.posicioOcupada(2, 2))
			System.out.println("El punt del mapa (2,2) no té cap Tresor");
		else
			System.out.println("El punt (2,2) té un tresor");
	}
}
