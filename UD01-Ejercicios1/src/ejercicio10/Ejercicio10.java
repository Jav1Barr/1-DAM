package ejercicio10;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		long num;
		Scanner sc = new Scanner (System.in);
			System.out.println("Diga un numero");
			num = sc.nextLong();
			boolean par = num%2 == 0;
			if (par == true ) {
				System.out.println("El número es par");
				
			}
			else {
				System.out.println("El número no es par");
			}
				
			sc.close();
}

}