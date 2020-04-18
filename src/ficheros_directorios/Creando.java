package ficheros_directorios;

import java.io.*;

public class Creando {
	public static void main(String[] args) {

		String rutaNuevoDirectorio = "C:" + File.separator + "desa" + File.separator + "apps" + File.separator + "was"
				+ File.separator + "RECURSOS EXTERNOS" + File.separator + "Ficheros y Directorios" + File.separator
				+ "Directorio Creado por Java.java";

		String rutaNuevoArchivo = "C:" + File.separator + "desa" + File.separator + "apps" + File.separator + "was"
				+ File.separator + "RECURSOS EXTERNOS" + File.separator + "Ficheros y Directorios" + File.separator
				+ "Directorio Creado por Java.java" + File.separator + "Archivo Creado por Java.txt";

		File ruta1 = new File(rutaNuevoDirectorio);
		ruta1.mkdir();

		File ruta2 = new File(rutaNuevoArchivo);
		try {
			ruta2.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String archivoDestino = ruta2.getAbsolutePath();

		Escribiendo accede_es = new Escribiendo();
		accede_es.escribir(archivoDestino);
	}
}

class Escribiendo {

	public void escribir(String rutaArchivo) {

		String frase = "Esto es un ejemplo de escritura sobre un archivo nuevo que esta sobre un directorio nuevo";

		try {

			FileWriter escritura = new FileWriter(rutaArchivo);

			for (int i = 0; i < frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}