package prueba01;

import java.util.ArrayList;
import java.util.List;

public class Prueba01 {

	public static void main(String[] args) {
		List<Integer> nombreLista = new ArrayList<>();
		System.out.println(nombreLista);
		nombreLista.add(7); nombreLista.add(4);nombreLista.add(3); nombreLista.add(12);
		System.out.println(nombreLista);
		System.out.println(nombreLista.size());
		System.out.println(hacerSuma(nombreLista));
		
 	}
	public static Integer hacerSuma(List<Integer> nombreLista) {
		Integer suma = 0;
		for(int i = 0; i< nombreLista.size(); i ++) {
			suma += nombreLista.get(i); 
		}
		return suma;
	}
}
