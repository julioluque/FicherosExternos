package ficheros_directorios;

import java.io.File;

public class Eliminar {

	public static void main(String[] args) {

		String rutaNuevoDirectorio = "C:" + File.separator + "desa" + File.separator + "apps" + File.separator + "was"
				+ File.separator + "RECURSOS EXTERNOS" + File.separator + "Ficheros y Directorios" + File.separator
				+ "Directorio Creado por Java";

		String rutaNuevoArchivo = "C:" + File.separator + "desa" + File.separator + "apps" + File.separator + "was"
				+ File.separator + "RECURSOS EXTERNOS" + File.separator + "Ficheros y Directorios" + File.separator
				+ "Directorio Creado por Java" + File.separator + "Archivo Creado por Java.txt";

		File rutaDirectorio = new File(rutaNuevoDirectorio);
		File rutaArchivo = new File(rutaNuevoArchivo);
		
		rutaArchivo.delete();
		rutaDirectorio.delete();
		
	}

}
