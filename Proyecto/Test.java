
public class Test {
	public static void main(String[] args)
	{
		Humitat mesuraHumitat = new Humitat();
		Temperatura mesuraTemperatura = new GrausCelciusTemperatura();
		ConcentracioCO2 mesuraConcentracioCO2 = new PpmConcentracio();

		Sensor sensorTemperatura = new SensorTemperatura(1, mesuraTemperatura);
		Sensor sensorHumitat = new SensorHumitat(2, mesuraHumitat);
		Sensor sensorConcentracioCO2= new SensorConcentracioCO2(3, mesuraConcentracioCO2);

		Sensor sensors[] = new Sensor[3];
		sensors[0] = (Sensor)sensorTemperatura.clone();
		sensors[1] = (Sensor)sensorHumitat.clone();
		sensors[2] = (Sensor)sensorConcentracioCO2.clone();
		if (sensors[0].getUnitatMesura() == null)
			System.out.println("Aqui esta vacio");

		Localitzacio reactor1 = new Localitzacio("Reactor 1",40.4165,2.5025, 66); 
		Localitzacio reactor2 = new Localitzacio("Reactor 2",40.3818,2.1685, 13); 
		Localitzacio reactor3 = new Localitzacio("Reactor 3",40.3828,2.1685, 11);
		
		PuntControl puntControl1 = new PuntControl(1, reactor1, sensors);
		PuntControl puntControl2 = new PuntControl(2, reactor2, sensors);
		PuntControl puntControl3 = new PuntControl(3, reactor3, sensors);
		PuntControl[] puntosControl = new PuntControl[3];
		puntosControl[0] = new PuntControl(puntControl1);
		puntosControl[1] = new PuntControl(puntControl2);
		puntosControl[2] = new PuntControl(puntControl3);

		PlantaIndustrial planta = new PlantaIndustrial("Nuestra Planta", puntosControl);

		int[] llista = planta.medir();
		System.out.println("Errors que s'han produit:");
		for (int i = 0; i < llista.length; i++)
		{
			System.out.println("Errores de tipo " + i + ": " + llista[i]);
		}

		int j = 0;
		for (int i = 0; i < puntosControl.length; i++)
		{
			j = 0;
			PuntControl p = new PuntControl(planta.getPCS()[i]);
			System.out.println("Punt de control:\n" + p);
			while (j < planta.getPCS()[i].getSensors().length)
			{
				Sensor s = (Sensor)planta.getPCS()[i].getSensors()[j].clone();
				System.out.println("Sensor: \n" + s);
				j++;
			}
		}

		System.out.println("Punts de Control que no funcionen correctament:");
		for (int i = 0; i < puntosControl.length; i++)
		{
			if (planta.getPCS()[i].totsSensorsFuncionen() == false)
				System.out.println(planta.getPCS()[i]);
		}
		System.out.println("\n");

		planta.getPCS()[1].getSensors()[0].setFunciona(false);
		System.out.println("Punts de Control que no funcionen correctament:");
		for (int i = 0; i < puntosControl.length; i++)
		{
			if (planta.getPCS()[i].totsSensorsFuncionen() == false)
				System.out.println(planta.getPCS()[i] + "\n");
		}

		if (planta.getPCS()[1].substituirSensor(sensorTemperatura))
			System.out.println("Sensor cambiado correctamente");
		else
			System.out.println("Fallo al cambiar el sensor");
		
		System.out.println("\n");

		//if (planta.getPCS()[1].substituirSensor(sensorHumitat))
		//	System.out.println("Sensor cambiado correctamente");
		//else
		//	System.out.println("Fallo al cambiar el sensor");

		System.out.println(planta.getPCS()[1].getSensors()[1].getUnitatMesura().getNom());
		planta.getPCS()[1].getSensors()[1].convertirMesures(new KelvinsTemperatura());
		System.out.println(planta.getPCS()[1].getSensors()[2].getUnitatMesura().getNom());
		planta.getPCS()[1].getSensors()[2].convertirMesures(new Microgramsmetre3Concentracio());

	}

}
