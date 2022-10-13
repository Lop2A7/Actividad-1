package S7E;
import java.util.InputMismatchException;
import java.util.*;


public class ejemplocatch1 {
    public static void main(String[] ar) {
        Scanner t = new Scanner(System.in);

        try {
            int n1, n2;
            System.out.print("Ingrese primer valor entero:");
            n1 = t.nextInt();
            System.out.print("Ingrese segundo valor entero:");
            n2 = t.nextInt();
            int res = n1 / n2;
            System.out.print("La división de " + n1 + "/" + n2 + "=" + res);
        } catch (InputMismatchException ex) {
            System.out.println("Ingrese solo números enteros!!!");
        } catch (ArithmeticException ex) {
            System.out.println("No se puede dividir entre cero");
        }
    }

}
