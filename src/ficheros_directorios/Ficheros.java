package ficheros_directorios;

import java.io.*;

public class Ficheros {
	public static void main(String[] args) {
		
		String ruta1 = "C:/desa/apps/was/FicherosExternos";
		String ruta2 = "C:/desa/apps/was/RECURSOS EXTERNOS/Ficheros y Directorios";
		
		File rutaExterna = new File(ruta2);
		
		System.out.println("Existe? " + rutaExterna.exists());
		System.out.println("Archivos de la carpeta: " + rutaExterna.getAbsolutePath());

		String [] listaDeArchivos = rutaExterna.list();

		for (String archivo : listaDeArchivos) {
			System.out.println("\t- " + archivo);
			
			File rutaInterna = new File(rutaExterna.getAbsoluteFile(),archivo);
			
			if (rutaInterna.isDirectory()) {
				String [] listaDeSubArchivos = rutaInterna.list();
				
				for (String subArchivo : listaDeSubArchivos) {
					System.out.println("\t  - " + subArchivo);
					
				}
				
				
			}
			
		}

	}
}
