
public class Test {
	public static void main(String argv[])
	{
		Punt2D p1 = new Punt2D(2.0, 2.0);
		Punt2D p2 = new Punt2D(5.0, 6.0);

		double distanciaX = p1.distanciaX(p2);
		double distanciaY = p1.distanciaY(p2);
		double distanciaPunt = p1.distanciaPunto(p2);

		System.out.println("Distancia X = " + distanciaX);
		System.out.println("Distancia Y = " + distanciaY);
		System.out.println("Distancia entre punts = " + distanciaPunt);
	}
}
