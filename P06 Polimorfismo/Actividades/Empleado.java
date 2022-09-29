package Actividades;

public abstract class Empleado implements PorPagar {
    private String PrimerNombre;
    private String ApellidoPaterno;
    private String NumeroSeguroSocial;
    
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        PrimerNombre = primerNombre;
        ApellidoPaterno = apellidoPaterno;
        NumeroSeguroSocial = numeroSeguroSocial;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        PrimerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        ApellidoPaterno = apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return NumeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        NumeroSeguroSocial = numeroSeguroSocial;
    }
   
}