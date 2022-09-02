package contadortest;

public class Contador {
    static int acumulador = 0;  //variable de clase
    final static int VALOR_INICIAL = 10;
    private int valor;          //variable de instancia 
    static int nContadores = 0; //variable de clase
    static int ultimoContador = 0;  //variable de clase
    
    public static int acumulador() {    //metodo de clase
        return acumulador;
    }
    public Contador(int valor){     //metodo de clase      
        this.valor= valor;
        acumulador += valor;
        nContadores++;
        ultimoContador = valor;
    }
    public Contador(){
        //new Contador(Contador.VALOR_INICIAL);
        this(Contador.VALOR_INICIAL);
    }
    public void inc(){              //metodo de instancia
        valor++;
        acumulador++;
    }
    public int getvalor(){          //metodo de instancia
        return this.valor;
    }
}
