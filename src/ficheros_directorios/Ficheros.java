package ficheros_directorios;

import java.io.*;

public class Ficheros {
	public static void main(String[] args) {
		
		String rutaProyecto = "C:/desa/apps/was/FicherosExternos";
		String rutaExternos = "C:/desa/apps/was/RECURSOS EXTERNOS/Ficheros y Directorios";
		
		File ruta = new File(rutaExternos);
		
		String [] listaDeArchivos = ruta.list();

		System.out.println("Existe? " + ruta.exists());
		System.out.println("Archivos de la carpeta: " + ruta.getAbsolutePath());

		for (String s : listaDeArchivos) {
			System.out.println("\t" + s);
		}

	}
}
