package lectura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AccesoFicheroLectura {

	public static void main(String[] args) {

		LeerFichero fichero = new LeerFichero();
		
		Scanner opciones= new Scanner(System.in);
		System.out.println("Para leer el fichero, elije una opcion: \n1 - Caracter a caracter\n2 - Linea a Linea usando buffer");
		
		int seleccionar = opciones.nextInt(); 
		
		switch(seleccionar) {
			case 1 : 
				fichero.leerPorCaracter();
				break;
				
			case 2:
				fichero.leerPorBuffer();
				break;
			
			default:
				System.out.println("La opcion ingresada no es correcta");
			
		}
		
		opciones.close();
		
	}

}

class LeerFichero {
	
	FileReader entrada; 
	
	public void leerPorCaracter() {
		
		try {
			
			entrada = new FileReader("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Ejemplo Stream.txt");
			int c = 0;
			
			do {
				c = entrada.read();
				char letra = (char) c;
				
				if (c!= -1)
					System.out.print(letra);
				
			} while(c != -1);
			
			
		} catch (IOException e) {
			
			System.out.println("***No se pudo acceder al archivo... ");

		} finally {
			
			try {
				entrada.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void leerPorBuffer() {

		try {
			
			entrada = new FileReader("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Ejemplo Stream.txt");
			
			BufferedReader buffer = new BufferedReader(entrada);
			
			String linea = "";
			
			while(linea != null) {
				
				linea = buffer.readLine();
				
				if (linea != null)
					System.out.println(linea);
			}
			
		} catch (IOException e) {
			
			System.out.println("***No se pudo leer el buffer...");

		} finally {
		
			try {
				entrada.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}