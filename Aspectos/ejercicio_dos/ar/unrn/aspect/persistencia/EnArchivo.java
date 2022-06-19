package ar.unrn.aspect.persistencia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import ar.unrn.aspect.modelo.Persistencia;

public class EnArchivo implements Persistencia {

	@Override
	public void registrar(String dato) {
		// TODO Auto-generated method stub

		try {
			String ruta = "C:\\Users\\valen\\Desktop\\Registro de personas.txt";
			Files.write(Paths.get(ruta), dato.getBytes(), StandardOpenOption.APPEND);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
