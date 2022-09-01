package contadortest;

public class ContadorTest {
    public static void main(String[] args){
        Contador c1,c2;

        System.out.println(Contador.acumulador()); /* Metodo de Clase */
        c1 = new Contador(3);
        c2 = new Contador(10);
        c1.inc(); /* Metodo Instancia */
        c1.inc(); /* Metodo Instancia */
        c2.inc(); /* Metodo Instancia */
        System.out.println(c1.getvalor());/* Metodo Instancia */
        System.out.println(c2.getvalor());/* Metodo Instancia */
        System.out.println(Contador.acumulador); /* Metodo de Clase */
        
    }
}
