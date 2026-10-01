//Una tienda aplica un descuento fijo del 15% y, posteriormente, 
//un IVA del 21%. Declara ambos porcentajes como constantes. 
//Pide el precio inicial al usuario, calcula el precio final 
//y muéstralo redondeado a dos cifras decimales utilizando Math.round().


package ejercicio03;
import java.util.Scanner;
import java.math.*;
public class Ejercicio03 {

	public static void main(String[] args) {
		final Double Discount = 0.85;
		final Double IVA = 0.21;
		Double initialPrice;
		Double FinalPrice;
		Double IVAPrice;
		Scanner sc = new Scanner (System.in);
		System.out.println("dime el precio inicial");
		initialPrice = sc.nextDouble();
		FinalPrice = (initialPrice * Discount);
		IVAPrice = FinalPrice * IVA; 
		FinalPrice += IVAPrice;
		System.out.println("El precio final es "+ Math.round(FinalPrice*100)/100.0);
		sc.close();
		
	}

}
