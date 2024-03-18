public class Equipo {
    private Jugador[] equip;
    private int numJugadors;
    private String nom;
    private static int MAXIM_JUGADORS = 25;

    public Equipo(String nom)
    {
        this.equip = new Jugador[MAXIM_JUGADORS];
        this.numJugadors = 0;
        this.nom = nom;
    }

    public int getNumJugadores()
    {
        return (this.numJugadors);
    }

    public boolean estaCompleto()
    {
        if (numJugadors == MAXIM_JUGADORS)
            return (true);
        return (false);
    }

    public boolean anadir(Jugador j)
    {
        if (estaCompleto())
            return (false);
        if (getJugador(j.getDorsal()) != null)
            return (false);
        equip[numJugadors] = new Jugador(j);
        numJugadors++;
        return (true);
    }

    public boolean eliminar(int dorsal)
    {
        int i = 0;

        while (i < numJugadors && equip[i].getDorsal() != dorsal)
            i++;
        if (i == numJugadors)
            return (false);
        for (int j = i; j < numJugadors - 1; j++)
        {
            equip[i] = equip[i + 1];
        }
        numJugadors--;
        equip[numJugadors] = null;
        return (true);
    }

    public Jugador getJugador(int dorsal)
    {
        for (int i = 0; i < numJugadors; i++)
        {
            if (this.equip[i].getDorsal() == dorsal)
                return (this.equip[i]);
        }
        return (null);
    }

    public int valor()
    {
        int valor = 0;

        for (int i = 0; i < numJugadors; i++)
        {
            valor += equip[i].puntuacio();
        }
        return (valor);
    }

    public Jugador jugadorMasValioso()
    {
        if (numJugadors == 0)
            return (null);
        Jugador max = equip[0];
        for (int i = 1; i < numJugadors; i++)
        {
            if (equip[i].puntuacio() > max.puntuacio())
                max = equip[i];
        }
        return (max);
    }

    public String toString()
    {
        String auxJugadors = "";

        for (int i=0; i < numJugadors; i++)
        {
            auxJugadors += equip[i] + "\n";
        }
        return ("Equip [\nJugadors: " + auxJugadors + "\nNumJugadors = " + this.numJugadors +
                "\nNom: " + this.nom + "]");
    }
}
