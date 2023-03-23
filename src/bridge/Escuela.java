package bridge;

import java.util.ArrayList;
import java.util.List;

public class Escuela implements IsystemInscription {
	private String nombre;
	private int capacidad;
	private List<String> estudiantes = new ArrayList<>();
	private String requisitos;
	
	public Escuela(String nombre, int capacidad, String requisitos) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.requisitos = requisitos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public List<String> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<String> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}
	
	public void add(String s) {
		if (!(estudiantes.size()>capacidad)) {
			estudiantes.add(s);
		}else {
			System.out.println("NO SE PUEDE INSCRIBIR AL ESTUDIANTE, ESCUELA"+nombre+" A MAXIMA CAPACIDAD");
		}
		
	}

	@Override
	public void info() {
		System.out.println("ESCUELA: "+nombre);
		System.out.println("Capacidad: "+capacidad+" estudiantes");
		for (String s:estudiantes) {
			System.out.println("> "+s);
		}
		System.out.println("REQUISITOS: "+requisitos+"\n");
	}

}
