//Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta adivinarlo. 
//Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo
//(el usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado).
package ejercicio05;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int min = 1;
		int max = 100;
		int num ;
		String comprobador;
		System.out.println("Piensa en un num del 0 al 100, si tu num es mas grande escribe mayor \n si es mas pequeño escribe menor y si es el num escribe igual");
		do {
			num =(int)(Math.random() *(max - min + 1))+min;
			System.out.println(num);
			comprobador = sc.next().toLowerCase();
			if (comprobador.equals("mayor")) {
				min = num + 1;
			} else if (comprobador.equals("menor")) {
				max = num - 1;
			}
		}while(!comprobador.equals("igual"));
		System.out.println("has acertado");
		sc.close();
	}

}
