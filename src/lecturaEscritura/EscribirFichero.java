package lecturaEscritura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {


	public void escribirPorCaracter(String frase) {
		try {

			FileWriter salida = new FileWriter("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Ejemplo Stream Nuevo.txt",
					true);

			for (int i = 0; i < frase.length(); i++) {

				salida.write(frase.charAt(i));

				System.out.print(frase.charAt(i));
			}

			salida.close();
			System.out.println("\n***Done!");
		} catch (IOException e) {

			System.out.println("No se pudo crear el nuevo fichero");
			e.printStackTrace();

		}

	}
	

	public void escribirPorBuffer(String frase) {
		try {

			FileWriter salida = new FileWriter("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Ejemplo Stream Nuevo.txt");
			BufferedWriter buffer = new BufferedWriter(salida);
			
			for (int i = 1; i <= 20; i++) {
				buffer.write(i + " - " + frase);
				buffer.newLine();
				buffer.flush();
			}
			
			salida.close();
			
			System.out.println("\n***Documento creado");
		} catch (IOException e) {

			System.out.println("No se pudo crear el nuevo fichero");
			e.printStackTrace();

		}

	}

}
