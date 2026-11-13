package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 17
 * -----------------------------------------------
 * ENUNCIADO
 *   Reto final: menú con tres figuras (1 triángulo de números, 2 rombo hueco, 3 letra H) que se
 *   repite hasta pulsar 0. Reutiliza las figuras de los ejercicios 3, 7 y 10.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   1) Triángulo de números  2) Rombo hueco  3) Letra H  0) Salir
 *   Opción: 1
 *   N: 4
 *   1
 *   22
 *   333
 *   4444
 *
 *   1) Triángulo de números  2) Rombo hueco  3) Letra H  0) Salir
 *   Opción: 2
 *   N: 3
 *     *
 *    * *
 *   *   *
 *    * *
 *     *
 *
 *   1) Triángulo de números  2) Rombo hueco  3) Letra H  0) Salir
 *   Opción: 3
 *   N (impar): 5
 *   *   *
 *   *   *
 *   *****
 *   *   *
 *   *   *
 *
 *   1) Triángulo de números  2) Rombo hueco  3) Letra H  0) Salir
 *   Opción: 0
 *   Fin
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej17_RetoFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer opcion;
		do {
			System.out.println("\n1) Triángulo de números  2) Rombo hueco  3) Letra H  0) Salir");
			opcion = Entrada.entero(sc, "Opción: ");
			switch (opcion) {
			case 1: Ej03_TrianguloNumeros.dibujar(Entrada.enteroPositivo(sc, "N: ")); break;
			case 2: Ej07_RomboHueco.dibujar(Entrada.enteroPositivo(sc, "N: ")); break;
			case 3: Ej10_LetraH.dibujar(Entrada.enteroPositivo(sc, "N (impar): ")); break;
			case 0: System.out.println("Fin"); break;
			default: System.out.println("Opción incorrecta");
			}
		} while (opcion != 0);
		sc.close();
	}
}
