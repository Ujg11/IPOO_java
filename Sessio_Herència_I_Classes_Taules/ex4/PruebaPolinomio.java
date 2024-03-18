package ex4;

public class PruebaPolinomio {

	public static void main(String[] args) {
		double[] coefP1 = {2.3,0.0,5.1,-0.3};
		double[] coefP2 = {2.3,-1.2,5.1,-0.3};
		double[] coefP3 = {4.5,-2.5,3.1,-2.4,1.67,-2.13};
		double[] coefP4 = {3.0,-2.0,4.5,-10.5,0.0,0.0};
		
		Polinomio p1 = new Polinomio(coefP1);
		Polinomio p2 = new Polinomio(coefP2);
		Polinomio p3 = new Polinomio(coefP3);
		Polinomio p4 = new Polinomio(coefP4);

		System.out.println(p1.resta(p2));

		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p1.suma(p1): " + p1.suma(p1));
		System.out.println("p2.suma(p1): " + p2.suma(p1));
		System.out.println("p1.resta(p2): " + p1.resta(p2));
		System.out.println();
		System.out.println();
		System.out.println("p3: " + p3);
		System.out.println("p4: " + p4);
		System.out.println("p3.suma(p4): " + p3.suma(p4));
		System.out.println("p4.resta(p3): " + p4.resta(p3));
	}
}
