import java.util.Random;

public abstract class Sensor
{
    private int idInstrument;
    private boolean funciona;
    private Medicio[] mesures;
    private int numMesures;
    private double valorMaxim;
    private double valorMinim;
    private UnitatMesura unitatMesura;
    
    private static int OBSOLESCENCIA = 1000;

    public Sensor(int id, UnitatMesura u, double minim, double maxim)
    {
        this.idInstrument = id;
        this.funciona = true;
        this.numMesures = 0;
        this.valorMinim = minim;
        this.valorMaxim = maxim;
        mesures = new Medicio[OBSOLESCENCIA];
        for (int i = 0; i < OBSOLESCENCIA; i++)
        {
            this.mesures[i] = null;
        }
        this.unitatMesura = (UnitatMesura)u.clone();
    }

    protected abstract Object clone();

    public Sensor(Sensor s)
    {
        if (s != null)
        {
            this.idInstrument = s.getIdInstrument();
            this.funciona = s.getFunciona();
            this.mesures = s.getMesures();
            this.numMesures = s.getNumMesures();
            this.valorMaxim = s.getValorMaxim();
            this.valorMinim = s.getValorMinim();
            this.unitatMesura = (UnitatMesura)s.getUnitatMesura().clone();
        }
    }

    public int getIdInstrument()
    {
        return (this.idInstrument);
    }

    public boolean getFunciona()
    {
        return (this.funciona);
    }

    public int getNumMesures()
    {
        return (this.numMesures);
    }

    public double getValorMaxim()
    {
        return (this.valorMaxim);
    }

    public double getValorMinim()
    {
        return (this.valorMinim);
    }

    public static int getOBSOLESCENCIA()
    {
        return (OBSOLESCENCIA);
    }

    public Medicio[] getMesures()
    {
        Medicio[] m = new Medicio[OBSOLESCENCIA];
        for (int i = 0; i < OBSOLESCENCIA; i++)
            m[i] = this.mesures[i];
        return (m);
    }

    public UnitatMesura getUnitatMesura()
    {
        return (this.unitatMesura);
    }

    public void setFunciona(boolean b)
    {
        this.funciona = b;
    }

    public void setNumMesures(int n)
    {
        this.numMesures = n;
    }

    public abstract boolean dinsLlindar(double valor);

    public Medicio getUltimaMesura()
    {
        return (this.mesures[numMesures - 1]);
    }

    public Medicio novaMesura()
    {
        double valor;
    
        if (this.numMesures >= OBSOLESCENCIA)
        {
            this.funciona = false;
            return (null);
        }
        if (this.unitatMesura != null)
        {
            Random r = new Random();
            valor = r.nextDouble() * (this.valorMaxim - this.valorMinim) + valorMinim;
            Medicio m = new Medicio(valor, unitatMesura);
            this.mesures[numMesures] = m;
            numMesures++;
            if (numMesures == OBSOLESCENCIA)
                this.funciona = false;
            return (m);
        }
        else
        {
            System.out.println("No s'ha especificat la unitat de mesura");
            return (null);
        }
    }

    protected void setUnitatMesura(UnitatMesura u)
    {
        this.unitatMesura = u;
    }

    public abstract void convertirMesures(UnitatMesura u);

    public String toString()
    {
        String s = "";
    
        s += "Identificador del sensor: " + idInstrument + "\n" +
            "Medicio: " + mesures[numMesures - 1] + "\n";
        return (s);
    }

    public boolean equals(Object o)
    {
        if (this == o)
            return (true);
        if (o == null)
            return (false);
        if (getClass() != o.getClass())
            return (false);
        Sensor s = (Sensor) o;
        return (s.idInstrument == this.idInstrument);
    }
}
