package b01_ifelse;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 1 (if-else) · EJERCICIO 04
 * ---------------------------------------
 * ENUNCIADO
 *   Pide un número decimal y di si es «casi-diez»: está entre 9 y 11 (sin incluirlos) pero no
 *   es exactamente 10.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Número decimal: 9,5
 *   Es casi-diez
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej04_CasiDiez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double x = Entrada.decimal(sc, "Número decimal: ");
		if (x > 9 && x < 11 && x != 10) {
			System.out.println("Es casi-diez");
		} else {
			System.out.println("No es casi-diez");
		}
		sc.close();
	}
}
