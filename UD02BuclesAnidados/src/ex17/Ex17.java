//En la fila i muestra los números desde 1 hasta i, sin espacios entre ellos.
//Ejemplo de entrada: N = 5
//Salida esperada:
//1
//12
//123
//1234
//12345

package ex17;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime N");
		Integer n = sc.nextInt();
		for (int f = 1; f <= n; f++) {
			for (int c = 1; c <= f; c++) {
				System.out.print(c);
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
