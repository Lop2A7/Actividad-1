import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String cadena;
        
        try (PrintWriter salida = new PrintWriter("c:/LP/actividad2.txt")){
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN: ");
            cadena = sc.nextLine();
            while (!cadena.equalsIgnoreCase("FIN")){
                salida.println(cadena);
                cadena = sc.nextLine();
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}