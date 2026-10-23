//La mitad superior se dibuja con * y la inferior con #. Usa un número par de filas.
//Ejemplo de entrada: 6 filas, 8 columnas
//Salida esperada:
//********
//********
//********
//########
//########
//########

package ex14;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime f");
		Integer fila = sc.nextInt();
		System.out.println("Dime c ");
		Integer columna = sc.nextInt();
		for (int f = 0; f < fila; f++) {
			for (int c = 0; c < columna; c++) {
				if(f >= fila/2) {
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
