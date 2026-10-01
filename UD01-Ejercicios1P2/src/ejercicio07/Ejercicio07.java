//Una empresa que gestiona un parque acuático te solicita una aplicación que 
//les ayude a calcular el importe que hay que cobrar en la taquilla por la 
//compra de una serie de entradas (cuyo número será introducido por el usuario). 
//Existen dos tipos de entradas: infantiles, que cuestan 15,50€; y de adultos, 
//que cuestan 20€. En el caso de que el importe total sea igual o superior a 100€,
//se aplicará automáticamente un bono descuento del 5%.
package ejercicio07;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		final Double discount = 0.95; // Constate del descuento
		final Integer DiscoCondition = 100; // Precio para el descuento
		final Double PriceChild = 15.50; // Constante de los precios
		final Double PriceAdult = 20.;
		Integer AmountChild; // Cantidade de entradas
		Integer AmountAdult;
		Double TotalAmount; // Cantidad total de coste
		Boolean UseDiscount = false; // Si se usa o no el descuento
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas entradas infantiles son");
		AmountChild = sc.nextInt();
		System.out.println("Y cuantas entradas de adulto");
		AmountAdult = sc.nextInt();
		TotalAmount = (AmountAdult * PriceAdult) + (AmountChild * PriceChild);
		if (TotalAmount >= DiscoCondition) {
			TotalAmount *= discount;
			System.out.println("Tu precio final es " + TotalAmount + "$");

		} else
			System.out.println("Tu precio final es " + TotalAmount + "$");

		sc.close();
	}

}
