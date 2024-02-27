import java.util.Scanner;

public class Test {
	public static void main(String argv[])
	{
		Data d1 = new Data();
		Data d2 = new Data();
		int resultat;
		Scanner scan = new Scanner(System.in);

		System.out.println("Introdueix la data 1: ");
		System.out.println("Any: ");
		d1.setAny(scan.nextInt());
		System.out.println("Mes: ");
		d1.setMes(scan.nextInt());
		System.out.println("Dia: ");
		d1.setDia(scan.nextInt());
		System.out.println("Introdueix la data 2: ");
		System.out.println("Any: ");
		d2.setAny(scan.nextInt());
		System.out.println("Mes: ");
		d2.setMes(scan.nextInt());
		System.out.println("Dia: ");
		d2.setDia(scan.nextInt());


		resultat = d1.anteriorPosteriorIgual(d2);
		if (resultat == 0)
			System.out.println("Les dates son iguals");
		if (resultat > 0)
			System.out.println("Data 1: (" + d1.getDia() + "/" + d1.getMes() + "/" + d1.getAny() + ") > Data 2: (" + d2.getDia() + "/" + d2.getMes() + "/" + d2.getAny() + ")");
		else if (resultat < 0)
			System.out.println("Data 1: (" + d1.getDia() + "/" + d1.getMes() + "/" + d1.getAny() + ") < Data 2: (" + d2.getDia() + "/" + d2.getMes() + "/" + d2.getAny() + ")");
		scan.close();
	}
}
