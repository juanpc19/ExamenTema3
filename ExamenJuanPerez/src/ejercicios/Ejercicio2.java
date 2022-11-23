package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
	
	//Valor: -1  / Resultado esperado:Error, Introduzca un numero entero mayor o igual que 0:
	// Error, Introduzca un numero entero mayor o igual que 0:
	
	//Valor: 0  / Resultado esperado: 1 pares y 0 impares / Resultado obtenido: 1 pares y 0 impares
	//Valor: 78532 / Resultado esperado: 2 pares y 3 impares / Resultado obtenido: 2 pares y 3 impares
	//Valor: 11 / Resultado esperado: 0 pares y 2 impares / Resultado obtenido: 0 pares y 2 impares
	//Valor: 22 / Resultado esperado: 2 pares y 0 impares / Resultado obtenido: 2 pares y 0 impares
	//Valor: 30 / Resultado esperado: 1 pares y 1 impares / Resultado obtenido: 1 pares y 1 impares
	//Valor: 23 / Resultado esperado: 1 pares y 1 impares / Resultado obtenido: 1 pares y 1 impares

	public static void main(String[] args) {
		
		int numeroIntroducido;//Declaro variable donde guardare el numero introducido por el usuario
		
		int cPar=0; //Declaro variable donde guardare la cantidad de cifras pares del numeroIntroducido
		//y la inicializo a 0 para poder usarla en el bucle
		
		int cImpar=0; //Declaro variable donde guardare la cantidad de cifras impares del numeroIntroducido
		//y la inicializo a 0 para poder usarla en el bucle
		
		int cifra=0;//Declaro variable donde guardare la cifra del numeroIntroducido para evaluar el numeroIntroducido cifra por cifra
		//y la inicializo a 0 para poder usarla en el bucle
		
		//Creo un Scanner, lo nombro dogma y lo importo
		Scanner dogma = new Scanner(System.in);
		
		//Solicito numero al usuario mediante mensaje por pantalla
		System.out.print("Introduzca un numero entero mayor o igual que 0: ");
		
		//Asigno valor a variable numeroIntroducido mediante uso del Scanner
		numeroIntroducido = dogma.nextInt();
		
		//Establezco condicion si numeroIntroducido menor que 0
		if (numeroIntroducido<0) {
			
			//Que de cumplirse imprimira mensaje de error por pantalla
			System.out.print("Error, Introduzca un numero entero mayor o igual que 0: ");
			
		//De no cumplirse la condicion continuo con la ejecucion del programa
		} else {
		
			//Establezo condicion si numeroIntroducido igual a 0
			if (numeroIntroducido==0) {
				//Que de cumplirse sumara +1 a variable cPar
				cPar++;
			}
			
			//Creo bucle while con condicion numeroIntroducido mayor a 0
			while (numeroIntroducido>0) {
				
			//Doy a variable cifra un valor igual a resto de variable numeroIntroducido dividido entre 10
			//(Extrae la ultima cifra de numeroIntroducido)
			cifra = numeroIntroducido%10;
			
			
			//Doy valor a variable numeroIntroducido igual a variable numeroIntroducido dividido entre 10
			//Da nuevo valor a numeroIntroducido para extraer siguiente cifra o finalizar bucle
			numeroIntroducido = numeroIntroducido/10;
			
			//Establezco condicion si resto de cifra dividido entre 2 igual a 0
			if (cifra%2==0) {
				//Que de cumplirse sumara +1  a variable cPar
				cPar++;
			
			//Establezco que de no cumplirse la condicion anterior (al ser el numero impar)
			} else {
				//Se le sume +1 a cImpar
				cImpar++;
			}
			
		}
			//Al finalizar el bucle imprimo por pantalla el resultado del conteo de pares e impares
			System.out.print(cPar + " pares y " + cImpar + " impares");

		}
		
		//Cierro Scanner
		dogma.close();
		
		}
	}
