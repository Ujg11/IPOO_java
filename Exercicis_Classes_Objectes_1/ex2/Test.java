public class Test {
	public static void main(String argv[])
	{
		Data d1 = new Data(28, 12, 2001);
		Data d2 = new Data(31, 10, 2002);
		int resultat;

		resultat = d1.anteriorPosteriorIgual(d2);
		System.out.println("El resultat és: " + resultat);
		resultat = d1.anteriorPosteriorIgual2(d2);
		System.out.println("El resultat 2 és: " + resultat);
	}
}
