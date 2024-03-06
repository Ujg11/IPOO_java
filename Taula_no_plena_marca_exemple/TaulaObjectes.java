package repo_java.Taula_no_plena_marca_exemple;

public class TaulaObjectes
{
    private String[] elements;
    private static int MAXELEM = 8;
    private static String MARCA = null; //no caldria

    public TaulaObjectes()
    {
        this.elements = new String[MAXELEM];
        for (int i = 0; i < MAXELEM; i++)
        {
            this.elements[i] = null;
        }
    }

    public boolean inRang(int p)
    {
        return (p >= 0 && p < MAXELEM);
    }

    public boolean estaPlena()
    {
        for (int i = 0; i < MAXELEM; i++)
        {
            if (this.elements[i] == null)
                return (false);
        }
        return (true);
    }

    public boolean esborrar(int p)
    {
        if (!inRang(p))
            return (false);
        if (elements[p] == null)
            return (false);
        elements[p] = null;
        return (true);
    }

    public boolean modificar(int pos, String x)
    {
        if (!inRang(pos))
            return (false);
        if (elements[pos] == null)
            return (false); 
        this.elements[pos] = new String(x);
        return (true);
    }

    public int getNElem()
    {
        int cont = 0;
        int i = 0;
    
        while (i < MAXELEM)
        {
            if (this.elements[i] != null)
                cont++;
            i++;
        }
        return (cont);
    }

    public String getPosicio(int p)
    {
        if (!inRang(p))
            return (null);
        return (this.elements[p]);
        
    }

    public boolean afegir(String str)
    {
        if (estaPlena())
            return (false);
        for (int i = 0; i < MAXELEM; i++)
        {
            if (this.elements[i] == null)
            {
                this.elements[i] = new String(str);
                return (true);
            }
        }
        return (false);
    }
}
