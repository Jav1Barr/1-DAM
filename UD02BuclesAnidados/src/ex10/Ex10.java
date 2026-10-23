//Las filas impares muestran * y las pares #.
//Ejemplo de entrada: 5 filas, 8 columnas
//Salida esperada:
//********
//########
//********
//########
//********

package ex10;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime f");
		Integer fila = sc.nextInt();
		System.out.println("Dime c");
		Integer columna = sc.nextInt();
		for (int f = 1; f <= fila; f++) {
			for (int c = 0; c < columna; c++) {
				if (f % 2 == 0) {
					System.out.print("#");
				}else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
