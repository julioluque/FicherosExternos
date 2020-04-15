package lectura;

import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {

	public static void main(String[] args) {

		LeerFichero accediendoCodigosStream = new LeerFichero();
		
		accediendoCodigosStream.leer();
		
	}

}

class LeerFichero {
	 
	public void leer() {
		
		try {
			FileReader entrada = new FileReader("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Ejemplo Stream.txt");
			
			int c = entrada.read();  //Guardamos el primer caracter en codigo entero
			
			while(c != -1) {
				
				c = entrada.read();
				
				char letra = (char) c;
				System.out.print(letra);
			}
			
		} catch (IOException e) {
			System.out.println("***No se encontro el archivo... ");
			e.printStackTrace();
		} finally {
			
		}
		
		
	}
	
}