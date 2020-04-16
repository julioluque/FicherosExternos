package lecturaEscrituraCaracteres;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	FileReader entrada;

	public void leerPorCaracter() {

		try {

			entrada = new FileReader("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Ejemplo Stream.txt");
			int c = 0;

			do {
				c = entrada.read();
				char letra = (char) c;

				if (c != -1)
					System.out.print(letra);

			} while (c != -1);

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

			while (linea != null) {

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