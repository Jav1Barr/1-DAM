package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 14
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide n y dibuja un cuadrado con marco #, diagonales * e interior . (el borde tiene
 *   prioridad).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   N: 7
 *   #######
 *   #*...*#
 *   #.*.*.#
 *   #..*..#
 *   #.*.*.#
 *   #*...*#
 *   #######
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej14_MarcoConDiagonales {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "N: ");
		dibujar(n);
		sc.close();
	}

	// 14. Marco # con diagonales * e interior . (el borde tiene prioridad).
	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
					System.out.print("#");
				} else if (i == j || i + j == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
}
