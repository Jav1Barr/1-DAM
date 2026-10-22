//Dibuja solo el contorno. Las posiciones interiores son espacios.
//Ejemplo de entrada: 4 filas, 7 columnas
//Salida esperada:
//*******
//*     *
//*     *
//*******

package ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N filas y N comlumnas");
		Integer filasIn = sc.nextInt();
		Integer columnasIn = sc.nextInt();
		for (int f = 0; f < filasIn; f++) {
			for (int c = 0; c < columnasIn; c++) {
				if (f == filasIn - 1 || f == 0 || c == 0 || c == columnasIn - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");

		}

		sc.close();

	}

}
