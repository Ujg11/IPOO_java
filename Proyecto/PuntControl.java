public class PuntControl
{
	private int id;
	private Localitzacio localitzacio;
	private Sensor[] sensors;

	private Medicio[] medicionsHistoriques;
	private int mesuresHistoric;

	private static int MAXIM_MESURES = 365;
	
	public PuntControl(int id, Localitzacio l, Sensor[] s)
	{
		this.id = id;
		this.localitzacio = l;
		this.sensors = new Sensor[s.length];
		for (int i = 0; i < s.length; i++)
			sensors[i] = (Sensor)s[i].clone();
		this.mesuresHistoric = 0;
		medicionsHistoriques = new Medicio[MAXIM_MESURES];
		for (int i = 0; i < MAXIM_MESURES; i++)
		{
			medicionsHistoriques[i] = null;
		}
	}

	public PuntControl(PuntControl p)
	{
		if (p != null)
		{
			this.id = p.id;
			this.localitzacio = new Localitzacio(p.localitzacio);
			this.sensors = new Sensor[p.sensors.length];
			for (int i = 0; i < this.sensors.length; i++)
			{
				this.sensors[i] = (Sensor)p.sensors[i].clone();
			}
			this.mesuresHistoric = p.mesuresHistoric;
			this.medicionsHistoriques = new Medicio[MAXIM_MESURES];
			Medicio[] aux = p.getMedicionsHistoriques();
			for (int i = 0; i < MAXIM_MESURES; i++)
				this.medicionsHistoriques[i] = null;
			if (aux != null)
			{
				for (int j = 0; j < aux.length; j++)
				this.medicionsHistoriques[j] = aux[j];
			}
		}   
	}

	public double mitjanaNMesures(int N, UnitatMesura unitat)
	{
		double mitjana;
		int cont = 0;
		double sumaValors = 0;
		Medicio[] medicions = getMedicionsHistoriques();

		if (N <= 0)
			return (0);
		if (mesuresHistoric == 0 && unitat != null)
			return (0);
		for (int i = medicions.length - 1; i >= 0; i--)
		{
			if (medicions[i] != null && medicions[i].getUnitatMesura().getNom().equals(unitat.getNom()))
			{
				cont++;
				sumaValors += medicions[i].getValor();
			}
			if (cont == N)
				break;
		}
		if (N > cont)
			N = cont;
		mitjana = sumaValors / N;
		return (mitjana);
	}

	public double mitjanaHistorica(UnitatMesura u)
	{
		double mitjana;
		int cont = 0;
		double sumaValors = 0;
		Medicio[] medicions = getMedicionsHistoriques();

		if (mesuresHistoric == 0 && u != null)
			return (0);
		for (int i = 0; i < medicions.length; i++)
		{
			if (medicions[i] != null && medicions[i].getUnitatMesura().getNom().equals(u.getNom()))
			{
				sumaValors += medicions[i].getValor();
				cont++;
			}
		}
		mitjana = sumaValors / cont;
		return (mitjana);
	}

	public Medicio medicioMesAlta(UnitatMesura u)
	{
		Medicio medicioMaxima = null;
		Medicio[] medicions = getMedicionsHistoriques();

		if (mesuresHistoric == 0 || u == null || medicions == null)
			return (null);
		for (int i = 0; i  < medicions.length; i++)
		{
			if (medicions[i] != null && medicions[i].getUnitatMesura().getNom().equals(u.getNom()))
			{
				medicioMaxima = medicions[i];
				break;
			}
		}
		if (medicioMaxima == null)
			return (null);
		for (int i = 0; i < medicions.length; i++)
		{
			if (medicions[i] != null && medicions[i].getUnitatMesura().getNom().equals(u.getNom()))
			{
				if (medicions[i] != null && medicioMaxima.getValor() < medicions[i].getValor())
					medicioMaxima = medicions[i];
			}
		}
		return (new Medicio(medicioMaxima));
	}

	public Medicio[] pendreMesuresSensors()
	{
		Medicio[]	medicions = new Medicio[sensors.length];
		Medicio		novaM;
	
		for (int i = 0; i < sensors.length; i++)
		{
			novaM = sensors[i].novaMesura();
			medicions[i] = new Medicio(novaM);
			if (mesuresHistoric < MAXIM_MESURES && novaM != null)
			{
				medicionsHistoriques[mesuresHistoric] = new Medicio(novaM);
				mesuresHistoric++;
			}
		}
		return (medicions);
	}

	public Medicio[] remedicions()
	{
		int			numRemedicions = this.sensors.length;
		Medicio[]	novesMedicions = new Medicio[numRemedicions];
		Medicio		m;
		int			cont = 0;
	
		for (int i = 0; i < sensors.length; i++)
		{
			m = sensors[i].novaMesura();
			novesMedicions[i] = new Medicio(m);
		}
		for (int i = numRemedicions; i > 0; i--)
		{
			if (mesuresHistoric - numRemedicions >= 0)
			{
				medicionsHistoriques[mesuresHistoric - i] = novesMedicions[cont];
				cont++;
			}
		}
		return (novesMedicions);
	}

	public int[] medicioSensor(Medicio[] medicions)
	{
		int[] array = new int[medicions.length];
		int valor;

		for (int i = 0; i < medicions.length; i++)
		{
			Medicio m = medicions[i];
			if (m == null)
				valor = -1;
			else if (!sensors[i].dinsLlindar(m.getValor()))
				valor = 4;
			else if (m.getValor() > medicioMesAlta(sensors[i].getUnitatMesura()).getValor())
				valor = 3;
			else if (m.getValor() > mitjanaHistorica(sensors[i].getUnitatMesura()))
				valor = 2;
			else if (m.getValor() > mitjanaNMesures(7, sensors[i].getUnitatMesura()))
				valor = 1;
			else
				valor = 0;
			array[i] = valor;
		}
		return (array);
	}

	public boolean totsSensorsFuncionen()
	{
		for (int i = 0; i < sensors.length; i++)
		{
			if (sensors[i].getFunciona() == false)
				return (false);
		}
		return (true);
	}

	public boolean substituirSensor(Sensor s)
	{
		for(int i = 0; i < this.sensors.length; i++)
		{
			if (this.sensors[i] != null && this.sensors[i].getUnitatMesura().equals(s.getUnitatMesura()))
			{
				this.sensors[i] = (Sensor)s.clone();
				return (true);
			}
		}
		return (false);
	}

	public Medicio[] getMedicionsHistoriques()
	{
		if (this.mesuresHistoric == 0)
			return (null);
		Medicio[] medicions = new Medicio[this.medicionsHistoriques.length];
	
		for (int i = 0; i < medicions.length; i++)
		{
			medicions[i] = new Medicio(medicionsHistoriques[i]);
		}
		return (medicionsHistoriques);
	}

	public String toString()
	{
		String s = "";

		s += "Id: " + id;
		return (s);
	}

	public int getId()
	{
		return (this.id);
	}

	public Localitzacio getLocalitzacio()
	{
		return (this.localitzacio);
	}

	public Sensor[] getSensors()
	{
		return (this.sensors);
	}

	public int getMesuresHistoric()
	{
		return (this.mesuresHistoric);
	}

	public static int getMAXIM_MESURES()
	{
		return (MAXIM_MESURES);
	}

	public void setSensor(Sensor s)
	{
		int j = 0;

		for (int i = 0; i < sensors.length; i++)
		{
			if (sensors[i] != null && sensors[i].getUnitatMesura().getNom().equals(s.getUnitatMesura().getNom()))
			{
				sensors[i] = (Sensor)s.clone();
				return ;
			}
		}
		int len = sensors.length;
		Sensor nousSensors[] = getSensors();
		this.sensors = new Sensor[len + 1];
		for (j = 0; j < nousSensors.length; j++)
		{
			sensors[j] = nousSensors[j];
		}
		sensors[j] = (Sensor)s.clone();
	}

	public boolean eliminarSensor(int id)
	{
		Sensor[] s; 
		boolean flag = false;
		int cont;
	
		for (int i = 0; i < this.sensors.length; i++)
			if (sensors[i].getIdInstrument() == id)
				flag = true;
		if (flag)
		{
			s = new Sensor[this.sensors.length - 1];
			cont = 0;
			for (int i = 0; i < this.sensors.length; i++)
			{
				if (sensors[i].getIdInstrument() != id)
				{
					s[cont] = (Sensor)sensors[i].clone();
					cont++;
				}
			}
			this.sensors = s;
			return (true);
		}
		return (false);
	}

	public void setSensors(Sensor[] s)
	{
		this.sensors = new Sensor[s.length];
		for (int i = 0; i < s.length; i++)
		{
			this.sensors[i] = (Sensor)s[i].clone();
		}
	}

	public void setLocalitzacio(Localitzacio l)
	{
		this.localitzacio = new Localitzacio(l);
	}
}
