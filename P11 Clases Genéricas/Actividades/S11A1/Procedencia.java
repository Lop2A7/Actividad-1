package S11.S11A1;

public class Procedencia {
    private String departamento;
    private String provincia; 

    public Procedencia(String depa, String pro){
        departamento = depa;
        provincia = pro;
    }
    public Procedencia(String prov){
        provincia = prov;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getDepartamento() {
        return departamento;
    }
    public String getProvincia() {
        return provincia;
    }

    @Override 
    public String toString(){
        return("Departamento "+departamento+" Provincia "+provincia);
    }
}
