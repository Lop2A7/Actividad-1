public class App {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', '0', 'L', 'A' };
        Boolean[] booleanArray ={true,false};
        Float[] floatArray = {(float) 3.1416, (float) 9.8463};
        System.out.printf("Array integerArray contiene: %n");
        imprimirArray(intArray);
        System.out.printf("inArray doubleArray contiene: %n");
        imprimirArray(doubleArray);
        System.out.printf("inArray charArray contiene: %n");
        imprimirArray(charArray);
        System.out.printf("inArray booleanArray contiene: %n");
        imprimirArray(booleanArray);
        System.out.printf("inArray floatArray contiene: %n");
        imprimirArray(floatArray);
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);
        System.out.println();
    }
}