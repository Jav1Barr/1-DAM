//Dibuja un cuadrado con # en las dos diagonales y puntos (.) en el resto.
//Ejemplo de entrada: N = 7
//Salida esperada:
//#.....#
//.#...#.
//..#.#..
//...#...
//..#.#..
//.#...#.
//#.....#


package ex16;
import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime N");
		Integer n = sc.nextInt();
		for (int f = 0; f < n; f++) {
			for (int c = 0; c < n; c++) {
				if (c == f || c == n - f -1 ) {
					System.out.print("#");
				}else {
					System.out.print(".");
				}
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
