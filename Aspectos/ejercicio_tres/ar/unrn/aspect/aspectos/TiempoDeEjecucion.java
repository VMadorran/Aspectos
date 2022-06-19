package ar.unrn.aspect.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TiempoDeEjecucion {

	@Around("execution(* *(..)) && @annotation(Time)")
	public void calcularTiempoDeEjecucion(ProceedingJoinPoint joinPoint) {

		long tiempoResultante = 0;
		long inicioDeEjecucion = System.nanoTime();
		try {
			joinPoint.proceed();
			long finDeEjecucion = System.nanoTime();
			tiempoResultante = finDeEjecucion - inicioDeEjecucion;
			System.out.println("Tiempo de ejecucion: " + tiempoResultante + " nanosegundos");

		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
