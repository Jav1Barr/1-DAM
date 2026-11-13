package b09_examen;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 9 (tipo examen) · EJERCICIO 06
 * -------------------------------------------
 * ENUNCIADO
 *   Recursivo: devuelve n + (n - salto) + (n - 2·salto) + ... mientras el valor sea positivo.
 *   Si salto es 0 o negativo no avanzaría nunca, así que devuelve 0.
 *
 * FIRMA
 *   public static Integer sumaConSaltos(Integer n, Integer salto)
 *
 * EJEMPLOS
 *   sumaConSaltos(10, 3)  ->  22
 *   sumaConSaltos(5, 2)  ->  9
 *   sumaConSaltos(0, 2)  ->  0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej06_SumaConSaltos {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Integer sumaConSaltos(Integer n, Integer salto) {
		Integer res = 0;
		if (n > 0 && salto > 0) {
			res = n + sumaConSaltos(n - salto, salto);
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("sumaConSaltos(10,3)", 22, sumaConSaltos(10, 3));
		Prueba.comprueba("sumaConSaltos(5,2)", 9, sumaConSaltos(5, 2));
		Prueba.comprueba("sumaConSaltos(0,2)", 0, sumaConSaltos(0, 2));
	}
}
