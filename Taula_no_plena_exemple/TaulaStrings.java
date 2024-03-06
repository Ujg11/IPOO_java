
public class TaulaStrings
{
    private String[] elements;
    private int nElem;
    private static int MAXELEM = 0;

    public TaulaStrings()
    {
        this.elements = new String[MAXELEM];
        this.nElem = 0;
    }

    public boolean afegir(String x)
    {
        if (estaPlena())
            return (false);
        elements[nElem] = new String(x);
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

    public boolean esborrar(int pos)
    {
        if (!inRang(pos))
            return (false);
        for (int i = pos; i < nElem - 1; i++)
            this.elements[i] = elements[i + 1];
        nElem--;
        this.elements[nElem] = null; //Si la taula és d'objectes hem de posar un NULL a la última posició que hi havia
        return (true);
    }

     public boolean modificar(int pos, String x)
    {
        if (!inRang(pos))
            return (false);
        this.elements[pos] = new String(x);
        return (true);
    }

    public String getPosicio(int pos)
    {
        if (inRang(pos))
            return (null);
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