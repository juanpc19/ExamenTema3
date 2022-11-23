package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int numeroIntroducido;
		
		Scanner dogma = new Scanner(System.in);

		System.out.print("Introduzca un numero: ");

		numeroIntroducido = dogma.nextInt();;
		
		for (int i=1; i<=numeroIntroducido; i++) {
			
			for (int e=i; e<=numeroIntroducido; e++) {
				if ((e==1) || (e==numeroIntroducido)) {
				System.out.print("*");
				}
			}
			
			for (int e=i; e<=numeroIntroducido; e++) {
				if ((e>2) && (e<numeroIntroducido)) {
				System.out.print("*   *");
				}
			}
			System.out.println();
		}
		
		dogma.close();
	}

}
