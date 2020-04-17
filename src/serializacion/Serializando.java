package serializacion;

import java.util.*;
import java.io.*;

public class Serializando {

	public static void main(String[] args) {

		Administrador jefe = new Administrador("Juan", 78000, 2003, 12, 25);
		jefe.setIncentivo(5000);

		Empleado[] personal = new Empleado[3];  // vamos a serializar este objeto
		
		personal[0] = jefe;
		personal[1] = new Empleado("Ana", 25000, 2008, 04, 13);
		personal[2] = new Empleado("Martin", 75000, 2005, 10, 23);
	}

}

class Empleado {

	private String nombre;
	private int sueldo;
	private Date fechaContrato;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	public void setFechaContrato(Date fechaContrato) {
		this.fechaContrato = fechaContrato;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + ", fechaContrato=" + fechaContrato + "]";
	}

	public Empleado(String n, int s, int anio, int mes, int dia) {

		nombre = n;
		sueldo = s;
		GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
		fechaContrato = calendario.getTime();

	}

	public void subirSueldo(double porcentaje) {

		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

}

class Administrador extends Empleado {

	private double incentivo;


	public void setIncentivo(double b) {
		incentivo = b;
	}

	
	@Override
	public String toString() {
		return super.toString() + "Administrador [incentivo=" + incentivo + "]";
	}



	public Administrador(String n, int s, int anio, int mes, int dia) {
		super(n, s, anio, mes, dia);
		incentivo = 0;
	}

	public double subirSueldo() {
		double sueldoBase = super.getSueldo();
		return sueldoBase + incentivo;
	}

}