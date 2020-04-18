package ficheros_directorios;

import java.io.*;

public class Rutas {

	public static void main(String[] args) {

		// cuando pasamos directamente el nombre del archivo, toma como ruta el workspace actual
		File archivo = new File("Readme.md");
		
		System.out.println(archivo.getAbsolutePath());
		
		System.out.println(archivo.exists());
	}

}
