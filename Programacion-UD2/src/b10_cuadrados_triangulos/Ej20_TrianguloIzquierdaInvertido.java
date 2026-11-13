package b10_cuadrados_triangulos;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 10 (cuadrados y triángulos) · EJERCICIO 20
 * -------------------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja un triángulo invertido pegado a la izquierda: n asteriscos en la primera
 *   fila, n-1 en la segunda...
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 5
 *   *****
 *   ****
 *   ***
 *   **
 *   *
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej20_TrianguloIzquierdaInvertido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j <= n - 1 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
