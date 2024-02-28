
public class TestPersona {
		public static void main(String[] args)
		{
			Persona  persona;
			Data data = new Data(28, 10, 2002);

			persona = new  Persona(2, "Eva", data);
			data.setAny(2020);
			System.out.println("Persona2: " + 
					" DNI:" +persona.getDni() + 
					" Nombre: " +persona.getNombre()+
					" Edad: " +  persona.getEdad(data)+ 
					" Mayoria Edad: "+Persona.getMayoria_edad()); 
			System.out.println("Com veiem, al canviar la data després de posar-li a persona, aquesta no es modifica i l'edat es != 0");
		}
}
