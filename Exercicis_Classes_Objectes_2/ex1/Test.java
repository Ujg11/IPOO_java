
import java.util.Scanner;

public class Test {
	public static void main(String argv[])
	{
		Punt2D p1 = new Punt2D();
		Punt2D p2 = new Punt2D();
		Punt2D p3 = new Punt2D();
		Scanner scan = new Scanner(System.in);
		double x, y;

		System.out.println("Introduzca las coordenadas X e Y del primer punto: ");
		x = scan.nextDouble();
		p1.setX(x);
		y = scan.nextDouble();
		p1.setY(y);
		System.out.println("Introduzca las coordenadas X e Y del segundo punto: ");
		x = scan.nextDouble();
		p2.setX(x);
		y = scan.nextDouble();
		p2.setY(y);
		System.out.println("Introduzca las coordenadas X e Y del tercer punto: ");
		x = scan.nextDouble();
		p3.setX(x);
		y = scan.nextDouble();
		p3.setY(y);

		double distanciaPunt12 = p1.distanciaPunto(p2);
		double distanciaPunt13 = p1.distanciaPunto(p3);
		double distanciaPunt23 = p2.distanciaPunto(p3);

		if (distanciaPunt12 < distanciaPunt13 && distanciaPunt12 < distanciaPunt23)
		{
			System.out.println("Els punts més propers son p1(" + p1.getX() + "," + p1.getY() + ") i p2(" + p2.getX() + "," + p2.getY() + ")");
		}
		else if (distanciaPunt23 < distanciaPunt13 && distanciaPunt23 < distanciaPunt12)
		{
			System.out.println("Els punts més propers son p2(" + p2.getX() + "," + p2.getY() + ") i p3(" + p3.getX() + "," + p3.getY() + ")");
		}
		else if (distanciaPunt13 < distanciaPunt23 && distanciaPunt13 < distanciaPunt12)
		{
			System.out.println("Els punts més propers son p1(" + p1.getX() + "," + p1.getY() + ") i p3(" + p3.getX() + "," + p3.getY() + ")");
		}
		scan.close();
	}
}
