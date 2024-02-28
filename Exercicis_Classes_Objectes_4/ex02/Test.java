public class Test {
	public static void main(String argv[])
	{
		Punt2D puntOrigen = new Punt2D(0, 0);
		Rectangle2D rectangle1 = new Rectangle2D(5, 3, puntOrigen);//Fem copia del punt
		Rectangle2D rectangle2;

		puntOrigen.setX(10);
		puntOrigen.setY(12);
		rectangle2 = new Rectangle2D(rectangle1); //Fem servir el constructor de copia
		rectangle2.setPunt(puntOrigen); //Fem servir el constructor de copia per fer una copia del punt

		System.out.println("Rectangle1:");
		System.out.println("Base = " + rectangle1.getBase());
		System.out.println("Costat: " + rectangle1.getCostat());
		System.out.println("Punt: (" + rectangle1.getPuntOrigen().getX() + " , " + rectangle1.getPuntOrigen().getY() + ")");
		System.out.println("Area = " + rectangle1.area());
		System.out.println("Perimetre = " + rectangle1.perimetre() + "\n");

		System.out.println("Rectangle2:");
		System.out.println("Base = " + rectangle2.getBase());
		System.out.println("Costat: " + rectangle2.getCostat());
		System.out.println("Punt: (" + rectangle2.getPuntOrigen().getX() + " , " + rectangle2.getPuntOrigen().getY() + ")");
		System.out.println("Area = " + rectangle2.area());
		System.out.println("Perimetre = " + rectangle2.perimetre());
	}
}
