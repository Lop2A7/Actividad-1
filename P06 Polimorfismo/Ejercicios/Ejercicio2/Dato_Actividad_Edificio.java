public class Dato_Actividad_Edificio implements ImpactoEcologico {

    private double FEmision = 0.5;
    private double TiempoUso;
    private double IntersidadLuz;
    
    public Dato_Actividad_Edificio(double tiempoUso, double intersidadLuz) {
        TiempoUso = tiempoUso;
        IntersidadLuz = intersidadLuz;
    }

    public double getTiempoUso() {
        return TiempoUso;
    }

    public void setTiempoUso(double tiempoUso) {
        TiempoUso = tiempoUso;
    }

    public double getIntersidadLuz() {
        return IntersidadLuz;
    }

    public void setIntersidadLuz(double intersidadLuz) {
        IntersidadLuz = intersidadLuz;
    }

    public double DatosA(){
        return getIntersidadLuz()*getTiempoUso();
    }

    @Override
    public double impactoEcologico() {
        return DatosA()*FEmision;
    }

    public String toString(){
        return "Edificio:"+ "\nTiempo de uso de Foco: " + TiempoUso + " H"+ "\nIntensidad de la Luz: " + IntersidadLuz + " W";
    }
    
}
