package b09_examen;

import utiles.Prueba;

/*
 * UD2 · BLOQUE 9 (tipo examen) · EJERCICIO 03
 * -------------------------------------------
 * ENUNCIADO
 *   Viajes en tren: el precio por persona es MADRID 30 €, BARCELONA 45 € y LISBOA 60 €. Ida y
 *   vuelta cuesta 1,8 veces más y, con 4 o más personas, hay un 10 % de descuento. Devuelve -1
 *   si el destino no existe.
 *
 * FIRMA
 *   public static Double precioViaje(String destino, Integer personas, Boolean idaYVuelta)
 *
 * EJEMPLOS
 *   precioViaje("MADRID", 2, false)  ->  60.0
 *   precioViaje("LISBOA", 1, true)  ->  108.0
 *   precioViaje("BARCELONA", 4, false)  ->  162.0
 *   precioViaje("PARIS", 1, false)  ->  -1.0
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 *           (no pide nada por teclado: ejecuta los ejemplos y muestra OK o FALLO)
 */
public class Ej03_PrecioViaje {

	public static void main(String[] args) {
		probar();
		Prueba.resumen();
	}

	// ---------- SOLUCIÓN ----------
	public static Double precioViaje(String destino, Integer personas, Boolean idaYVuelta) {
		Double precioPersona = 0.0;
		switch (destino) {
		case "MADRID":
			precioPersona = 30.0;
			break;
		case "BARCELONA":
			precioPersona = 45.0;
			break;
		case "LISBOA":
			precioPersona = 60.0;
			break;
		default:
			precioPersona = -1.0;
		}
		Double res = -1.0;
		if (precioPersona > 0) {
			res = precioPersona * personas;
			if (idaYVuelta) {
				res = res * 1.8;
			}
			if (personas >= 4) {
				res = res * 0.9;
			}
		}
		return res;
	}

	// ---------- PRUEBAS (los ejemplos del enunciado) ----------
	public static void probar() {
		Prueba.comprueba("precioViaje MADRID", 60.0, precioViaje("MADRID", 2, false));
		Prueba.comprueba("precioViaje LISBOA ida/vuelta", 108.0, precioViaje("LISBOA", 1, true));
		Prueba.comprueba("precioViaje BARCELONA x4", 162.0, precioViaje("BARCELONA", 4, false));
		Prueba.comprueba("precioViaje PARIS", -1.0, precioViaje("PARIS", 1, false));
	}
}
