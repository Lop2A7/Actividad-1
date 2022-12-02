package Ejercicio2;
import java.util.ArrayList;

public class App {
    public static <Key, Value> void main(String[] args) throws ObjectNoExist {
        OrdererPair<Integer, String> ordererPair = new OrdererPair<Integer, String>(1, "Prueba 1 De Clases Genericas");
        ArrayList<OrdererPair<Key, Value>> lista = new ArrayList<OrdererPair<Key, Value>>();
        lista.add((OrdererPair<Key, Value>) ordererPair);
        System.out.println();
        Dictionary dictionary = new Dictionary(lista);
        System.out.println(dictionary);
        dictionary.add(15, "Prueba 2 De Clases Genericas");
        dictionary.delete(1);
        System.out.println(dictionary);
        System.out.println(dictionary.getValue(20));
    }
}