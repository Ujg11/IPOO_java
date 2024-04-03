package ex3;

public class ProvaSocis {

	public static void main(String[] args) {
		Soci[] socios = {new Soci5Activitats("45778967A","Iker Garrido",2),
				          new Soci5Activitats("34567896E","Juan Lopez",5),
				          new Soci10Activitats("56738965F","Pepe Martin",5),
				          new Soci10Activitats("40896552C","Maria Pompas",6),
				          new Soci10Activitats("41654329H","Isabel Perez",10),
				          new SociObert("43456796D","Ariadna Marin")};
		for (int i=0; i<socios.length;++i) {
			System.out.println(socios[i]);
			//System.out.println("Cuota mensual: "+socios[i].quotaMensual());
			System.out.println();
		}
	}
}
