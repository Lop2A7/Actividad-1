package Ejercicio4;

public class EmpleadoDistribucion extends Asalariado{

    private String zona;

    public EmpleadoDistribucion(String nombre, long dNI, int diasVacaciones, double salarioBase,String zona) {
        super(nombre, dNI, diasVacaciones, salarioBase);
        this.zona = zona;
    }
    public String getZona() {
        return zona;
    }

    public void setZona(String new_zona) {
        this.zona = new_zona;
    }

    public double getSalarioBase(){
        double incremento= super.getSalarioBase()*0.10;
        return super.getSalarioBase()+incremento;
    }

    @Override

    public String toString(){
        return super.toString() + " Zona: " + zona + " Salario con incremento por tipo de empleado: " + this.getSalarioBase();  
    }
}
