package b02_condicionales;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 2 (condicionales) · EJERCICIO 07
 * ---------------------------------------------
 * ENUNCIADO
 *   Pide el importe de una compra: 5 % de descuento desde 50 €, 10 % desde 100 € y 15 % desde
 *   200 €. Muestra el descuento y el total.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Importe de la compra: 120
 *   Descuento (10%): 12,00 €  Total: 108,00 €
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej07_DescuentoPorImporte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double importe = Entrada.decimal(sc, "Importe de la compra: ");
		if (importe < 0) {
			System.out.println("Valor erróneo");
		} else {
			Integer porcentaje = 0;
			if (importe >= 200) {
				porcentaje = 15;
			} else if (importe >= 100) {
				porcentaje = 10;
			} else if (importe >= 50) {
				porcentaje = 5;
			}
			Double descuento = importe * porcentaje / 100;
			System.out.printf("Descuento (%d%%): %.2f €  Total: %.2f €%n", porcentaje, descuento, importe - descuento);
		}
		sc.close();
	}
}
