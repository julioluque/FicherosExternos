package escritura;

import java.io.FileWriter;
import java.io.IOException;

public class AccessoFicheroEscritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EscribirFichero fichero2 = new EscribirFichero();
		fichero2.escribir();

	}

}

class EscribirFichero {

	String frase = "Prueba de escritura nuevo .... 1234567890";

	public void escribir() {
		try {

			FileWriter salida = new FileWriter("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Ejemplo Stream Nuevo.txt", true);

			for (int i = 0; i < frase.length(); i++) {

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
