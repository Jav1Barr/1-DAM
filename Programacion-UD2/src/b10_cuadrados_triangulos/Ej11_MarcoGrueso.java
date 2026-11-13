package b10_cuadrados_triangulos;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 10 (cuadrados y triángulos) · EJERCICIO 11
 * -------------------------------------------------------
 * ENUNCIADO
 *   Pide n (5 o más) y dibuja un cuadrado cuyo borde tiene dos asteriscos de grosor.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Lado: 6
 *   ******
 *   ******
 *   **  **
 *   **  **
 *   ******
 *   ******
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej11_MarcoGrueso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "Lado: ");
		dibujar(n);
		sc.close();
	}

	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i < 2 || i >= n - 2 || j < 2 || j >= n - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
