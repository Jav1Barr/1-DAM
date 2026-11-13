package b06_dowhile;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 6 (do-while) · EJERCICIO 04
 * ----------------------------------------
 * ENUNCIADO
 *   Pide números hasta que se escriba 0. Muestra la suma de los pares y la media de los
 *   impares.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Número (0 para terminar): 4
 *   Número (0 para terminar): 3
 *   Número (0 para terminar): 8
 *   Número (0 para terminar): 5
 *   Número (0 para terminar): 0
 *   Suma de pares: 12
 *   Media de impares: 4,00
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej04_ParesEImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer sumaPares = 0;
		Integer sumaImpares = 0;
		Integer impares = 0;
		Integer n;
		do {
			n = Entrada.entero(sc, "Número (0 para terminar): ");
			if (n != 0) {
				if (n % 2 == 0) {
					sumaPares += n;
				} else {
					sumaImpares += n;
					impares++;
				}
			}
		} while (n != 0);
		System.out.println("Suma de pares: " + sumaPares);
		if (impares > 0) {
			System.out.printf("Media de impares: %.2f%n", (double) sumaImpares / impares);
		} else {
			System.out.println("No hubo impares");
		}
		sc.close();
	}
}
