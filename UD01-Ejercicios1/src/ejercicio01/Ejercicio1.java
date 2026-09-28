package ejercicio1;
import  java.util.Scanner;
public class Ejercicio1 {
//holaa
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //abrimos el escaner
		Long numero; //definimos la variable numero
		System.out.println("Escriba su numero de telefono"); // pedimos el numero de tlf
		numero = sc.nextLong(); // leemos el numero que se escribe
		System.out.println("Ha escrito "+ numero); // imprimimos el numero escrito
		sc.close(); // cerramos el escaner 
	}

}
