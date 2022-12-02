package Ejercicio2;

public class OrdererPair<Key, Value> {

    private Key key;
    private Value value;

    public OrdererPair(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

    public Key getKey() {
        return this.key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Value getValue() {
        return this.value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key: " + this.key + "\t\tValue: " + this.value;
    }
}