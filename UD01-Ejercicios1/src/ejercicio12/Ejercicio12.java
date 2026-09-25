package ejercicio12;
import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		final double peras$ = 1.95, manzanas$ = 2.35;
		int kman, kperas;
		Scanner sc = new Scanner (System.in); 
			System.out.println("Introduzca los kilos de manzanas vendidos");
			kman = sc.nextInt();
			System.out.println("Introduzca los kilos de peras vendidos");
			kperas = sc.nextInt();
			double beneficioManzanas = kman * manzanas$;
			System.out.println("El beneficio de las manzanas es de "+ beneficioManzanas+" $");
			double beneficioPeras = kperas * peras$;
			System.out.println("El beneficio de las peras es de "+ beneficioPeras+" $");
			sc.close();
			
		
	}

}