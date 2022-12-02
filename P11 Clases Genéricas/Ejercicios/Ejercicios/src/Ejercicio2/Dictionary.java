package Ejercicio2;
import java.util.ArrayList;

public class Dictionary<Key,Value> {
    private ArrayList<OrdererPair<Key, Value>> lista;

    public Dictionary(ArrayList<OrdererPair<Key, Value>> lista) {
        this.lista = lista;

    }

    public void add(Key key, Value value) {
        OrdererPair<Key, Value> ordererPair = new OrdererPair<Key, Value>(key, value);
        this.lista.add(ordererPair);
    }

    public boolean delete(Key key) {
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i) != null) {
                if (this.lista.get(i).getKey().equals(key)) {
                    this.lista.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public Value getValue(int key) throws ObjectNoExist {
        Value value;
        for (int i = 0; i < this.lista.size(); i++) {
            if (this.lista.get(i) != null) {
                if (this.lista.get(i).getKey().equals(key)) {
                    value = (Value) this.lista.get(i).getValue();
                    return value;
                }
            }
        }
        throw new ObjectNoExist("Exception: El elemento buscado no existe no existe");
    }

    public ArrayList<OrdererPair<Key, Value>> getLista() {
        return this.lista;
    }

    public void setLista(ArrayList<OrdererPair<Key, Value>> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        String s = "Diccionario\n";
        for (int i = 0; i < this.lista.size(); i++) {
            s = s + "Par ordenado[" + i + "]\n" + this.lista.get(i) + "\n";
        }
        return s;
    }

}
