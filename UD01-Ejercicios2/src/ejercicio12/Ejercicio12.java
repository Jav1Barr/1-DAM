//Pide al usuario su edad y utiliza el operador ternario para calcular el precio de 
//una entrada: 6,50 € si es menor de 18 años y 9,50 € en caso contrario. Muestra el
//precio correspondiente.
package ejercicio12;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
	Integer edad;
	Double precioFinal;
	final Double menor = 6.50;
	final Double mayor = 9.50;
	Scanner sc = new Scanner (System.in);
	System.out.println("dime la edad");
	edad = sc.nextInt();
	precioFinal = edad >=18 ? mayor : menor; 
	System.out.println(precioFinal+ "€");
	sc.close();
	}

}
