package b03_switch;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 3 (switch) · EJERCICIO 06
 * --------------------------------------
 * ENUNCIADO
 *   Pide un día de la semana y di si es laborable o fin de semana (el viernes tiene un mensaje
 *   especial).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Día de la semana: viernes
 *   Laborable... ¡casi fin de semana!
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej06_DiaLaborable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dia = Entrada.texto(sc, "Día de la semana: ").trim().toLowerCase();
		switch (dia) {
		case "lunes": case "martes": case "miércoles": case "miercoles": case "jueves":
			System.out.println("Laborable");
			break;
		case "viernes":
			System.out.println("Laborable... ¡casi fin de semana!");
			break;
		case "sábado": case "sabado": case "domingo":
			System.out.println("Fin de semana");
			break;
		default:
			System.out.println("Día erróneo");
		}
		sc.close();
	}
}
