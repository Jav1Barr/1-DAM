package utiles;

import java.util.Scanner;

/**
 * Lectura por teclado línea a línea. Evita el problema del salto de línea
 * pendiente de nextInt() y acepta decimales con coma o con punto.
 */
public class Entrada {

    public static Integer entero(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Integer.parseInt(sc.nextLine().trim());
    }

    /** Pide un entero hasta que sea mayor que 0. */
    public static Integer enteroPositivo(Scanner sc, String mensaje) {
        Integer n;
        do {
            n = entero(sc, mensaje);
        } while (n <= 0);
        return n;
    }

    public static Double decimal(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
    }

    public static String texto(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    /** Primer carácter de la línea escrita (cadena vacía -> espacio). */
    public static char caracter(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        String linea = sc.nextLine().trim();
        return linea.isEmpty() ? ' ' : linea.charAt(0);
    }
}
