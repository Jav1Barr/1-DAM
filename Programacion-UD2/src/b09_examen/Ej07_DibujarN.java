package b09_examen;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 9 (tipo examen) · EJERCICIO 07
 * -------------------------------------------
 * ENUNCIADO
 *   Dibuja una letra N de asteriscos de lado x lado: primera columna, última columna y diagonal
 *   principal.
 *
 * FIRMA
 *   public static void dibujarN(Integer lado)
 *
 * EJEMPLOS
 *   dibujarN(5)  muestra:
 *       *   *
 *       **  *
 *       * * *
 *       *  **
 *       *   *
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: muestra el resultado del ejemplo)
 */
public class Ej07_DibujarN {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static void dibujarN(Integer lado) {
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				if (j == 0 || j == lado - 1 || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		System.out.println("dibujarN(5):");
		dibujarN(5);
	}
}
