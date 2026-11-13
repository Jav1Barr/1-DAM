package b06_dowhile;

import java.util.Random;
import java.util.Scanner;

import utiles.Entrada;

/*
 * UD2 · BLOQUE 6 (do-while) · EJERCICIO 11
 * ----------------------------------------
 * ENUNCIADO
 *   Piedra, papel o tijera contra el ordenador al mejor de 3: gana quien llegue antes a 2
 *   puntos.
 *
 * NOTA: usa números aleatorios, así que cada ejecución es distinta.
 *
 * EJECUTAR: clic derecho en este archivo > Run As > Java Application
 */
public class Ej11_PiedraPapelTijera {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		Integer jugador = 0;
		Integer ordenador = 0;
		do {
			String tuya = pedirJugada(sc);
			String suya;
			switch (rnd.nextInt(3)) {
			case 0: suya = "PIEDRA"; break;
			case 1: suya = "PAPEL"; break;
			default: suya = "TIJERA";
			}
			System.out.println("El ordenador elige " + suya);
			if (tuya.equals(suya)) {
				System.out.println("Empate");
			} else if ((tuya.equals("PIEDRA") && suya.equals("TIJERA"))
					|| (tuya.equals("PAPEL") && suya.equals("PIEDRA"))
					|| (tuya.equals("TIJERA") && suya.equals("PAPEL"))) {
				jugador++;
				System.out.println("Punto para ti");
			} else {
				ordenador++;
				System.out.println("Punto para el ordenador");
			}
			System.out.println("Marcador: " + jugador + " - " + ordenador);
		} while (jugador < 2 && ordenador < 2);
		System.out.println(jugador > ordenador ? "¡Has ganado!" : "Gana el ordenador");
		sc.close();
	}

	// Auxiliar: pide PIEDRA, PAPEL o TIJERA hasta que sea válido.
	static String pedirJugada(Scanner sc) {
		String jugada;
		do {
			jugada = Entrada.texto(sc, "PIEDRA, PAPEL o TIJERA: ").trim().toUpperCase();
		} while (!jugada.equals("PIEDRA") && !jugada.equals("PAPEL") && !jugada.equals("TIJERA"));
		return jugada;
	}
}
