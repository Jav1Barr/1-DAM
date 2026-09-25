package ejercicio10;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Integer ano;
		boolean bisiesto;
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el año actual:");
		ano = sc.nextInt();
		if (ano %400 == 0 || (ano % 4 == 0 && ano %100!=0 )) {
			bisiesto = true;
			System.out.println("bisiesto");
		}
		else {
			System.out.println("no bisiesto");
			bisiesto = false;
		}
		System.out.println(bisiesto);
		sc.close();
	}

}
