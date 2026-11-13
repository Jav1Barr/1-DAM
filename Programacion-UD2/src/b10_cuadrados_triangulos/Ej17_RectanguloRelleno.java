package b10_cuadrados_triangulos;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 10 (cuadrados y triángulos) · EJERCICIO 17
 * -------------------------------------------------------
 * ENUNCIADO
 *   Pide filas y columnas y dibuja un rectángulo relleno de asteriscos.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Filas: 4
 *   Columnas: 7
 *   *******
 *   *******
 *   *******
 *   *******
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej17_RectanguloRelleno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer filas = Entrada.enteroPositivo(sc, "Filas: ");
		Integer columnas = Entrada.enteroPositivo(sc, "Columnas: ");
		dibujar(filas, columnas);
		sc.close();
	}

	static void dibujar(Integer filas, Integer columnas) {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
