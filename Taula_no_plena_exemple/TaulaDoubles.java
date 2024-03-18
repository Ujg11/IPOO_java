//afegir
//esborrar
//modificar
//consultar

public class TaulaDoubles
{
    private double[] elements;
    private int nElem;
    private static int MAXELEM = 0;

    public TaulaDoubles()
    {
        this.elements = new double[MAXELEM];
        this.nElem = 0;
    }

    public boolean afegir(double x)
    {
        if (estaPlena())
            return (false);
        elements[nElem] = x;
        nElem++;
        return (true);
    }

    public boolean estaPlena()
    {
        if (nElem == MAXELEM)
            return (true);
        return (false);
    }

    public boolean inRang(int p)
    {
        if (p >= 0 && p < nElem)
            return (true);
        return (false);
    }

    public boolean modificar(int pos, double x)
    {
        if (!inRang(pos))
            return (false);
        this.elements[pos] = x;
        return (true);
    }

    public boolean esborrar(int pos)
    {
        if (!inRang(pos))
            return (false);
        for (int i = pos; i < nElem - 1; i++)
            this.elements[i] = elements[i + 1];
        nElem--;
        return (true);
    }

    public double getPosicio(int pos)
    {
        if (!inRang(pos))
            return (-1);
        return (this.elements[pos]);
    }

    public int getNElem()
    {
        return (this.nElem);
    }

    public static int getMAXELEM()
    {
        return (MAXELEM);
    }
}
