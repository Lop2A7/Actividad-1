package Ejercicio4;

public class EmpleadoProduccion extends Asalariado {
    private String turno;

    public EmpleadoProduccion(String nombre, long dNI, int diasVacaciones, double salarioBase, String turno) {
        super(nombre, dNI, diasVacaciones, salarioBase);
        this.turno=turno;;
    }   
    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getSalarioBase(){
        double incremento= super.getSalarioBase()*0.15;
        return super.getSalarioBase()+incremento;
    }

    @Override

    public String toString(){
        return super.toString() + " turno: " + turno + " Salario con incremento por tipo de empleado: " + this.getSalarioBase();  
    }
}
