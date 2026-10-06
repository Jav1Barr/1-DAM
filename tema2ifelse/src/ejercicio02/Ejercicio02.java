//Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente a
//un día de la semana. Se debe mostrar el nombre del día de la semana al que corresponde. Por
//ejemplo, el número 1 corresponde a “Lunes” y el 6 a “Sábado”.

package ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numSemana;
		System.out.println("Dime un número del 1 al 7");
		numSemana = sc.nextInt();
		if (numSemana == 1) {
			System.out.println("Lunes");
		} else if (numSemana == 2) {
			System.out.println("Martes");
		} else if (numSemana == 3) {
			System.out.println("Miercoles");
		} else if (numSemana == 4) {
			System.out.println("Jueves");
		} else if (numSemana == 5) {
			System.out.println("Viernes");
		} else if (numSemana == 6) {
			System.out.println("sabado");
		} else if (numSemana == 7) {
			System.out.println("Domingo");
		} else {
			System.out.println("No es un número valido");
		}
	}
}
