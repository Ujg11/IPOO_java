
public class Persona
{
	private Data data;
	private int dni;
	private String nombre;
	private static int mayoria_edad = 18;

	public Persona(int dni,  String nombre, Data data) {
		this.nombre = nombre;
		this.dni = dni;
		this.data = new Data(data);
	}
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(){

	}
	
	// public int diferenciaEdad(int edad){
	// 	return Math.abs(this.edad-edad);
	// }
	
	public int diferenciaEdad(Persona p){
		return Math.abs(p.data.difetenciaAnys(this.data));
	}

	// public void aniversario(){
	// 	edad=edad+1;
	// }

	public String getNombre() {
		return nombre;
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

	public int getEdad(Data data) {
		return data.difetenciaAnys(this.data);
	}

// 	public void setEdad(int edad) {
// 		if (edad>=0 && edad<120){
// 			this.edad = edad;
// 		}
// 	}
 }
