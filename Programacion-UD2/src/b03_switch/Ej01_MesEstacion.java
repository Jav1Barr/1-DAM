package b03_switch;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 3 (switch) · EJERCICIO 01
 * --------------------------------------
 * ENUNCIADO
 *   Pide el número de un mes (1-12) y muestra su estación del año agrupando los casos del
 *   switch.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Mes (1-12): 7
 *   Verano
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej01_MesEstacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer mes = Entrada.entero(sc, "Mes (1-12): ");
		switch (mes) {
		case 12: case 1: case 2:
			System.out.println("Invierno");
			break;
		case 3: case 4: case 5:
			System.out.println("Primavera");
			break;
		case 6: case 7: case 8:
			System.out.println("Verano");
			break;
		case 9: case 10: case 11:
			System.out.println("Otoño");
			break;
		default:
			System.out.println("Mes erróneo");
		}
		sc.close();
	}
}
