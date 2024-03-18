package ex1;
public class Ordenador
{
	private String procesador;
	private double velocidad;
	private int RAM;

	public Ordenador(String procesador, double velocidad, int RAM) {
		super();
		this.procesador = procesador;
		this.velocidad = velocidad;
		this.RAM = RAM;
	}

	public Ordenador(Ordenador o) {
		super();
		this.procesador = o.procesador;
		this.velocidad = o.velocidad;
		this.RAM = o.RAM;
	}

	public String getProcesador() {
		return procesador;
	}
	
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	
	public double getVelocidad() {
		return velocidad;
	}
	
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	
	public int getRAM() {
		return RAM;
	}
	
	public void setRAM(int RAM) {
		this.RAM = RAM;
	}
	
	public String toString(){
		return "Procesador: " + procesador + "\n" +
				"Velocidad: " + velocidad + " GHz" + "\n" +
				"Memoria RAM: " + RAM + " MB";
	}

	public boolean equals(Object obj)
	{
		if (this == obj)
			return (true);
		if (obj == null)
			return (false);
		Ordenador other = (Ordenador) obj;
		return (this.procesador == other.procesador && this.RAM == other.RAM 
			&& this.velocidad == other.velocidad);
	}
}
