public class TestDibuix {
	public static void main(String argv[])
	{
		Punt2D p1 = new Punt2D();
		Punt2D p2 = new Punt2D(5, 5);
		Punt2D p3 = new Punt2D(3, 6);

		Rectangle2D[] array = new Rectangle2D[3];
		array[0] = new Rectangle2D(3, 2, p1);
		array[1] = new Rectangle2D(5, 3, p2);
		array[2] = new Rectangle2D(8, 6, p3);

		Dibuix dibuix = new Dibuix(array, 20);
		System.out.println("El color del dibuix es: " + dibuix.getColor());
		Rectangle2D rec =  dibuix.getIRectangle(2);
		System.out.println("El rectangle en la posició 3 (i = 2) és: ");
		System.out.println(rec.toString());
		System.out.println("El número de rectangles que té el dibuix és: " + dibuix.numRectangles());
	} 
}
