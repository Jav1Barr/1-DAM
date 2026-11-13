package b05_while;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 5 (while) · EJERCICIO 10
 * -------------------------------------
 * ENUNCIADO
 *   Pide una meta de ahorro y luego ingresos hasta alcanzarla o superarla. Muestra cuántos
 *   ingresos hicieron falta y cuánto te has pasado.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Meta de ahorro: 100
 *   Ingreso: 40
 *   Ingreso: 35
 *   Ingreso: 50
 *   Meta alcanzada con 3 ingresos. Te has pasado 25,00 €
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej10_MetaDeAhorro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double meta = Entrada.decimal(sc, "Meta de ahorro: ");
		Double ahorrado = 0.0;
		Integer ingresos = 0;
		while (ahorrado < meta) {
			ahorrado += Entrada.decimal(sc, "Ingreso: ");
			ingresos++;
		}
		System.out.printf("Meta alcanzada con %d ingresos. Te has pasado %.2f €%n", ingresos, ahorrado - meta);
		sc.close();
	}
}
