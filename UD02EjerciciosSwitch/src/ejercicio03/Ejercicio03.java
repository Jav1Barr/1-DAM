//Escribe un algoritmo que le pida al usuario dos números. A continuación debe mostrar el siguiente menú por pantalla:
//SUMAR LOS NÚMEROS
//RESTAR LOS NÚMEROS
//MULTIPLICAR LOS NÚMEROS
//DIVIDIR LOS NÚMEROS
//Después, el algoritmo debe pedirle al usuario que seleccione una opción y que haga 
//la operación que marca esa opción, mostrando por último el resultado de la operación elegida 
//por el usuario. Si el usuario elige una opción incorrecta, el algoritmo se lo hace saber al usuario	y no haría nada.
package ejercicio03;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el numero A");
		Integer inputA = sc.nextInt();
		System.out.println("Dime el numero B");
		Integer inputB = sc.nextInt();
		System.out.println("Elige la accion\n 1) Sumar \n 2) Restar \n 3) Multiplicar \n 4) Dividir");
		Integer accion = sc.nextInt();
		switch (accion) {
		case 1:
			Integer suma =inputA + inputB;
			System.out.println(suma);
			break;
		case 2: 
			Integer resta = inputA - inputB;
			System.out.println(resta);
			break;
		case 3:
			Integer multiplicar = inputA * inputB;
			System.out.println(multiplicar);
			break;
		case 4:
			Integer dividir = inputA/inputB;
			System.out.println(dividir);
			break;
		default:
			System.out.println("No existe esa opción");
			break;
		}
		
		sc.close();

	}

}
