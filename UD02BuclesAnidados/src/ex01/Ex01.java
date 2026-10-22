//Pide filas y columnas. Dibuja un rectángulo de asteriscos.
//Ejemplo de entrada: 4 filas, 7 columnas
//Salida esperada:
//*******
//*******
//*******
//*******

package ex01;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("N filas y luego N columnas ");
		Integer filasIn = sc.nextInt();
		Integer columnasIn = sc.nextInt();
		for (int filas = 0; filas < filasIn; filas++) {
			for (int columnas = 0; columnas < columnasIn; columnas++) {
				System.out.print("*");
			}
			System.out.println("");
		} 
		
		sc.close();

	}

}
