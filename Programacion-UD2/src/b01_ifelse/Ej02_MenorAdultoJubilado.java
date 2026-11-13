package b01_ifelse;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 1 (if-else) · EJERCICIO 02
 * ---------------------------------------
 * ENUNCIADO
 *   Pide una edad (0-120): menor de edad si tiene menos de 18, adulto si tiene menos de 65 y
 *   jubilado a partir de 65. Si está fuera de rango, muestra «Edad errónea».
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Edad (0-120): 70
 *   Jubilado
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej02_MenorAdultoJubilado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer edad = Entrada.entero(sc, "Edad (0-120): ");
		if (edad < 0 || edad > 120) {
			System.out.println("Edad errónea");
		} else if (edad < 18) {
			System.out.println("Menor de edad");
		} else if (edad < 65) {
			System.out.println("Adulto");
		} else {
			System.out.println("Jubilado");
		}
		sc.close();
	}
}
