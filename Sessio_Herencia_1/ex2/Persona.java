package ex2;

public class Persona
{
	private int dni;
	private String nombre;
	private String apellido1;
	private String apellido2;

	private static int mayoria_edad = 18;

	public Persona(int dni,  String nombre, String apellido1, String apellido2)
	{
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
	}
	
	public Persona(String nombre, String apellido1, String apellido2) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
	}

	public Persona(Persona p)
	{
		this.dni = p.dni;
		this.nombre = p.nombre;
		this.apellido1 = p.apellido1;
		this.apellido2 = p.apellido2;
	}
	
	public boolean equals(Object obj)
	{
		if (this == obj)
			return (true);
		if (obj == null)
			return (false);
		Persona other = (Persona) obj;
		return (this.dni == other.dni && this.nombre == other.nombre && this.apellido1 == other.apellido1
				&& this.apellido2 == other.apellido2);
	}

	// public int diferenciaEdad(int edad){
	// 	return Math.abs(this.edad-edad);
	// }
	
	//public int diferenciaEdad(Persona p){
	//	return Math.abs(p.data.difetenciaAnys(this.data));
	//}

	// public void aniversario(){
	// 	edad=edad+1;
	// }

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setNombre(String n) {
		nombre = n; 
	}

	public static int getMayoria_edad() {
		return mayoria_edad;
	}

	public static void setMayoria_edad(int mayoria_edad) {
		Persona.mayoria_edad = mayoria_edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String toString()
	{
		String s = "";

		s += "DNI: " + this.getDni() + "\n" +
			"Nombre y apellidos: " + this.getNombre() + " " + this.getApellido1() + " " + this.getApellido2();
		return (s);
	}

	//public int getEdad(Data data) {
	//	return data.difetenciaAnys(this.data);
	//}

// 	public void setEdad(int edad) {
// 		if (edad>=0 && edad<120){
// 			this.edad = edad;
// 		}
// 	}
 }
