package Actividades;

public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public EmpleadoAsalariado(String Nombre, String apellido, String nSS,
            double salario) {
        super(Nombre, apellido, nSS);
        this.salarioSemanal = salario;
    }

    @Override
    public double obtenerMontoPago() {
        return getSalarioSemanal();
    }
    public String toString(){
        return "Salario Semanal:" + salarioSemanal;
    }
}
