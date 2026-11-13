package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 06
 * -----------------------------------
 * ENUNCIADO
 *   Pide una base y un exponente (0 o más) y calcula la potencia con un bucle, sin usar
 *   Math.pow.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Base: 2
 *   Exponente (0 o más): 10
 *   2^10 = 1024
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej06_Potencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer base = Entrada.entero(sc, "Base: ");
		Integer exp = Entrada.entero(sc, "Exponente (0 o más): ");
		if (exp < 0) {
			System.out.println("Exponente erróneo");
		} else {
			Long res = 1L;
			for (int i = 1; i <= exp; i++) {
				res *= base;
			}
			System.out.println(base + "^" + exp + " = " + res);
		}
		sc.close();
	}
}
