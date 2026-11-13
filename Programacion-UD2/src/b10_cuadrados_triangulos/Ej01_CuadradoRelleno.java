package b10_cuadrados_triangulos;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 10 (cuadrados y triángulos) · EJERCICIO 01
 * -------------------------------------------------------
 * ENUNCIADO
 *   Pide el lado n y dibuja un cuadrado de n x n asteriscos relleno.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Lado: 5
 *   *****
 *   *****
 *   *****
 *   *****
 *   *****
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej01_CuadradoRelleno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n = Entrada.enteroPositivo(sc, "Lado: ");
		dibujar(n);
		sc.close();
	}

	static void dibujar(Integer n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
