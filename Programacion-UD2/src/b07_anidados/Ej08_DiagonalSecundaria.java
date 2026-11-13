package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 08
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja un cuadrado de * con la diagonal secundaria de #.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 5
 *   ****#
 *   ***#*
 *   **#**
 *   *#***
 *   #****
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej08_DiagonalSecundaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	// 08. Diagonal secundaria con #.
	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(i + j == n - 1 ? "#" : "*");
			}
			System.out.println();
		}
	}
}
