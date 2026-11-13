package b05_while;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 5 (while) · EJERCICIO 01
 * -------------------------------------
 * ENUNCIADO
 *   Pide números hasta que se escriba uno negativo. Muestra el mayor de los no negativos
 *   introducidos (si no hay ninguno, «Sin datos»).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Número: 4
 *   Número: 17
 *   Número: 9
 *   Número: -1
 *   El mayor es 17
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej01_MayorDePositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer mayor = null;
		Integer n = Entrada.entero(sc, "Número: ");
		while (n >= 0) {
			if (mayor == null || n > mayor) {
				mayor = n;
			}
			n = Entrada.entero(sc, "Número: ");
		}
		System.out.println(mayor == null ? "Sin datos" : "El mayor es " + mayor);
		sc.close();
	}
}
