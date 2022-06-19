package ar.unrn.aspect.modelo;

public abstract class PersonaFutbol {
	private String nombre;

	public PersonaFutbol(String nombre) {
		this.nombre = nombre;
	}

	public void insultarA(PersonaFutbol unaPersona) {

		unaPersona.escuchar(this.insulto());
	}

	public void escuchar(String insulto) {

	}

	public String nombreDePersona() {
		return this.nombre;
	}

	public String insulto() {
		return "Insulto de la persona...";
	}

}
