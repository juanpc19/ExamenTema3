package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {


		int notaPractica;
		
		int notaProblemas;
		
		int notaTeorica;
		
		int totalAlumnos=0;
		
		int solicitudUsuario;
		
		double notaMaxima=0;
		
		double notaMinima=0;
		
		double notaMediaAlumno;
		
		double notaMediaAlumnado=0;
		
		String nombreAlumno = "";
		
		String nombreAlumnoMaximo = "";
		
		String nombreAlumnoMinimo = "";
		
		Scanner dogma = new Scanner (System.in);
		
		do {
		
		System.out.println("Introduzca el nombre el alumno/a: ");
		
		nombreAlumno = dogma.nextLine();
		
		System.out.println("Introduzca nota de la parte práctica: ");
		
		notaPractica = dogma.nextInt();
		
		notaPractica = (int) (notaPractica*0.10);
		
		System.out.println("Introduzca nota de la parte de problemas: ");
		
		notaProblemas = dogma.nextInt();
		
		notaProblemas = (int) (notaProblemas*0.50);
		
		System.out.println("Introduzca nota de la parte teórica: ");
		
		notaTeorica = dogma.nextInt();
		
		notaTeorica = (int) (notaTeorica*0.40);
		
		if ((notaPractica<0 || notaPractica>10) || (notaProblemas<0 || notaProblemas>10) || (notaTeorica<0 || notaTeorica>10)) {
			System.out.println("Error al introducir la nota, por favor, introduzca un numero entre 0 y 10: ");
		}
		
		notaMediaAlumno = notaPractica + notaProblemas + notaTeorica;
		
		if (notaMediaAlumno>notaMaxima) {
			notaMaxima = notaMediaAlumno;
			nombreAlumnoMaximo = nombreAlumno;
		}
	
		if (notaMediaAlumno<notaMinima) {
			notaMinima = notaMediaAlumno;
			nombreAlumnoMinimo = nombreAlumno;
		}
		
		totalAlumnos++;
		
		notaMediaAlumnado += notaMediaAlumno;
		
		} while (nombreAlumno!="0"); // string.equals(); ?
		
		System.out.print("Pulse el numero correspondiente a la opcion que desea examinar: "
				+ "1. Nota máxima\r\n"
				+ "2. Nota mínima\r\n"
				+ "3. Media de las notas\r\n"
				+ ": ");
		
		solicitudUsuario = dogma.nextInt();
		
		switch (solicitudUsuario) {
		
		case 1 -> {
			System.out.print("La nota maxima es: " + notaMaxima + " y pertenece al alumno" + nombreAlumnoMaximo);
		}
		
		case 2 -> {
			System.out.print("La nota minima es: " + notaMinima + " y pertenece al alumno" + nombreAlumnoMinimo);
		}
		
		case 3 -> {
			System.out.print("La media de todas las notas es: " + (notaMediaAlumnado/totalAlumnos));
		}
		
		}
		
		
		dogma.close();

	}

}
