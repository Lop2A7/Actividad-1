package Ejercicio3;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String tipo;

    public Persona(int id, String nombre, String apellido,String tipo, int numero) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo=tipo;
    }

    // setter y getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Cliente:{" + "id=" + id + ", nombre= " + nombre + ", apellido= " + apellido + " Tipo= " + tipo + '}';
    }


}
