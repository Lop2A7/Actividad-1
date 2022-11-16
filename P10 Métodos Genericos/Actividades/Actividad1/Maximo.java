public class Maximo {
    public static void main(String[] args) throws Exception {
        System.out.printf("Maximo de %d, %d y %d es %d%n%n",

                3, 4, 5, maximo(3, 4, 5));
        System.out.printf("Maximo de %.1f, %.1f y %.1f es %.1f%n%n", 6.6, 7.7, 8.8, maximo(6.6, 7.7, 8.8));
        // Para el caso de los objetos String la comparacion se hace alfabeticamente.
        System.out.printf("Maximo de %s, %s and %s es %s%n%n",
                "pera", "zanahoria", "uva", maximo("pera", "zanahoria", "uva"));

        //Integer
        System.out.printf("Minimo de %d, %d, %d y %d es %d%n%n",6, 4, 9,10, menor(6, 4, 9,10));
        //Double
        System.out.printf("Minimo de %.1f, %.1f , %.1f y %.1f es %.1f%n%n",6.945, 4.8243, 9.7342,10.95, menor(6.9, 4.8, 9.7,10.95));
        //String
        System.out.printf("Minimo de de %s, %s, %s and %s es %s%n%n","Juan", "Mario", "Marcos","Jose", menor("Juan", "Mario", "Marcos","Jose"));
    }

    public static Comparable maximo(Comparable x, Comparable y, Comparable z) {

        Comparable max = x;
        if (y.compareTo(x) > 0)
            max = y;

        if (z.compareTo(y) > 0)
            max = z;
        return max;
    }

    public static Comparable menor(Comparable x, Comparable y, Comparable z, Comparable w) {
        Comparable min = x;
        if (y.compareTo(x) <= 0)
            min = y;

        if (z.compareTo(y) <= 0)
            min = z;

        if (w.compareTo(z) <= 0)
            min = z;
        
        return min;
    }
}
