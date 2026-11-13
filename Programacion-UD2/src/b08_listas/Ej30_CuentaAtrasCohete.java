package b08_listas;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 8 (listas, recursividad y cifras) · EJERCICIO 30
 * -------------------------------------------------------------
 * ENUNCIADO
 *   Muestra T-n, T-(n-1)... hasta llegar a 0 y entonces «¡Despegue!», de forma recursiva.
 *
 * FIRMA
 *   public static void cuentaAtrasCohete(Integer n)
 *
 * EJEMPLOS
 *   cuentaAtrasCohete(3)  muestra:
 *       T-3
 *       T-2
 *       T-1
 *       ¡Despegue!
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: muestra el resultado del ejemplo)
 */
public class Ej30_CuentaAtrasCohete {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static void cuentaAtrasCohete(Integer n) {
		if (n <= 0) {
			System.out.println("¡Despegue!");
		} else {
			System.out.println("T-" + n);
			cuentaAtrasCohete(n - 1);
		}
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		System.out.println("cuentaAtrasCohete(3):");
		cuentaAtrasCohete(3);
	}
}
