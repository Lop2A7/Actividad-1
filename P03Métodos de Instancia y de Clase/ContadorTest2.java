package contadortest;

public class ContadorTest2 {
    public static void main(String[] args){

        Contador c3 = new Contador();   //primer contador
        Contador c4 = new Contador(15); //segundo contador
        //System.out.println(Contador.acumulador()); //10+15=25
        c3.inc(); 
        c4.inc();
        System.out.println(c3.getvalor());
        System.out.println(c4.getvalor());
        System.out.println(Contador.VALOR_INICIAL); //constante 10 
        
    }
}
