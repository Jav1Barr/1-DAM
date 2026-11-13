package b02_condicionales;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 2 (condicionales) · EJERCICIO 08
 * ---------------------------------------------
 * ENUNCIADO
 *   Pide una nota decimal (0-10) y muestra la calificación: Suspenso (menos de 5), Aprobado (de
 *   5 a 6), Bien (de 6 a 7), Notable (de 7 a 9) o Sobresaliente (9 o más).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Nota (0-10): 7,5
 *   Notable
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej08_NotaACalificacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double nota = Entrada.decimal(sc, "Nota (0-10): ");
		if (nota < 0 || nota > 10) {
			System.out.println("Valor erróneo");
		} else if (nota < 5) {
			System.out.println("Suspenso");
		} else if (nota < 6) {
			System.out.println("Aprobado");
		} else if (nota < 7) {
			System.out.println("Bien");
		} else if (nota < 9) {
			System.out.println("Notable");
		} else {
			System.out.println("Sobresaliente");
		}
		sc.close();
	}
}
