package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 07
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja un rombo hueco de asteriscos (la fila central tiene 2n-1 columnas).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 4
 *      *
 *     * *
 *    *   *
 *   *     *
 *    *   *
 *     * *
 *      *
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej07_RomboHueco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	// 07. Rombo hueco. La fila r (0..2n-2) está a distancia k de la punta superior;
	// los asteriscos van en las columnas n-1-k y n-1+k.
	static void dibujar(Integer n) {
		for (int r = 0; r <= 2 * n - 2; r++) {
			int k = r < n ? r : 2 * n - 2 - r;
			for (int col = 0; col <= n - 1 + k; col++) {
				if (col == n - 1 - k || col == n - 1 + k) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
