package b04_for;



/*
 * UD2 · BLOQUE 4 (for) · EJERCICIO 05
 * -----------------------------------
 * ENUNCIADO
 *   Calcula y muestra la suma de los 10 primeros múltiplos de 5 (5 + 10 + ... + 50). No pide
 *   datos.
 *
 * EJEMPLO DE EJECUCIÓN
 *   Suma: 275
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej05_SumaMultiplosDeCinco {

	public static void main(String[] args) {
		Integer suma = 0;
		for (int i = 1; i <= 10; i++) {
			suma += 5 * i;
		}
		System.out.println("Suma: " + suma);
	}
}
