package testEjercicios;

import ejercicios.Ejercicios;

public class TestEjercicios {

	public static void main(String[] args) {
		System.out.println("EJERCICIO 1 \n");
		System.out.println("El precio de la entrada es de "+ Ejercicios.precioEntrada(10,"SABADO", true)+"€");
		System.out.println("El precio de la entrada es de "+ Ejercicios.precioEntrada(35,"LUNES", false)+"€");
		System.out.println("El precio de la entrada es de "+ Ejercicios.precioEntrada(66,"VIERNES", true)+"€");
		System.out.println("El precio de la entrada es de "+ Ejercicios.precioEntrada(-1,"LUNES", false)+"€");
		System.out.println("\n \n Ejercicio 2 \n");
		Ejercicios.dibujarZ(5);
		System.out.println("\n \n Ejercicio 3 \n"); // manquepierda
		System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 3));
		System.out.println(Ejercicios.sumaPrimerosEspeciales(1, 10, 5));
		System.out.println(Ejercicios.sumaPrimerosEspeciales(8, 15, 2));
		System.out.println("\n \n Ejercicio 4 \n");
		System.out.println(Ejercicios.factorialConSaltos(7, 2));
		System.out.println(Ejercicios.factorialConSaltos(8, 3));
		System.out.println(Ejercicios.factorialConSaltos(5, 1));
		System.out.println(Ejercicios.factorialConSaltos(0, 2));
	}

}
