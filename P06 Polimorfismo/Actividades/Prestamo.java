package Actividades;

public class Prestamo implements PorPagar{

    private double numeroDeCuotas;
    private double montoDeCuotas;

    public Prestamo(int numeroDeCuotas, int montoDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
        this.montoDeCuotas = montoDeCuotas;
    }

    public double getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }

    public double getMontoDeCuotas() {
        return montoDeCuotas;
    }

    public void setMontoDeCuotas(int montoDeCuotas) {
        this.montoDeCuotas = montoDeCuotas;
    }
    
    @Override
    public double obtenerMontoPago() {
        return 0;
    }
    public String toString(){
        return "Numero de Cuotas: " + numeroDeCuotas + "\nMonto de Cuotas: " + montoDeCuotas;
    }
}
