package b06_dowhile;



/*
 * UD2 · BLOQUE 6 (do-while) · EJERCICIO 01
 * ----------------------------------------
 * ENUNCIADO
 *   Muestra los 15 primeros múltiplos de 7 usando un do-while. No pide datos.
 *
 * EJEMPLO DE EJECUCIÓN
 *   7
 *   14
 *   21
 *   28
 *   35
 *   42
 *   49
 *   56
 *   63
 *   70
 *   77
 *   84
 *   91
 *   98
 *   105
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej01_MultiplosDeSiete {

	public static void main(String[] args) {
		Integer i = 1;
		do {
			System.out.println(7 * i);
			i++;
		} while (i <= 15);
	}
}
