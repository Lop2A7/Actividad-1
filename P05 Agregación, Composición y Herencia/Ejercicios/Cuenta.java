package P5;

public class Cuenta {
    private String numero;
    private double saldo;

    public Cuenta(String numero, double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public Cuenta(String numero){
        this(numero, 50);
    }
    //setters
    public void setNumero(String numero){
        this.numero = numero;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    //getters
    public String getNumero(){
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

 