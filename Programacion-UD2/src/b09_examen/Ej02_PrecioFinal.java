package b09_examen;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 9 (tipo examen) · EJERCICIO 02
 * -------------------------------------------
 * ENUNCIADO
 *   Tienda de videojuegos: según el tipo de cliente hay un descuento (NORMAL 0 %, SOCIO 10 %,
 *   ESTUDIANTE 15 %) y, si se compran 3 o más unidades, un 5 % extra. Devuelve el precio final,
 *   o -1 si el tipo no es válido.
 *
 * FIRMA
 *   public static Double precioFinal(Double precio, String tipo, Integer unidades)
 *
 * EJEMPLOS
 *   precioFinal(100.0, "SOCIO", 1)  ->  90.0
 *   precioFinal(50.0, "ESTUDIANTE", 3)  ->  120.0
 *   precioFinal(30.0, "VIP", 1)  ->  -1.0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej02_PrecioFinal {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	// Se usa un switch sobre el tipo de cliente.
	public static Double precioFinal(Double precio, String tipo, Integer unidades) {
		Integer descuento = 0;
		Boolean tipoValido = true;
		switch (tipo) {
		case "NORMAL":
			descuento = 0;
			break;
		case "SOCIO":
			descuento = 10;
			break;
		case "ESTUDIANTE":
			descuento = 15;
			break;
		default:
			tipoValido = false;
		}
		Double res = -1.0;
		if (tipoValido) {
			if (unidades >= 3) {
				descuento += 5;
			}
			res = precio * unidades * (100 - descuento) / 100.0;
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("precioFinal SOCIO", 90.0, precioFinal(100.0, "SOCIO", 1));
		Prueba.comprueba("precioFinal ESTUDIANTE x3", 120.0, precioFinal(50.0, "ESTUDIANTE", 3));
		Prueba.comprueba("precioFinal VIP", -1.0, precioFinal(30.0, "VIP", 1));
	}
}
