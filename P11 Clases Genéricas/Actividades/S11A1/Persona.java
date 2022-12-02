package S11.S11A1;

public class Persona {
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String nom){
        nombre = nom;
        direccion = " ";
        telefono = " ";
    }
    public Persona(String nom, String dir, String tel){
        nombre = nom;
        direccion = dir;
        telefono = tel;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
