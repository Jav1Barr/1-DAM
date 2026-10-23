//En la mitad izquierda imprime * y en la derecha #. Para este ejercicio usa un número par de columnas.
//Ejemplo de entrada: 4 filas, 8 columnas
//Salida esperada:
//****####
//****####
//****####
//****####
package ex13;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime f");
		Integer fila = sc.nextInt();
		System.out.println("Dime c ");
		Integer columna = sc.nextInt();
		for (int f = 0; f < fila; f++) {
			for (int c = 0; c < columna; c++) {
				if(c >= columna/2) {
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
