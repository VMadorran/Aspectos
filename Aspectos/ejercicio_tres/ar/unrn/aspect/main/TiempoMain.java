package ar.unrn.aspect.main;

import ar.unrn.aspect.aspectos.Time;
import ar.unrn.aspect.modelo.Persistencia;
import ar.unrn.aspect.modelo.Persona;
import ar.unrn.aspect.persistencia.EnArchivo;
import ar.unrn.aspect.persistencia.EnBase;

public class TiempoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var archivo = new EnArchivo();

		agregarPersonas(archivo, 10);
		agregarPersonas(archivo, 100);

	}

	@Time
	static void agregarPersonas(Persistencia persistencia, int cantidad) {

		for (int i = 0; i < cantidad; i++) {

			var persona = new Persona("Persona", i);
			persistencia.registrar(persona.datosPersona());
		}

	}

}
