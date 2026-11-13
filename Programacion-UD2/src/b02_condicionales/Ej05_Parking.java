package b02_condicionales;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 2 (condicionales) · EJERCICIO 05
 * ---------------------------------------------
 * ENUNCIADO
 *   Pide los minutos de estancia en un parking. La primera hora (o fracción) cuesta 1,50 € y
 *   cada hora (o fracción) adicional 1 €, con un máximo diario de 12 €. 0 minutos = 0 €. Un
 *   valor negativo es «Valor erróneo».
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Minutos de estancia: 130
 *   Importe: 3,50 €
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej05_Parking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer minutos = Entrada.entero(sc, "Minutos de estancia: ");
		if (minutos < 0) {
			System.out.println("Valor erróneo");
		} else {
			Double importe = 0.0;
			if (minutos > 0) {
				Integer horasEmpezadas = (minutos + 59) / 60; // redondeo hacia arriba
				importe = 1.5 + (horasEmpezadas - 1) * 1.0;
				if (importe > 12) {
					importe = 12.0;
				}
			}
			System.out.printf("Importe: %.2f €%n", importe);
		}
		sc.close();
	}
}
