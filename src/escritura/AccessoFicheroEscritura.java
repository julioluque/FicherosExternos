package escritura;

import java.io.FileWriter;
import java.io.IOException;

public class AccessoFicheroEscritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EscribirFichero fichero = new EscribirFichero();
		
		fichero.escribir();
		
	}

}

class EscribirFichero {

	String frase = "Prueba de escritura";
	
	public void escribir() {
		try {
			
			FileWriter salida = new FileWriter("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Ejemplo Stream Nuevo.txt");

			for (int i = 0; i<frase.length(); i++) {
				
				salida.write(frase.charAt(i));
				
				System.out.print(frase.charAt(i));
			}
			
			salida.close();
			
		} catch (IOException e) {
			
			System.out.println("No se pudo crear el nuevo fichero");
			e.printStackTrace();
			
		}

	}

}
