package b05_while;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 5 (while) · EJERCICIO 09
 * -------------------------------------
 * ENUNCIADO
 *   Pide un entero positivo y aplica la conjetura de Collatz (si es par, entre 2; si es impar,
 *   x 3 + 1) hasta llegar a 1. Muestra la secuencia y el número de pasos.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Entero positivo: 6
 *   6 -> 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 *   Pasos: 8
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej09_Collatz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = Long.valueOf(Entrada.entero(sc, "Entero positivo: "));
		Integer pasos = 0;
		System.out.print(n);
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			System.out.print(" -> " + n);
			pasos++;
		}
		System.out.println();
		System.out.println("Pasos: " + pasos);
		sc.close();
	}
}
