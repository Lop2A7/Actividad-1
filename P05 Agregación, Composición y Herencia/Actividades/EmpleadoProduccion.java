package Actividades;

public class EmpleadoProduccion extends Asalariado {
    private String turno;
    private double incremento;

    public EmpleadoProduccion(String nombre, long dNI, int diasVacaciones, double salarioBase,double incremento, String turno) {
        super(nombre, dNI, diasVacaciones, salarioBase);
        this.turno=turno;
        this.incremento=incremento;
    }   
    
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    public double getIncremento() {
        return incremento;
    }

    public void setIncremento(double incremento) {
        this.incremento = incremento;
    }

    public double getSalarioBase(){
        return super.getSalarioBase();
    }

}
