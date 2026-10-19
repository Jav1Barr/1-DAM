//Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, pidiendo a cada jugador 
//que escriba PIEDRA, PAPEL o TIJERA. El juego debe mostrar por pantalla quién ha ganado el 
//juego tras jugar una partida. Hay que contemplar el caso de que empaten.

package ejercicio07;
import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("vamos a jugar piedra, papel o tijera");
		System.out.println("Jugador 1 eliga\n 1) piedra \n 2) papel \n 3) tijera");
		Integer inputJugador1 = sc.nextInt();
		System.out.println("Jugador 2 eliga\n 1) piedra \n 2) papel \n 3) tijera");
		Integer inputJugador2 = sc.nextInt();
		if (inputJugador1 == 1) {
			if (inputJugador2 == 1 ) {
				System.out.println("Empate");
			}else if (inputJugador2 == 2 ) {
				System.out.println("Jugador 2 gana");
			}else {
				System.out.println("Jugador 1 gana");
			}
		
		}else if (inputJugador1 == 2 ) {
			if (inputJugador2 == 2 ) {
				System.out.println("Empate");
			}else if (inputJugador2 == 3 ) {
				System.out.println("Jugador 2 gana");
			}else {
				System.out.println("Jugador 1 gana");
			}
		
		}else if (inputJugador1 == 3) {
			if (inputJugador2 == 3 ) {
				System.out.println("Empate");
			}else if (inputJugador2 == 1 ) {
				System.out.println("Jugador 2 gana");
			}else {
				System.out.println("Jugador 1 gana");
			}
		
		}else {
			System.out.println("Valor incorrecto");
		}
		sc.close();
		

	}

}
