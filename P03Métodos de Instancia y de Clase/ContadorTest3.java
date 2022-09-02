package contadortest;

public class ContadorTest3 {
    public static void main(String[] args){

        Contador c3 = new Contador();   //primer contador
        Contador c4 = new Contador(15); //segundo contador
        Contador c5 = new Contador(66); //tercer contador
        Contador c6 = new Contador(6);  //cuarto contador //ultimo contador  
        
        c5.getvalor();
        c6.inc();
        c6.inc();
        
        System.out.println("Número de contadores "+Contador.nContadores);
        System.out.println("Valor inicial de ultimo contador: "+Contador.ultimoContador);
    }
}
