package b02_condicionales;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 2 (condicionales) · EJERCICIO 02
 * ---------------------------------------------
 * ENUNCIADO
 *   Usando el operador ternario: pide dos números y muestra el mayor; después pide una edad y
 *   muestra si eres mayor o menor de edad.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Primer número: 7
 *   Segundo número: 12
 *   El mayor es 12
 *   Edad: 20
 *   Eres mayor de edad
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej02_OperadorTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer a = Entrada.entero(sc, "Primer número: ");
		Integer b = Entrada.entero(sc, "Segundo número: ");
		Integer mayor = a > b ? a : b;
		System.out.println("El mayor es " + mayor);
		Integer edad = Entrada.entero(sc, "Edad: ");
		String texto = edad >= 18 ? "mayor de edad" : "menor de edad";
		System.out.println("Eres " + texto);
		sc.close();
	}
}
