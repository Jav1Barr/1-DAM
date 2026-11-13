package utiles;

public class Utiles {

    // Un número primo es mayor que 1 y solo divisible por 1 y por sí mismo.
    public static boolean esPrimo(Integer numero) {
        boolean res = numero != null && numero > 1;
        if (res) {
            for (int divisor = 2; divisor <= numero / divisor; divisor++) {
                if (numero % divisor == 0) {
                    res = false;
                }
            }
        }
        return res;
    }

    // Invierte las cifras de un entero positivo: 123 -> 321.
    public static Integer invertir(Integer n) {
        Integer resto = n;
        Integer invertido = 0;
        while (resto > 0) {
            invertido = invertido * 10 + resto % 10;
            resto = resto / 10;
        }
        return invertido;
    }

    // Un número es capicúa si se lee igual al revés (los de una cifra lo son).
    public static boolean esCapicua(Integer n) {
        return n >= 0 && invertir(n).equals(n);
    }

    // Suma de las cifras de un entero positivo.
    public static Integer sumaCifras(Integer n) {
        Integer resto = n;
        Integer suma = 0;
        while (resto > 0) {
            suma += resto % 10;
            resto = resto / 10;
        }
        return suma;
    }
}
