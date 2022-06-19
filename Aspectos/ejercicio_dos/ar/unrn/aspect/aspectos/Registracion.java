package ar.unrn.aspect.aspectos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import ar.unrn.aspect.modelo.Persona;
import ar.unrn.aspect.modelo.PersonaFutbol;
import ar.unrn.aspect.persistencia.EnArchivo;
import ar.unrn.aspect.persistencia.EnBase;

@Aspect
public class Registracion {

	@Before("execution(* ar.unrn.aspect.modelo.PersonaFutbol.insultarA(..))")
	public void registrar(JoinPoint joinPoint) {
		PersonaFutbol personaQueInsulta = (PersonaFutbol) joinPoint.getThis();

		PersonaFutbol insultado = (PersonaFutbol) joinPoint.getArgs()[0];

		var archivo = new EnArchivo();
		archivo.registrar(personaQueInsulta.nombreDePersona() + ", " + personaQueInsulta.insulto() + ", "
				+ insultado.nombreDePersona() + "\n");
		var base = new EnBase();
		base.registrar(personaQueInsulta.nombreDePersona() + ", " + personaQueInsulta.insulto() + ", "
				+ insultado.nombreDePersona() + "\n");

	}

}
