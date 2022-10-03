public class Datos_Actividad_Bicicleta implements ImpactoEcologico {

    private double FEmision=0.05;
    private double Tiempo;
    private double Fabricacion;

    public Datos_Actividad_Bicicleta(double tiempo, double fabricacion) {
        Tiempo = tiempo;
        Fabricacion = fabricacion;
    }

    public double getTiempo() {
        return Tiempo;
    }

    public void setTiempo(double tiempo) {
        Tiempo = tiempo;
    }

    public double getFabricacion() {
        return Fabricacion;
    }

    public void setFabricacion(double fabricacion) {
        Fabricacion = fabricacion;
    }

    public double DatosA(){
        return getFabricacion()*getTiempo();
    }

    @Override
    public String toString(){
        return "Bicicleta:" + "\nTiempo de Fabricacion: " + Tiempo +" Dias" + "\nCantidad de CO2 producido: " + Fabricacion + " CO2";
    }

    public double impactoEcologico() {
        return DatosA()*FEmision;
    }
}