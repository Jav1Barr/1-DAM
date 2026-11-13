package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 01
 * -----------------------------------
 * ENUNCIADO
 *   Pide n y muestra los números pares entre 1 y n.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   n: 10
 *   2
 *   4
 *   6
 *   8
 *   10
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej01_ParesHastaN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "n: ");
		for (int i = 2; i <= n; i += 2) {
			System.out.println(i);
		}
		sc.close();
	}
}
