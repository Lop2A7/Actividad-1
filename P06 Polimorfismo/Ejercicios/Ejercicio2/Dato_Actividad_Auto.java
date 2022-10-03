public class Dato_Actividad_Auto implements ImpactoEcologico{
    private double FEmision = 0.3;
    private double Gasolina;
    private double KmUso;

    public Dato_Actividad_Auto(double gasolina, double kmUso) {
        Gasolina = gasolina;
        KmUso = kmUso;
    }

    public double getGasolina() {
        return Gasolina;
    }


    public void setGasolina(double gasolina) {
        Gasolina = gasolina;
    }
 
    public double getKmUso() {
        return KmUso;
    }


    public void setKmUso(double kmUso) {
        KmUso = kmUso;
    }

    public double DatosA(){
        return getKmUso()/getGasolina();
    }
    @Override
    public double impactoEcologico() {
        return DatosA()*FEmision;
    }
    
    public String toString(){
        return "Auto:"+ "\nGasolina del Carro: " + Gasolina +" L"+ "\nkimlometros recorridos: " + KmUso +" KM";
    }
}
