package S11.S11A2;

public class App {

    public static void main(String[] args) {
        OrderedPair Par1 = new OrderedPair(12,13);
        OrderedPair Par2 = new OrderedPair(12,"Hola");
        Persona Juan = new Persona("Juan","Arequipa","123456");
        OrderedPair Par3 = new OrderedPair("hola",Juan);
        System.out.println(Par1);
        System.out.println(Par2);
        System.out.println(Par3);
    }
    
}
