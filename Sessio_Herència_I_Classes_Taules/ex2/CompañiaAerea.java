package ex2;

public class CompañiaAerea
{
	private String[] nombreAeropuertos;
	private int[][] duracionVuelos;
	private int numAeropuertos;

	public CompañiaAerea(String[] aeroupertos)
	{
		this.numAeropuertos = aeroupertos.length;
		nombreAeropuertos = new String[this.numAeropuertos];
		for (int i = 0; i < numAeropuertos; i++)
		{
			nombreAeropuertos[i] = aeroupertos[i];
		}
		duracionVuelos = new int[numAeropuertos][numAeropuertos];
		for (int i = 0; i < numAeropuertos; i++)
		{
			for (int j = 0; j < numAeropuertos; j++)
			{
				duracionVuelos[i][j] = 0;
			}
		}
	}

	public boolean actualitzaDuracioVol(String origen, String desti, int duracion)
	{
		int id_origen = -1;
		int id_desti = -1;

		for (int i = 0; i < nombreAeropuertos.length; i++)
		{
			if (nombreAeropuertos[i] == origen)
				id_origen = i;
			if (nombreAeropuertos[i] == desti)
				id_desti = i;
		}
		if (id_origen == -1 || id_desti == -1 || id_origen == id_desti || duracion < 0)
			return (false);
		duracionVuelos[id_origen][id_desti] = duracion;
		return (true);
	}

	public int duracioVol(String origen, String desti)
	{
		int id_origen = -1;
		int id_desti = -1;

		for (int i = 0; i < nombreAeropuertos.length; i++)
		{
			if (nombreAeropuertos[i] == origen)
				id_origen = i;
			if (nombreAeropuertos[i] == desti)
				id_desti = i;
		}
		if (id_desti != -1 && id_origen != -1)
		{
			return (duracionVuelos[id_origen][id_desti]);
		}
		return (0);
	}

	public boolean hayVuelo(String origen, String desti)
	{
		int id_origen = -1;
		int id_desti = -1;

		for (int i = 0; i < nombreAeropuertos.length; i++)
		{
			if (nombreAeropuertos[i] == origen)
				id_origen = i;
			if (nombreAeropuertos[i] == desti)
				id_desti = i;
		}
		if (id_desti != -1 && id_origen != -1)
		{
			if (duracionVuelos[id_origen][id_desti] > 0)
				return (true);
		}
		return (false);
	}
}
