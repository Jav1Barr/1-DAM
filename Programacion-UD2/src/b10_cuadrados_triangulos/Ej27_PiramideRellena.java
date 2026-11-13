package b10_cuadrados_triangulos;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 10 (cuadrados y triángulos) · EJERCICIO 27
 * -------------------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja una pirámide centrada de n filas: 1 asterisco arriba, 3 en la segunda fila,
 *   5 en la tercera...
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 5
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej27_PiramideRellena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if (j >= n - 1 - i && j <= n - 1 + i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
