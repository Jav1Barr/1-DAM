package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 08
 * -----------------------------------
 * ENUNCIADO
 *   Pide 6 temperaturas y muestra cuántas superan los 30 º y la media.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Temperatura 1: 28
 *   Temperatura 2: 31,5
 *   Temperatura 3: 35
 *   Temperatura 4: 29
 *   Temperatura 5: 30
 *   Temperatura 6: 33
 *   Superan 30º: 3
 *   Media: 31,08
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej08_SeisTemperaturas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer calurosas = 0;
		Double suma = 0.0;
		for (int i = 1; i <= 6; i++) {
			Double t = Entrada.decimal(sc, "Temperatura " + i + ": ");
			suma += t;
			if (t > 30) {
				calurosas++;
			}
		}
		System.out.println("Superan 30º: " + calurosas);
		System.out.printf("Media: %.2f%n", suma / 6);
		sc.close();
	}
}
