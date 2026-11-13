package b02_condicionales;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 2 (condicionales) · EJERCICIO 03
 * ---------------------------------------------
 * ENUNCIADO
 *   Pide el número de un DNI (8 dígitos) y su letra. La letra correcta es la que ocupa la
 *   posición número % 23 en la cadena TRWAGMYFPDXBNJZSQVHLCKE.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Número de DNI (8 dígitos): 12345678
 *   Letra: z
 *   DNI correcto
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej03_ValidadorDNI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tabla = "TRWAGMYFPDXBNJZSQVHLCKE";
		Integer dni = Entrada.entero(sc, "Número de DNI (8 dígitos): ");
		if (dni < 0 || dni > 99999999) {
			System.out.println("Valor erróneo");
		} else {
			char letra = Character.toUpperCase(Entrada.caracter(sc, "Letra: "));
			char correcta = tabla.charAt(dni % 23);
			if (letra == correcta) {
				System.out.println("DNI correcto");
			} else {
				System.out.println("Letra incorrecta; la correcta es " + correcta);
			}
		}
		sc.close();
	}
}
