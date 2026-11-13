package b06_dowhile;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 6 (do-while) · EJERCICIO 07
 * ----------------------------------------
 * ENUNCIADO
 *   Pide un número del 1 al 10 (hasta que sea válido), muestra su tabla de multiplicar y
 *   pregunta si quieres otra (S/N).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Número (1-10): 3
 *   3 x 1 = 3
 *   3 x 2 = 6
 *   3 x 3 = 9
 *   3 x 4 = 12
 *   3 x 5 = 15
 *   3 x 6 = 18
 *   3 x 7 = 21
 *   3 x 8 = 24
 *   3 x 9 = 27
 *   3 x 10 = 30
 *   ¿Otra tabla? (S/N): N
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej07_TablaDeMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char seguir;
		do {
			Integer n;
			do {
				n = Entrada.entero(sc, "Número (1-10): ");
			} while (n < 1 || n > 10);
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + " x " + i + " = " + n * i);
			}
			seguir = Character.toUpperCase(Entrada.caracter(sc, "¿Otra tabla? (S/N): "));
		} while (seguir == 'S');
		sc.close();
	}
}
