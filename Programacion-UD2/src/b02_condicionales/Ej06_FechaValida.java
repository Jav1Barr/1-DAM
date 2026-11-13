package b02_condicionales;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 2 (condicionales) · EJERCICIO 06
 * ---------------------------------------------
 * ENUNCIADO
 *   Pide día, mes y año y di si la fecha es válida, teniendo en cuenta los años bisiestos.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Día: 29
 *   Mes: 2
 *   Año: 2024
 *   Fecha válida
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej06_FechaValida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer dia = Entrada.entero(sc, "Día: ");
		Integer mes = Entrada.entero(sc, "Mes: ");
		Integer anio = Entrada.entero(sc, "Año: ");
		boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0;
		Integer diasDelMes = 0;
		switch (mes) {
		case 4: case 6: case 9: case 11:
			diasDelMes = 30;
			break;
		case 2:
			diasDelMes = bisiesto ? 29 : 28;
			break;
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			diasDelMes = 31;
			break;
		default:
			diasDelMes = 0; // mes inexistente
		}
		if (diasDelMes > 0 && dia >= 1 && dia <= diasDelMes) {
			System.out.println("Fecha válida");
		} else {
			System.out.println("Fecha no válida");
		}
		sc.close();
	}
}
