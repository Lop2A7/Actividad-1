package S10;
import java.util.Scanner;
public class Actividad2 {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'H', 'O', 'L', 'A' };

        System.out.printf("%nArreglos CHAR con límites..:%n");
        imprimirArray(charArray);
        imprimirArray(charArray, -10, 4);

        System.out.printf("%nArreglos INTEGER con límites:%n");
        imprimirArray(intArray);
        imprimirArray(intArray, 2, 4);

        System.out.printf("%nArreglos DOUBLE con límites:%n");
        imprimirArray(doubleArray);
        imprimirArray(doubleArray, 0, 3);
    }
    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);
        System.out.println();
    }

    public static <T> void imprimirArray(T[] inputArray, Integer limiteInferior, Integer limiteSuperior) throws LimiteInvalidoException {

        Scanner sn = new Scanner (System.in);
        try {
            if (limiteInferior < 0 || limiteInferior>inputArray.length || limiteInferior==0) {
                throw new LimiteInvalidoException("Limite inferior no debe ser menor que 0");
            }
        }catch (LimiteInvalidoException e) {
            System.out.println("El LIMITE INFERIOR no puede ser menor que 0, ni mayor que "+inputArray.length);
            boolean opc1 = true;
            do{
                System.out.println("Ingrese el limite inferior otra vez: ");
                limiteInferior = sn.nextInt();
                if (limiteInferior > 0 && limiteInferior<inputArray.length)
                    opc1 = false;     
            }while(opc1);
            //imprimirArray(inputArray, limiteInferior, limiteSuperior);

        }
        try {
            if (limiteSuperior < 0 || limiteSuperior > inputArray.length) { 
                throw new LimiteInvalidoException("Limite Superior fuera del rango");
            }
        } catch (LimiteInvalidoException e) {
            System.out.println("El limite superior no puede ser mayor que " + inputArray.length+" ni menor que 0");
            boolean opc2 = true;
            do{
                System.out.println("Ingrese el limite SUPERIOR otra vez: ");
                limiteSuperior = sn.nextInt();
                if (limiteSuperior>0 && limiteSuperior<=inputArray.length)
                    opc2 = false;
            }while(opc2);
            //imprimirArray(inputArray, limiteInferior, limiteSuperior);
        }
        //***************************************** */
        for(int i = limiteInferior-1; i< limiteSuperior;i++){
            System.out.printf("%s ", inputArray[i]);
        }
        System.out.println("");
    }

    public static <T> void imprimirArray(T[] inputArray, Integer ultimo) {
        int ultIndice = (inputArray.length - 1);
        T ultimoElemento = inputArray[ultIndice];
        System.out.println(ultimoElemento);
    }
}

/*
 * do {
 * try {
 * if (limiteInferior < 0) {
 * throw new LimiteInvalidoException("Limite inferior no debe ser menor que 0");
 * // System.out.println("");
 * }
 * if (limiteInferior > inputArray.length)
 * throw new LimiteInvalidoException("Limite inferior fuera del rango");
 * }catch (LimiteInvalidoException e) {
 * System.out.println("El LIMITE INFERIOR no puede ser menor que 0");
 * }
 * try {
 * if (LimiteSuperior > inputArray.length) {
 * throw new LimiteInvalidoException("Limite Superior fuera del rango");
 * }
 * if (LimiteSuperior<0){
 * throw new LimiteInvalidoException("Limite superior no debe ser menor que 0");
 * }
 * } catch (Exception e) {
 * System.out.println("El limite inferior no puede ser mayor que " +
 * inputArray.length);
 * }
 * 
 * } while (opc1 = true);
 * 
 */









 //TRASHHHHHHHHHHHHHH
         /*for(T elemento : inputArray){
            System.out.printf("%s ",elemento);
        }*/

    /*
     * public class LimiteInvalidoException extends Exception {
     * public LimiteInvalidoException(String msg) {
     * super(msg);
     * }
     * }
     */



             /*System.out.printf(" ");
        for (int i = limiteInferior; i < inputArray.length; i++) {
            if(i < limiteSuperior)
                System.out.printf("%s ", inputArray[i]);
        }*/


                    /*for(int i = limiteInferior-1; i< limiteSuperior;i++){
                System.out.printf("%s ", inputArray[i]);
            }
            System.out.println("");*/