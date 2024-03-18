package ex1;

public class ProductoIVA extends Producto
{
	private double IVA;

	private static double IVA_GENERAL = 18;
	private static double IVA_REDUIT = 8;
	private static double IVA_SUPERREDUIT = 4;

	public ProductoIVA(int id, String descrip, double precio, int i)
	{
		super(id, descrip, precio);
		switch (i)
		{
			case 0:
				IVA = IVA_GENERAL;
				break;
			case 1:
				IVA = IVA_REDUIT;
				break;
			case 2:
				IVA = IVA_SUPERREDUIT;
				break;
			default:
				System.out.println("Tipo de IVA no encontrado,se pondra el general\n");
				IVA = IVA_GENERAL;
				break;
		}
	}

	public double getPrecioConIVA()
	{
		return (getPrecioSinIVA() + getPrecioSinIVA() * IVA / 100);
	}

	public String toString()
	{
		return (super.toString() + "\n" + "Precio con IVA: " + getPrecioConIVA());
	}
}
