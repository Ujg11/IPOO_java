
public class Test {
	public static void main(String argv[])
	{
		Data d1 = new Data(28, 10, 2002);
		Data d2 = new Data(28, 2, 2024);
		Data d3 = new Data(d1);
		int resultat;

		resultat = d1.anteriorPosteriorIgual(d2);
		if (resultat == 0)
			System.out.println("Les dates son iguals");
		if (resultat > 0)
			System.out.println("Data 1: " + d1.toString() + " > Data 2: " + d2.toString());
		else if (resultat < 0)
			System.out.println("Data 1: " + d1.toString() + " < Data 2: " + d2.toString());

		//Utilitzem la copia de d1 que es d3 i el metode anteriorPosteriorIgual passant-li els parametres int
		resultat = d3.anteriorPosteriorIgual(d2.getDia(), d2.getMes(), d2.getAny());
		if (resultat == 0)
			System.out.println("Les dates son iguals");
		if (resultat > 0)
			System.out.println("Data 1: " + d3.toString() + " > Data 2: " + d2.toString());
		else if (resultat < 0)
			System.out.println("Data 1: " + d3.toString() + " < Data 2: " + d2.toString());
	}
}
