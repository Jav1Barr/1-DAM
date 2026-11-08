//Implementar una aplicación para calcular datos estadísticos de las edades de
//los alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos 
//sea negativo, y se mostrará: la suma de todas las edades introducidas, la media, 
//el número de alumnos y cuántos son mayores de edad.
package ejercico05;
import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer input = 0;
		Integer sumaEdades = 0;
		Integer mediaEdad = 0;
		Integer contadorAlumnos = 0;
		Integer contadorMayorEdad = 0;
		while (input >= 0) {
			System.out.println("dime una edad");
			input = sc.nextInt();
			if (input >= 0) {
				sumaEdades += input;
				contadorAlumnos++;
				if (input >= 18) {
					contadorMayorEdad++;
				}
			}
		}
		mediaEdad = sumaEdades/contadorAlumnos;
		System.out.println("La suma de las edades es "+ sumaEdades);
		System.out.println("La media es "+ mediaEdad);
		System.out.println("Son "+ contadorAlumnos + " alumnos y "+ contadorMayorEdad +" son mayores de edad");
		sc.close();

	}

}
