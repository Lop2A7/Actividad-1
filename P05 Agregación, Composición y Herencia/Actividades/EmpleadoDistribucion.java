package Actividades;

public class EmpleadoDistribucion extends Asalariado{

    private String zona;
    private double incremento;

    public EmpleadoDistribucion(String nombre, long dNI, int diasVacaciones, double salarioBase,double incremento,String zona) {
        super(nombre, dNI, diasVacaciones, salarioBase);
        this.zona = zona;
        this.incremento=incremento;
    }
    public String getZona() {
        return zona;
    }

    public void setZona(String new_zona) {
        this.zona = new_zona;
    }

    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }
    
    public double getSalarioBase() {
        return super.getSalarioBase();
    }
}
