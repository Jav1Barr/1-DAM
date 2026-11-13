package b06_dowhile;



/*
 * UD2 · BLOQUE 6 (do-while) · EJERCICIO 02
 * ----------------------------------------
 * ENUNCIADO
 *   Cuenta atrás de 10 a 0 con un do-while y al final muestra «¡Despegue!». No pide datos.
 *
 * EJEMPLO DE EJECUCIÓN
 *   10
 *   9
 *   8
 *   7
 *   6
 *   5
 *   4
 *   3
 *   2
 *   1
 *   0
 *   ¡Despegue!
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej02_CuentaAtras10 {

	public static void main(String[] args) {
		Integer i = 10;
		do {
			System.out.println(i);
			i--;
		} while (i >= 0);
		System.out.println("¡Despegue!");
	}
}
