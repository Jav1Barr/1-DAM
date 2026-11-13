package b07_anidados;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 7 (bucles anidados) · EJERCICIO 02
 * -----------------------------------------------
 * ENUNCIADO
 *   Pide filas y columnas y dibuja un rectángulo con el borde de # y el interior de *.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Filas: 4
 *   Columnas: 7
 *   #######
 *   #*****#
 *   #*****#
 *   #######
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej02_BordeYRelleno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer filas = Entrada.enteroPositivo(sc, "Filas: ");
		Integer columnas = Entrada.enteroPositivo(sc, "Columnas: ");
		dibujar(filas, columnas);
		sc.close();
	}

	// 02. Borde # y relleno *.
	static void dibujar(Integer filas, Integer columnas) {
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if (i == 0 || i == filas - 1 || j == 0 || j == columnas - 1) {
					System.out.print("#");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
