//Modifica el ejercicio anterior para que, indicando dos números, por ejemplo,
//num1 y num2, diga qué cantidad hay que sumarle a num1 para que sea múltiplo de num2.

package ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num1, num2, veces = 0;
		System.out.println("dime el primer número");
		num1 = sc.nextInt();
		System.out.println("dime el segundo número");
		num2 = sc.nextInt();
		while (num1 %num2 != 0) {
			num1++;
			veces++;
		}
		System.out.println(veces);
		sc.close();
	}	

}
