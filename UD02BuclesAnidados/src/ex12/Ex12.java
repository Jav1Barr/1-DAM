//Alterna * y # tanto por filas como por columnas. Puedes estudiar la paridad de fila + columna.
//Ejemplo de entrada: 6 filas, 8 columnas
//Salida esperada:
//*#*#*#*#
//#*#*#*#*
//*#*#*#*#
//#*#*#*#*
//*#*#*#*#
//#*#*#*#*

package ex12;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime las filas");
		Integer filas = sc.nextInt();
		System.out.println("Dime las columnas");
		Integer columnas = sc.nextInt();
		for (int f = 0; f < filas; f++) {
			for (int c = 0; c < columnas; c++) {
				if(f % 2 == c % 2 ) {
					System.out.print("#");
				}else System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();

	}

}
