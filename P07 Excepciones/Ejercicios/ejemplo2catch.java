package S7E;
import java.util.*;

public class ejemplo2catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = {4,2,6,7};
        int n;
        boolean rep = false;
        do{
             try{
                    rep = false;
                    System.out.print("Ingrese un entero > 0 y < " + array.length + " ");                     
                    n = sc.nextInt();
                    System.out.println("Valor en la posición " + n + ": " + array[n]);
             }catch(InputMismatchException e){
                       sc.nextLine();
                       n = 0;
                       System.out.println("Solor un número entero ");
                       rep = true;
             }catch(IndexOutOfBoundsException e){
                      System.out.println("Debe introducir un número entero > 0 y < " + array.length + " ");           
                      rep = true;
             }catch(Exception e){ 
                       System.out.println("Error... " + e.toString());
                       rep = true;
             }
         }while(rep);
    }
}
