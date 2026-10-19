//Escribir un programa que pida al usuario un mes y un año y que muestre por pantalla el número 
//total de días que tiene ese mes de ese año. Hay que considerar que los meses de febrero pueden 
//tener 29 o 28 días según el año sea o no bisiesto.

package ejercicio03;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer mes;
		Integer anyo;
		System.out.println("dime un mes");
		mes = sc.nextInt();
		System.out.println("Dime un anyo");
		anyo = sc.nextInt();
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("Tiene 30 dias");
		}else if (mes == 2) {
			if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0 ) {
				System.out.println("Tiene 29 dias");
				
			}else {
				System.out.println("Tiene 28 dias");
			}
		}else {
			System.out.println("Tiene 31 dias");
		}
		sc.close();
	}

}
