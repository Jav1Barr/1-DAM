package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 06
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja una pirámide centrada en la que la fila i lleva 2i-1 veces el número i.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 4
 *      1
 *     222
 *    33333
 *   4444444
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej06_PiramideNumerica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	// 06. Pirámide numérica centrada: la fila i lleva 2i-1 veces el número i.
	static void dibujar(Integer n) {
		for (int i = 1; i <= n; i++) {
			for (int e = 0; e < n - i; e++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}
