/*
 Escribe un programa que solicite al usuario la base y la altura de un rectángulo
(pueden contener decimales). Debe calcular y mostrar su perímetro y su área.
Área: base × altura
Perímetro: 2 × (base + altura)
 */
package ejercicio1;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Double Ba, Al;
		Scanner sc = new Scanner(System.in);
		System.out.println("dime la base");
		Ba = sc.nextDouble();
		System.out.println("dime la altura");
		Al = sc.nextDouble();
		Double A = Ba * Al;
		Double P = 2*(Ba+Al);
		System.out.println("El Área es "+A+ "y el Perimetro es "+P);
		
		sc.close();
	}

}
