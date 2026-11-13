package b05_while;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 5 (while) · EJERCICIO 02
 * -------------------------------------
 * ENUNCIADO
 *   Pide números hasta que se escriba 0. Muestra la suma de los pares y cuántos impares hubo.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Número (0 para terminar): 4
 *   Número (0 para terminar): 7
 *   Número (0 para terminar): 10
 *   Número (0 para terminar): 3
 *   Número (0 para terminar): 0
 *   Suma de pares: 14  Impares: 2
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej02_SumaParesCuentaImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer sumaPares = 0;
		Integer impares = 0;
		Integer n = Entrada.entero(sc, "Número (0 para terminar): ");
		while (n != 0) {
			if (n % 2 == 0) {
				sumaPares += n;
			} else {
				impares++;
			}
			n = Entrada.entero(sc, "Número (0 para terminar): ");
		}
		System.out.println("Suma de pares: " + sumaPares + "  Impares: " + impares);
		sc.close();
	}
}
