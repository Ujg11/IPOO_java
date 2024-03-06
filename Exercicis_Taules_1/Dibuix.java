
public class Dibuix
{
	private int color;
	private Rectangle2D[] arrayRectangles;

	public final int MAX_RECTANGLES = 100;

	public Dibuix(Rectangle2D[] llista, int color)
	{
		int N;
		int i = 0;

		if (llista.length > MAX_RECTANGLES)
			N = MAX_RECTANGLES;
		else
			N = llista.length;
		this.arrayRectangles = new Rectangle2D[N];
		while (i < N)
		{
			this.arrayRectangles[i] = new Rectangle2D(llista[i]);
			i++;
		}
		this.color = color;
	}

	public int getColor()
	{
		return (this.color);
	}

	public void setColor(int color)
	{
		this.color = color;
	}

	public Rectangle2D getIRectangle(int i)
	{
		if (i >= 0 && i < this.arrayRectangles.length)
			return (this.arrayRectangles[i]);
		else
			return (null);
	}

	public int numRectangles()
	{
		return (this.arrayRectangles.length);
	}
}