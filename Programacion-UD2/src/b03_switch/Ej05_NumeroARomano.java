package b03_switch;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 3 (switch) · EJERCICIO 05
 * --------------------------------------
 * ENUNCIADO
 *   Pide un número del 1 al 10 y muestra su equivalente en números romanos.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Número (1-10): 9
 *   IX
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej05_NumeroARomano {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "Número (1-10): ");
		String romano;
		switch (n) {
		case 1: romano = "I"; break;
		case 2: romano = "II"; break;
		case 3: romano = "III"; break;
		case 4: romano = "IV"; break;
		case 5: romano = "V"; break;
		case 6: romano = "VI"; break;
		case 7: romano = "VII"; break;
		case 8: romano = "VIII"; break;
		case 9: romano = "IX"; break;
		case 10: romano = "X"; break;
		default: romano = "Número erróneo";
		}
		System.out.println(romano);
		sc.close();
	}
}
