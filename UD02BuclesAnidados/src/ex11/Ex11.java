//Cada columna alterna entre * y #, independientemente de la fila.
//Ejemplo de entrada: 4 filas, 8 columnas
//Salida esperada:
//*#*#*#*#
//*#*#*#*#
//*#*#*#*#
//*#*#*#*#

package ex11;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime f");
		Integer fila = sc.nextInt();
		System.out.println("Dime c");
		Integer columna = sc.nextInt();
		for (int f = 1; f <= fila; f++) {
			for (int c = 0; c < columna; c++) {
				if (c % 2 == 0) {
					System.out.print("*");
				}else {
					System.out.print("#");
				}
			}
			System.out.println("");
		}
		
		
		sc.close();
	}

}
