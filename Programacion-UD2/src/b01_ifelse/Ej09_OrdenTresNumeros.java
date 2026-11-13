package b01_ifelse;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 1 (if-else) · EJERCICIO 09
 * ---------------------------------------
 * ENUNCIADO
 *   Pide tres números y di si están en orden creciente (estricto), decreciente (estricto) o
 *   desordenados.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Primero: 1
 *   Segundo: 5
 *   Tercero: 9
 *   Orden creciente
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej09_OrdenTresNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = Entrada.entero(sc, "Primero: ");
		Integer b = Entrada.entero(sc, "Segundo: ");
		Integer c = Entrada.entero(sc, "Tercero: ");
		if (a < b && b < c) {
			System.out.println("Orden creciente");
		} else if (a > b && b > c) {
			System.out.println("Orden decreciente");
		} else {
			System.out.println("Desordenados");
		}
		sc.close();
	}
}
