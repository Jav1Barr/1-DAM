package b01_ifelse;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 1 (if-else) · EJERCICIO 05
 * ---------------------------------------
 * ENUNCIADO
 *   Pide a y b (decimales) y resuelve ax + b = 0. Si a no es 0, x = -b/a; si a es 0 y b no,
 *   «Sin solución»; si los dos son 0, «Infinitas soluciones».
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   a: 2
 *   b: -6
 *   x = 3.0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej05_EcuacionPrimerGrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double a = Entrada.decimal(sc, "a: ");
		Double b = Entrada.decimal(sc, "b: ");
		if (a != 0) {
			System.out.println("x = " + (-b / a));
		} else if (b != 0) {
			System.out.println("Sin solución");
		} else {
			System.out.println("Infinitas soluciones");
		}
		sc.close();
	}
}
