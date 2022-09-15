package Actividades;

public class Asalariado {
    private String Nombre;
    private long DNI;
    private int diasVacaciones;
    private double SalarioBase;
    public Asalariado(String nombre, long dNI, int diasVacaciones, double salarioBase) {
        Nombre = nombre;
        DNI = dNI;
        this.diasVacaciones = diasVacaciones;
        SalarioBase = salarioBase;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public long getDNI() {
        return DNI;
    }
    public void setDNI(long dNI) {
        DNI = dNI;
    }
    public int getDiasVacaciones() {
        return diasVacaciones;
    }
    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }
    public double getSalarioBase() {
        return SalarioBase;
    }
}
