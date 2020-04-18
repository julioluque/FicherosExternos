package lectura_escritura_caracteres;

import java.util.Scanner;

public class Acceso {

	public static void main(String[] args) {

		LeerFichero leerFichero = new LeerFichero();
		EscribirFichero escribirFichero = new EscribirFichero();

		Scanner opciones = new Scanner(System.in);
		System.out.println(
				"Para usar un fichero, elije una opcion: \n"
				+ "1 - Leer Caracter a caracter\n"
				+ "2 - Leer Linea a Linea usando buffer\n"
				+ "3 - Escribir nuevo archivo\n"
				+ "4 - Escribir un documento");
		
		int seleccionar = opciones.nextInt();

		switch (seleccionar) {
		case 1:
			leerFichero.leerPorCaracter();
			break;

		case 2:
			leerFichero.leerPorBuffer();
			break;

		case 3:
			Scanner teclado1 = new Scanner(System.in);
			String frase = teclado1.nextLine();
			System.out.println("Enviando...");
			escribirFichero.escribirPorCaracter(frase);
			teclado1.close();
			break;

		case 4:
			Scanner teclado2 = new Scanner(System.in);
			String texto = teclado2.nextLine();
			System.out.println("Enviando: " + texto);
			escribirFichero.escribirPorBuffer(texto);
			teclado2.close();
			break;

		default:
			System.out.println("La opcion ingresada no es correcta");

		}

		opciones.close();

	}

}
