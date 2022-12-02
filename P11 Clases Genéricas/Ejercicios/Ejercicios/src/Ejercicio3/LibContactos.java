package Ejercicio3;
import java.security.Key;
import java.util.ArrayList;

public class LibContactos<DNI,Nombre> {
    private ArrayList<OrdererPair2<DNI, Nombre>> lista;

    public LibContactos(ArrayList<OrdererPair2<DNI, Nombre>> lista) {
        this.lista = lista;

    }

    public void add(DNI DNI, Nombre Nombre) {
        OrdererPair2<DNI, Nombre> ordererPair = new OrdererPair2<DNI, Nombre>(DNI, Nombre);
        this.lista.add(ordererPair);
    }

    public boolean delete(DNI dni) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i) != null) {
                if (this.lista.get(i).getdNI().equals(dni)) {
                    this.lista.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public Nombre getValue(int key) throws ObjectNoExist {
        Nombre value;
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i) != null) {
                if (this.lista.get(i).getdNI().equals(key)) {
                    value = (Nombre) this.lista.get(i).getNombre();
                    return value;
                }
            }
        }
        throw new ObjectNoExist("Exception: El elemento con esta llave no existe");
    }

    public ArrayList<OrdererPair2<DNI, Nombre>> getLista() {
        return this.lista;
    }

    public void setLista(ArrayList<OrdererPair2<DNI, Nombre>> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        String s = "Conta\n";
        for (int i = 0; i < this.lista.size(); i++) {
            s = s + "Contacto Nro[" + i + "]\n" + this.lista.get(i) + "\n";
        }
        return s;
    }

}
