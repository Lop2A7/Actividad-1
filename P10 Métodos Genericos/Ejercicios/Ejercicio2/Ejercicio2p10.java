package S10;

public class Ejercicio2p10 {
    public static void main(String[] args) {
        Integer[] arregloEnteros = {1, 2, 3, 4, 5};
        imprimirArray(arregloEnteros);
        intercambiarPosiciones(arregloEnteros, 1, 2);
        Double[] arregloDoubles = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        imprimirArray(arregloDoubles);
        intercambiarPosiciones(arregloDoubles, 3, 4);
        Character[] arregloChar = { 'H', 'O', 'L', 'A' };
        imprimirArray(arregloChar);
        intercambiarPosiciones(arregloChar, 3, 1);
    }
    public static <T> void intercambiarPosiciones(T[] arregloGene, int p1, int p2){
        T temp = arregloGene[p1];
        arregloGene[p1] = arregloGene[p2];
        arregloGene[p2]=temp;
        imprimirArray(arregloGene);
    }
    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
    System.out.println("\n");
    }
}