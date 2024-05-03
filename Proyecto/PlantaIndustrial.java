
public class PlantaIndustrial {
	
	private PuntControl[] pcs;
	private String nom;
	
	public PlantaIndustrial(String nom, PuntControl[] pcs)
	{
		this.nom = nom;
		this.pcs = new PuntControl[pcs.length];
		for (int i = 0; i < pcs.length; i++)
			this.pcs[i] = new PuntControl(pcs[i]);
	}

	public boolean canviLocalitzacioPC(int id, Localitzacio localitzacio)
	{
		for (int i = 0; i < pcs.length; i++)
		{
			if (pcs[i].getId() == id)
			{
				pcs[i].setLocalitzacio(localitzacio);
				return (true);
			}
		}
		return false;
	}
	
	public boolean canviSensorPC(int id, Sensor s)
	{
		for (int i = 0; i < pcs.length; i++)
		{
			if (pcs[i].getId() == id)
			{
				pcs[i].setSensor(s);
				return (true);
			}
		}
		return false;
	}
	
	public int[] medir()
	{
		int[] llista = new int[5];
		int[] llista_errors;
		Medicio[] medicions;
		int resultatMedicio = 0;

		for (int j = 0; j < 5; j++)
			llista[j] = 0;
		for (int i = 0; i < pcs.length; i++)
		{
			medicions = pcs[i].pendreMesuresSensors();
			llista_errors = pcs[i].medicioSensor(medicions);
			for (int j = 0; j < llista_errors.length; j++)
			{
				resultatMedicio = llista_errors[j];
				if (resultatMedicio >= 0)
					llista[resultatMedicio]++;
			}
		}
		return (llista);
	}

	public int[][] medir2()
	{
		int[][] matriu_errors = new int[5][]; 
		int[] errors = new int[5];
		Medicio[] medicions; 		
		for (int i = 0; i < pcs.length; i++)
		{
			medicions = pcs[i].pendreMesuresSensors(); 
			int[] errorsPC = pcs[i].medicioSensor(medicions);
			for (int j = 0; j < errorsPC.length; j++) {
				if (errorsPC[j] > 0) { 
					errors[j] += errorsPC[j];
					if (matriu_errors[j] == null)
					{
						matriu_errors[j] = new int[pcs.length + 1]; 
						matriu_errors[j][0] = errors[j]; 
						matriu_errors[j][1] = i; 
					} 
					else
					{
						for (int k = 1; k < matriu_errors[j].length; k++) {
							if (matriu_errors[j][k] == 0) {
								matriu_errors[j][k] = i; 
								break;
							}
						}
					}
				}
			}
		}
		return matriu_errors;
	}


	public boolean[] manteniment()
	{
		boolean[] llista = new boolean[pcs.length];

		for (int i = 0; i < pcs.length; i++)
		{
			llista[i] = pcs[i].totsSensorsFuncionen();
		}
		return llista;
	}
	
	public String informeDiari() {
		String s;
		int[] llistaErrors=medir();
		s="Errors lectura: \n";
		for (int i=4;i>=0;i--) {
			s=s+"Errors tipus "+i+": "+ llistaErrors[i]+"\n";			
		}
		boolean[] canvis=manteniment();
		s=s+"\nCanvi de sensors: \n";
		for (int i=0;i<pcs.length;i++) {
			if (!canvis[i]) s=s+"Canviar sensor del punt de control "+i+"\n";			
		}
		return s;
	}
	
	public String getNom()
	{
		return (this.nom);
	}

	public PuntControl[] getPCS()
	{
		return (this.pcs);
	}
}
