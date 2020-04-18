package lectura_escritura_bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class LecturaEscritura {

	public static void main (String [] args) {
		
		System.out.println("\n***Start!");
		
		int datosEntrada[] = new int [409210];
		
		int i = 0;
		
		try {
			
			FileInputStream archivoLectura = new FileInputStream("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Avion 1.jpg");
			
			boolean finalAr = false;
			
			while(!finalAr) {
				int byteEntrada = archivoLectura.read();
				
				if (byteEntrada != -1) {
					
					datosEntrada[i] = byteEntrada;
					
				} else {
					
					finalAr = true;
				}

				System.out.println(datosEntrada[i]);
				
				i++;
			}
			
			archivoLectura.close();
			System.out.println("\n***Done! -> " + i + " bytes");
		} catch (IOException e) {
			System.out.println("\n***Error en la lectura!");
		}
		
		creaFichero(datosEntrada);
		
	}
	
	static void creaFichero(int datosNuevoFichero[]) {
		
		try {
			
			FileOutputStream ficheroNuevo = new FileOutputStream("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Avion 1 - Creado por java.jpg");
			
			for(int i = 0; i < datosNuevoFichero.length; i++) {
				
				ficheroNuevo.write(datosNuevoFichero[i]);
				
			}
			
			ficheroNuevo.close();
			
		} catch (IOException e) {
			
			System.out.println("\n***Error en la escritura!");
			
		}
		
	}
	
}
