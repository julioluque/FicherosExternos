package lectura;

import java.io.FileReader;
import java.io.IOException;

public class AccesoFicheroLectura {

	public static void main(String[] args) {

		LeerFichero fichero = new LeerFichero();
		
		fichero.leer();
		
	}

}

class LeerFichero {
	
	FileReader entrada; 
	
	public void leer() {
		
		try {
			entrada = new FileReader("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Ejemplo Stream.txt");
			
			int c;
			
			do {
				c = entrada.read();
				
				char letra = (char) c;
				System.out.print(letra);
			} while(c != -1);
			
			entrada.close();
			
		} catch (IOException e) {
			System.out.println("***No se pudo acceder al archivo... ");
//			e.printStackTrace();
		}
		
		
	}
	
}