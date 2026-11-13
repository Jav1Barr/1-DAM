package b03_switch;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 3 (switch) · EJERCICIO 02
 * --------------------------------------
 * ENUNCIADO
 *   Pide el nombre de un mes y muestra cuántos días tiene (febrero: 28).
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Mes: abril
 *   30 días
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej02_MesDias {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mes = Entrada.texto(sc, "Mes: ").trim().toLowerCase();
		switch (mes) {
		case "enero": case "marzo": case "mayo": case "julio":
		case "agosto": case "octubre": case "diciembre":
			System.out.println("31 días");
			break;
		case "abril": case "junio": case "septiembre": case "noviembre":
			System.out.println("30 días");
			break;
		case "febrero":
			System.out.println("28 días");
			break;
		default:
			System.out.println("Mes erróneo");
		}
		sc.close();
	}
}
