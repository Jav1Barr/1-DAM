package b05_while;

import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 5 (while) · EJERCICIO 03
 * -------------------------------------
 * ENUNCIADO
 *   La contraseña es «java123». Da 3 intentos como máximo: si acierta, «Acceso concedido»; si
 *   no, «Cuenta bloqueada».
 *
 * EJEMPLO DE EJECUCIÓN (lo que escribes tú aparece tras cada pregunta)
 *   Contraseña: hola
 *   Contraseña: java123
 *   Acceso concedido en 2 intento(s)
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej03_Contrasena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String clave = "java123";
		Integer intentos = 0;
		boolean acierto = false;
		while (!acierto && intentos < 3) {
			String intento = Entrada.texto(sc, "Contraseña: ");
			intentos++;
			acierto = intento.equals(clave);
		}
		if (acierto) {
			System.out.println("Acceso concedido en " + intentos + " intento(s)");
		} else {
			System.out.println("Cuenta bloqueada tras " + intentos + " intentos");
		}
		sc.close();
	}
}
