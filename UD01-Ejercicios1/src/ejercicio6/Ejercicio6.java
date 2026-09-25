package ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double numA, numB, sum, res, mul, div; // definimos las var
		System.out.println("Introduzca el primer número");
		numA = sc.nextDouble(); // input del 1 numerp
		System.out.println("Introduzca el segundo número");
		numB = sc.nextDouble(); // input del segundo numero
		sum = numA + numB; // suma
		res= numA - numB; // resta 
		mul = numA * numB; // multiplicacion 
		div = numA / numB; // division 
		System.out.println("El resultado de la suma es "+ sum);
		System.out.println("El resultado de la resta es "+ res);
		System.out.println("El resultado de la multiplicación es "+ mul);
		System.out.println("El resultado de la división es "+ div);
		sc.close();
				
	}
}
