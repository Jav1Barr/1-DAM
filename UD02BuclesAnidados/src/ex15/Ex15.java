//Dibuja un cuadrado de N×N en el que la diagonal principal sea # y el resto *.
//Ejemplo de entrada: N = 5
//Salida esperada:
//#****
//*#***
//**#**
//***#*
//****#

package ex15;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime N");
		Integer n = sc.nextInt();
		for (int f = 0; f < n; f++) {
			for (int c = 0; c < n; c++) {
				if (f == c) {
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
