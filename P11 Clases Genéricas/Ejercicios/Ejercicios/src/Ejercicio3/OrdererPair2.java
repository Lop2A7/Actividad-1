package Ejercicio3;

public class OrdererPair2<DNI, Nombre> {

    private DNI dNI;
    private Nombre nombre;

    public OrdererPair2(DNI dNI, Nombre nombre) {
        this.dNI = dNI;
        this.nombre = nombre;
    }

    public DNI getdNI() {
        return this.dNI;
    }

    public void setdNI(DNI dNI) {
        this.dNI = dNI;
    }

    public Nombre getNombre() {
        return this.nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "DNI: " + this.dNI + "\t\tNombre: " + this.nombre;
    }
}