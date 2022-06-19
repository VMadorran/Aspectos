package ar.unrn.aspect.modelo;

public class Persona {
	private String nombre;
	private int id;

	public Persona(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}

	public String datosPersona() {
		return this.nombre + " " + this.id + "\n";
	}

}
