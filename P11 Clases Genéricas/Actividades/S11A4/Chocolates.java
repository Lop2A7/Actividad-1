package S11.S11A4;

public class Chocolates extends Goodies {
    private int cantidad;
    public Chocolates(int id, String descrip, float precio, int cant){
        super(id, descrip, precio);
        cantidad = cant;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }
    @Override
    public String toString(){
        return("ID: "+getId()+" Descripción: "+getDescription()+
        " Precio: "+getPrice()+" Cantidad "+cantidad);
    }
}
