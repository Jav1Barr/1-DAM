package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 04
 * -----------------------------------
 * ENUNCIADO
 *   Pide 8 números y muestra el mayor y el menor.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Número 1: 5
 *   Número 2: -2
 *   Número 3: 9
 *   Número 4: 0
 *   Número 5: 7
 *   Número 6: 3
 *   Número 7: 11
 *   Número 8: 4
 *   Mayor: 11  Menor: -2
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej04_MayorMenorDeOcho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer mayor = 0;
		Integer menor = 0;
		for (int i = 1; i <= 8; i++) {
			Integer n = Entrada.entero(sc, "Número " + i + ": ");
			if (i == 1 || n > mayor) {
				mayor = n;
			}
			if (i == 1 || n < menor) {
				menor = n;
			}
		}
		System.out.println("Mayor: " + mayor + "  Menor: " + menor);
		sc.close();
	}
}
