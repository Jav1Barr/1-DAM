package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 13
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja el triángulo de Floyd: números consecutivos, 1 en la primera fila, 2 y 3 en
 *   la segunda...
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 5
 *   1
 *   2 3
 *   4 5 6
 *   7 8 9 10
 *   11 12 13 14 15
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej13_TrianguloFloyd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	// 13. Triángulo de Floyd.
	static void dibujar(Integer n) {
		Integer contador = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(contador + (j < i ? " " : ""));
				contador++;
			}
			System.out.println();
		}
	}
}
