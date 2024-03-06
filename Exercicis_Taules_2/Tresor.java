
public class Tresor {
	private String descripcio;
	private int altura;
	private double valoracio;
	private Punt2D localitzacio;


	public static double limitValuos = 100;

	public Tresor(String descrip, int altura, double valor, Punt2D localitzacio)
	{
		this.descripcio = descrip;
		this.altura = altura;
		this.valoracio = valor;
		this.localitzacio = new Punt2D(localitzacio);
	}

	public Tresor(String descrip, int altura, double valor)
	{
		this.descripcio = descrip;
		this.altura = altura;
		this.valoracio = valor;
	}

	public Tresor(int a)
	{
		descripcio = "";
		altura = a;
		valoracio = 0;
	}

	public Tresor(Tresor cpy)
	{
		this.descripcio = cpy.descripcio;
		this.altura = cpy.altura;
		this.valoracio = cpy.valoracio;
	}

	public Tresor(int a, Punt2D localitzacio)
	{
		this.descripcio = "";
		this.altura = a;
		this.valoracio = 0;
		this.localitzacio = new Punt2D(localitzacio); 
	}

	public double distancia(Tresor t)
	{
		return (this.localitzacio.distanciaPunto(t.getLocalitzacio()));
	}

	public double distancia(Punt2D p)
	{
		return (this.localitzacio.distanciaPunto(p));
	}

	public void actualitzaTresor(String descrip, double valor)
	{
		this.descripcio = descrip;
		this.valoracio = valor;
	}

	public boolean esValuos()
	{
		if (this.valoracio >= limitValuos)
			return (true);
		return (false);
	}

	public void printTresor()
	{
		System.out.println("Descripció: " + descripcio);
		System.out.println("Altura: " + altura);
		System.out.println("Valoració: " + valoracio);
	}

	public boolean esMesValorat (Tresor t) {
		if (this.getValoracio()>t.getValoracio()) {
			return true;
		}
		return false;
	}
	
	public boolean esMesValorat (double valor) {
		if (this.getValoracio()>valor) {
			return true;
		}
		return false;
	}

	public String getDescripcio() {
		return descripcio;
	}
	
	public void setDescripcio(String D) {
		descripcio = D;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int A) {
		if (A >= 0) {
			altura = A;
		}
	}
	
	public double getValoracio() {
		return valoracio;
	}

	public Punt2D getLocalitzacio()
	{
		return (this.localitzacio);
	}
	
	public void setValoracio(double V) {
		if (V >= 0) {
			valoracio = V;
		}
	}
	
	public static double getLimitValuos() {
		return limitValuos;
	}
	
	public static void setLimitValuos(double LV) {
		if (LV >= 0) {
			limitValuos = LV;
		}
	}
}

