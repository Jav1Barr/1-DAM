package b10_cuadrados_triangulos;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 10 (cuadrados y triángulos) · EJERCICIO 28
 * -------------------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja una pirámide invertida centrada de n filas: 2n-1 asteriscos arriba y 1
 *   abajo.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 5
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej28_PiramideInvertida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				if (j >= i && j <= 2 * n - 2 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
