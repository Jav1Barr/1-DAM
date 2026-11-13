package b04_for;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 02
 * -----------------------------------
 * ENUNCIADO
 *   Pide n y haz una cuenta atrás de n a 1. Al final muestra «¡Despegue!».
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   n: 5
 *   5
 *   4
 *   3
 *   2
 *   1
 *   ¡Despegue!
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej02_CuentaAtras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "n: ");
		for (int i = n; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("¡Despegue!");
		sc.close();
	}
}
