package contadortest;

public class Contador {
    static int acumulador = 0;  //variable de clase
    private int valor;          //variable de instancia 
    
    public static int acumulador() {    //metodo de clase
        return acumulador;
    }
    public Contador(int valor){     //metodo de clase      
        this.valor= valor;
        acumulador += valor;
    }
    public void inc(){              //metodo de instancia
        valor++;
        acumulador++;
    }
    public int getvalor(){          //metodo de instancia
        return this.valor;
    }
}
