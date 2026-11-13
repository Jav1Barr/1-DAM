package b02_condicionales;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 2 (condicionales) · EJERCICIO 01
 * ---------------------------------------------
 * ENUNCIADO
 *   Pide un número de 3 cifras (100-999) y di si es de Armstrong: la suma de los cubos de sus
 *   cifras es el propio número (153 = 1³ + 5³ + 3³). Fuera de rango, «Valor erróneo».
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Número (100-999): 153
 *   Es de Armstrong
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej01_Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.entero(sc, "Número (100-999): ");
		if (n < 100 || n > 999) {
			System.out.println("Valor erróneo");
		} else {
			Integer centenas = n / 100;
			Integer decenas = n / 10 % 10;
			Integer unidades = n % 10;
			Integer suma = centenas * centenas * centenas + decenas * decenas * decenas
					+ unidades * unidades * unidades;
			System.out.println(suma.equals(n) ? "Es de Armstrong" : "No es de Armstrong");
		}
		sc.close();
	}
}
