package Ejercicio3;

public class Banco {
    private String nombre;
    private Persona clientes[];

    public Banco(String nombre) {
        this(nombre, 20);
    }

    public Banco(String nombre, int numCli) {
        this.nombre = nombre;
        this.clientes = new Persona[numCli];
    }

    // setter y getter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getClientes() {
        return clientes;
    }

    public void setClientes(Persona[] clientes) {
        this.clientes = clientes;
    }

    public boolean ExistenciadeCliente(Persona persona) {
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null && clientes[i].equals(persona)) {
                return true;
            }
        }
        return false;
    }

    public void agregarCliente(Persona persona) {
        if (ExistenciadeCliente(persona)) {
            System.out.println("Cliente ya registrado, porfavor digite otro...");
        } else {
            boolean registrado = false;
            for (int i = 0; i < clientes.length && !registrado; i++) {
                if (clientes[i] == null) {
                    clientes[i] = persona;
                    registrado = true;
                }
            }
        }
    }

    public void darBajaCliente(int user) {
        boolean eliminar = false;
        for (int i = 0; i < clientes.length && !eliminar; i++) {
            if (clientes[i] != null && i == user) {
                clientes[i] = null;
                eliminar = true;
            }
        }
        if (eliminar == true) {
            System.out.println("El cliente seleccionado se elimino con exito...\n");
        } else {
            System.out.println("El cliente seleccionado no se elimino...\n");
        }
    }

    public boolean buscarCliente(int user) {
        int i = 0;
        boolean BC = false;
        while (i < clientes.length || BC == true) {
            i += 1;
            if (i == user) {
                System.out.println("Usuario " + user + " encontrado");
                BC = true;
                break;
            }
        }
        if (BC == false) {
            System.out.println("Usuario " + user + " no encontrado");
        }
        return false;
    }

    public String clienteTipo(String tipo) {
        if (tipo == "C") {
            System.out.println("Users con cuenta cliente" + super.toString());
        }if(tipo == "B"){
            System.out.println("Users con cuenta Banca Exclusiva" + super.toString());
            return tipo;
        }if(tipo == "F"){
            System.out.println("Users con cuenta Empresarial" + super.toString());
            return tipo;
        }
        return null;        
    }

    public String toString() {
        String CLI = "";
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
            } else {
                CLI = CLI + " " + clientes[i].toString() + "\n";
            }
        }
        return " Banco { " + nombre + " Clientes {" + "\n" + CLI + "}";
    }
}
