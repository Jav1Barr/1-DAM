package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 10
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide n (impar) y dibuja una letra H: primera y última columna, y la barra en la fila
 *   central.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N (impar): 5
 *   *   *
 *   *   *
 *   *****
 *   *   *
 *   *   *
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej10_LetraH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N (impar): ");
		dibujar(n);
		sc.close();
	}

	// 10. Letra H (n impar: la barra horizontal va en la fila central).
	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == n / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
