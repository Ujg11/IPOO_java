
public class Jugador {
    private int dorsal;
    private String nom;
    private String posIdeal;
    private int numGols;
    private int numPases;
    private int pilotesPerdudes;
    private int pilotesRecuperades;

    private static int VALOR_GOL = 5;
    private static int VALOR_PASE = 2;
    private static int VALOR_RECUPERADES = 3;
    private static int PENALITZACIO_PERDUDES = 2;
    
    public Jugador(int dorsal, String nom, String pos)
    {
        this.dorsal = dorsal;
        this.nom = nom;
        this.posIdeal = pos;
        this.numGols = 0;
        this.numPases = 0;
        this.pilotesPerdudes = 0;
        this.pilotesRecuperades = 0;
    }

    public Jugador(Jugador j)
    {
        this.dorsal = j.dorsal;
        this.nom = j.nom;
        this.posIdeal = j.posIdeal;
        this.numGols = j.numGols;
        this.numPases = j.numPases;
        this.pilotesPerdudes = j.pilotesPerdudes;
        this.pilotesRecuperades = j.pilotesRecuperades;
    }

    public int puntuacio()
    {
        int puntuacio = 0;

        puntuacio += numGols * VALOR_GOL;
        puntuacio += numPases * VALOR_PASE;
        puntuacio += pilotesRecuperades * VALOR_RECUPERADES;
        puntuacio -= pilotesPerdudes * PENALITZACIO_PERDUDES;
        return (puntuacio);
    }

    public int getDorsal()
    {
        return (this.dorsal);
    }

    public String getNom()
    {
        return (this.nom);
    }

    public String getPosIdeal()
    {
        return (this.posIdeal);
    }

    public int getNumGols()
    {
        return (this.numGols);
    }

    public int getNumPases()
    {
        return (this.numPases);
    }

    public int getPilotesPerdudes()
    {
        return (this.pilotesPerdudes);
    }

    public int getPilotesRecuperades()
    {
        return (this.pilotesRecuperades);
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setPosIdeal(String pos)
    {
        this.posIdeal = pos;
    }

    public void actualizarGoles(int gols)
    {
        this.numGols += gols;
    }

    public void actualizarPasesExito(int pases)
    {
        this.numPases += pases;
    }

    public void actualizarBalonesPerdidos(int perdues)
    {
        this.pilotesPerdudes += perdues;
    }

    public void actualizarBalonesRecuperados(int recuperades)
    {
        this.pilotesRecuperades += recuperades;
    }

    public boolean equals(Jugador j)
    {
        if (this.dorsal == j.getDorsal() && this.nom == j.getNom())
            return (true);
        return (false);
    }

    public String toString()
    {
        String s = "";

        s += "El jugador " + this.nom + " amb dorsal " + this.dorsal + " porta " + this.numGols + " gols i " + this.numPases + " pases";
        return (s);
    }
}
