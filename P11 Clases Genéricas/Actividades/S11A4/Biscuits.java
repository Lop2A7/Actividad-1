package S11.S11A4;

public class Biscuits extends Goodies {
    private String sabor;
    private int cantidad;

    public Biscuits(int id, String descrip, float precio, String sabo, int cant){
        super(id, descrip, precio);
        sabor = sabo;
        cantidad = cant;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public String getSabor() {
        return sabor;
    }
    public int getCantidad() {
        return cantidad;
    }
    @Override
    public String toString(){
        return("ID: "+getId()+" Descripción: "+getDescription()+" Precio: "+
        getPrice()+" Sabor: "+sabor+" Cantidad "+cantidad);
    }
}
