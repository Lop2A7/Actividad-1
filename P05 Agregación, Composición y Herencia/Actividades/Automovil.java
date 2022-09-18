package P5_AGREGACION;

public class Automovil {
    private String placa;
    private int numPuertas;
    private String marca;
    private String modelo;
    private Motor motor;

    public Automovil(String placa, int nPuertas, String marca, String modelo){
        this.placa = placa;
        this.numPuertas = nPuertas;
        this.marca = marca;
        this.modelo = modelo;
    }
    //setters
    public void setPlaca(String placa){
        this.placa = placa; 
    }
    public void setNumPuertas(int numPuertas){
        this.numPuertas = numPuertas; 
    }
    public void setMarca(String marca){
        this.marca = marca; 
    }
    public void setModelo(String modelo){
        this.modelo = modelo; 
    }
    public void setMotor(Motor motor){
        this.motor = motor; 
    }
    //getters
    public String getPlaca(){
        return this.placa; 
    }
    public int getNumPuertas(){
        return this.numPuertas; 
    }
    public String getMarca(){
        return this.marca; 
    }
    public String getModelo(){
        return this.modelo; 
    }
    public Motor getMotor(){
        return this.motor; 
    }
    @Override
    public String toString(){
        //System.out.println("**PERSONA**");
        return ("Placa: "+placa+"\nNum Puertas: "+numPuertas+"\nMarca: "+marca+"\nModelo: "+modelo+"\nMotor: "+motor);
    }
}
