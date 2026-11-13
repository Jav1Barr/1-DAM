package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 03
 * -----------------------------------
 * ENUNCIADO
 *   Pide n y muestra la suma de los números de 1 a n.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   n: 100
 *   Suma: 5050
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej03_SumaHastaN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "n: ");
		Long suma = 0L;
		for (int i = 1; i <= n; i++) {
			suma += i;
		}
		System.out.println("Suma: " + suma);
		sc.close();
	}
}
