package serializacion;

import java.util.*;
import java.io.*;

public class Serializando {

	public static void main(String[] args) {

		Administrador jefe = new Administrador("Juan", 78000, 2003, 12, 25);
		jefe.setIncentivo(5000);

		Empleado[] personal = new Empleado[3]; // vamos a serializar este objeto

		personal[0] = jefe;
		personal[1] = new Empleado("Ana", 25000, 2008, 04, 13);
		personal[2] = new Empleado("Martin", 75000, 2005, 10, 23);

		try {
			// Creamos nuevo archivo en la ruta especificada
//			ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
//					new FileOutputStream("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Empleados Serializado.txt"));
//
//			escribiendoFichero.writeObject(personal);
//			escribiendoFichero.close();

			// Recuperamos el archivo anterior de la ruta especificada
			ObjectInputStream recuperandoFichero = new ObjectInputStream(
					new FileInputStream("C:/desa/apps/was/RECURSOS EXTERNOS/Streams/Empleados Serializado.txt"));

			Empleado[] personalRecuperado = (Empleado[]) recuperandoFichero.readObject();
			recuperandoFichero.close();

			// Imprimimos por consola
			for (Empleado e : personalRecuperado) {
				System.out.println(e);
			}

		} catch (Exception e) {

		}

	}

}

class Empleado implements Serializable {

	private String nombre;
	private int sueldos;
	private Date fechaContrato;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldos() {
		return sueldos;
	}

	public void setSueldos(int sueldos) {
		this.sueldos = sueldos;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldos=" + sueldos + ", fechaContrato=" + fechaContrato + "]";
	}

	public Empleado(String n, int s, int anio, int mes, int dia) {

		nombre = n;
		sueldos = s;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
		fechaContrato = calendario.getTime();

	}

	public void subirSueldo(double porcentaje) {

		double aumento = sueldos * porcentaje / 100;
		sueldos += aumento;
	}

}

class Administrador extends Empleado {

	private double incentivo;

	public void setIncentivo(double b) {
		incentivo = b;
	}

	@Override
	public String toString() {
		return super.toString() + "[incentivo=" + incentivo + "]";
	}

	public Administrador(String n, int s, int anio, int mes, int dia) {
		super(n, s, anio, mes, dia);
		incentivo = 0;
	}

	public double subirSueldo() {
		double sueldoBase = super.getSueldos();
		return sueldoBase + incentivo;
	}

}