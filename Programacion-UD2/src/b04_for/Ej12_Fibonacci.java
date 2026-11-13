package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 12
 * -----------------------------------
 * ENUNCIADO
 *   Pide cuántos términos quieres y muestra la sucesión de Fibonacci (0 1 1 2 3 5 ...).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Términos: 10
 *   0 1 1 2 3 5 8 13 21 34
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej12_Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "Términos: ");
		Long a = 0L;
		Long b = 1L;
		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			Long siguiente = a + b;
			a = b;
			b = siguiente;
		}
		System.out.println();
		sc.close();
	}
}
