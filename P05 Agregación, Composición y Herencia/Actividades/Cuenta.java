package P5;

public class Cuenta {
    private int numero;
    private double saldo;

    public Cuenta(int numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public Cuenta(int numero){
        this(numero,0);
    }
    //setters
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    //getters
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    @Override
    public String toString(){
        return ("Numero : "+numero+" Saldo: "+saldo);
    }
}

 