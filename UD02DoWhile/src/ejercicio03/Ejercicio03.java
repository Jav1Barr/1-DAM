//Realiza un programa que sume los números desde el 1 hasta un número N que se 
//introducirá por teclado. Por ejemplo: Si el usuario introduce un 5, el programa
//debe devolver la suma de 1+2+3+4+5. 

package ejercicio03;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Integer  suma = 0;
		Integer n = 0;
		System.out.println("dime N");
		n = sc.nextInt();
		do {
			suma += n;
			n --;
		}while(n >= 0);
		System.out.println(suma);
		sc.close();

	}

}
