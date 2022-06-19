package ar.unrn.aspect.main;

import ar.unrn.aspect.modelo.Arbitro;
import ar.unrn.aspect.modelo.Jugador;
import ar.unrn.aspect.modelo.Tecnico;

public class RegistroMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var jugador = new Jugador("Jugador");
		var arbitro = new Arbitro("Arbitro");

		var tecnico = new Tecnico("Tecnico");
		var otroArbitro = new Arbitro("Otro Arbitro");

		jugador.insultarA(arbitro);
		tecnico.insultarA(otroArbitro);
	}

}
