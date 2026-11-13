package b06_dowhile;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 6 (do-while) · EJERCICIO 06
 * ----------------------------------------
 * ENUNCIADO
 *   Cajero con un saldo inicial de 500 €: 1) consultar, 2) ingresar, 3) retirar, 4) salir. El
 *   menú se repite hasta elegir 4.
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   1) Consultar  2) Ingresar  3) Retirar  4) Salir
 *   Opción: 1
 *   Saldo: 500,00 €
 *
 *   1) Consultar  2) Ingresar  3) Retirar  4) Salir
 *   Opción: 2
 *   Cantidad a ingresar: 100
 *
 *   1) Consultar  2) Ingresar  3) Retirar  4) Salir
 *   Opción: 3
 *   Cantidad a retirar: 50
 *
 *   1) Consultar  2) Ingresar  3) Retirar  4) Salir
 *   Opción: 1
 *   Saldo: 550,00 €
 *
 *   1) Consultar  2) Ingresar  3) Retirar  4) Salir
 *   Opción: 4
 *   Hasta pronto
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej06_CajeroAutomatico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double saldo = 500.0;
		Integer opcion;
		do {
			System.out.println("\n1) Consultar  2) Ingresar  3) Retirar  4) Salir");
			opcion = Entrada.entero(sc, "Opción: ");
			switch (opcion) {
			case 1:
				System.out.printf("Saldo: %.2f €%n", saldo);
				break;
			case 2:
				Double ingreso = Entrada.decimal(sc, "Cantidad a ingresar: ");
				if (ingreso > 0) {
					saldo += ingreso;
				} else {
					System.out.println("Cantidad errónea");
				}
				break;
			case 3:
				Double retirada = Entrada.decimal(sc, "Cantidad a retirar: ");
				if (retirada <= 0) {
					System.out.println("Cantidad errónea");
				} else if (retirada > saldo) {
					System.out.println("Saldo insuficiente");
				} else {
					saldo -= retirada;
				}
				break;
			case 4:
				System.out.println("Hasta pronto");
				break;
			default:
				System.out.println("Opción incorrecta");
			}
		} while (opcion != 4);
		sc.close();
	}
}
