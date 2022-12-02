package S11.S11A1;

public class Estudiante extends Persona{
    private String especialidad;
    private Procedencia procedencia;

    public Estudiante(String n, Procedencia p1){
        super(n);
        procedencia = p1;
    }
    public Estudiante(String n, String d, String t, String espe, Procedencia p1){
        super(n, d, t);
        especialidad = espe;
        procedencia = p1;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void setProcede(Procedencia procede) {
        this.procedencia = procede;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public Procedencia getProcedencia() {
        return procedencia;
    }
}
