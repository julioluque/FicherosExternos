package lecturaEscritura;

import java.util.Scanner;

public class Acceso {

	public static void main(String[] args) {

		LeerFichero fichero = new LeerFichero();
		EscribirFichero fichero2 = new EscribirFichero();
		
		Scanner opciones= new Scanner(System.in);
		System.out.println("Para usar un fichero, elije una opcion: \n1 - Caracter a caracter\n2 - Linea a Linea usando buffer\n3 - Escribir nuevo archivo");
		

		
		int seleccionar = opciones.nextInt(); 
		
		switch(seleccionar) {
			case 1 : 
				fichero.leerPorCaracter();
				break;
				
			case 2:
				fichero.leerPorBuffer();
				break;
				
			case 3:
				Scanner nuevaFrase = new Scanner(System.in);
				String frase = nuevaFrase.next();
				System.out.println("Enviando...");
				fichero2.escribir(frase);
				nuevaFrase.close();
				
				break;
			
			default:
				System.out.println("La opcion ingresada no es correcta");
			
		}
		
		opciones.close();
		
	}

}
		
		
		
