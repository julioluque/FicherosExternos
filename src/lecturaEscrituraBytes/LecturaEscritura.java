package lecturaEscrituraBytes;

import java.io.FileInputStream;
import java.io.IOException;


public class LecturaEscritura {

	public static void main (String [] args) {
		
		System.out.println("\n***Start!");
				
		int i = 0;
		
		try {
			
			FileInputStream archivoLectura = new FileInputStream("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Avion 1.jpg");
			
			boolean finalAr = false;
			
			while(!finalAr) {
				int byteEntrada = archivoLectura.read();
				
				if (byteEntrada == -1) {
		
					finalAr = true;
				}

				System.out.println(byteEntrada);
				
				i++;
			}
			
			archivoLectura.close();
			System.out.println("\n***Done! -> " + i + " bytes");
		} catch (IOException e) {
			System.out.println("\n***Fail!");
		}
		
	}
	
}
