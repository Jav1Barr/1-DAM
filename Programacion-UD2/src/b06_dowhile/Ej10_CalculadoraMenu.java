package b06_dowhile;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 6 (do-while) · EJERCICIO 10
 * ----------------------------------------
 * ENUNCIADO
 *   Calculadora con menú: A) sumar, B) restar, C) multiplicar, D) dividir, E) potencia, F) raíz
 *   cuadrada, G) salir. El menú se repite hasta elegir G.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   A) Sumar  B) Restar  C) Multiplicar  D) Dividir  E) Potencia  F) Raíz cuadrada  G) Salir
 *   Opción: A
 *   Primer número: 2
 *   Segundo número: 3
 *   5.0
 *
 *   A) Sumar  B) Restar  C) Multiplicar  D) Dividir  E) Potencia  F) Raíz cuadrada  G) Salir
 *   Opción: F
 *   Número: 16
 *   4.0
 *
 *   A) Sumar  B) Restar  C) Multiplicar  D) Dividir  E) Potencia  F) Raíz cuadrada  G) Salir
 *   Opción: G
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej10_CalculadoraMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcion;
		do {
			System.out.println("\nA) Sumar  B) Restar  C) Multiplicar  D) Dividir  E) Potencia  F) Raíz cuadrada  G) Salir");
			opcion = Character.toUpperCase(Entrada.caracter(sc, "Opción: "));
			if (opcion >= 'A' && opcion <= 'E') {
				Double a = Entrada.decimal(sc, "Primer número: ");
				Double b = Entrada.decimal(sc, "Segundo número: ");
				switch (opcion) {
				case 'A': System.out.println(a + b); break;
				case 'B': System.out.println(a - b); break;
				case 'C': System.out.println(a * b); break;
				case 'D':
					if (b == 0) {
						System.out.println("No se puede dividir entre 0");
					} else {
						System.out.println(a / b);
					}
					break;
				case 'E': System.out.println(Math.pow(a, b)); break;
				}
			} else if (opcion == 'F') {
				Double a = Entrada.decimal(sc, "Número: ");
				if (a < 0) {
					System.out.println("No existe la raíz de un negativo");
				} else {
					System.out.println(Math.sqrt(a));
				}
			} else if (opcion != 'G') {
				System.out.println("Opción incorrecta");
			}
		} while (opcion != 'G');
		sc.close();
	}
}
