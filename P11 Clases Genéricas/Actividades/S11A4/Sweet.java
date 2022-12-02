package S11.S11A4;

public class Sweet extends Biscuits{
    String color;
    public Sweet(int id, String descrip, float precio, String sabo, int cant, String co){
        super(id, descrip, precio, sabo, cant);
        color = co;
    }
    public void setTamaño(String color) {
        this.color = color;
    }
    public String getTamaño() {
        return color;
    }
    @Override
    public String toString(){
        return ("Id: "+getId()+" Descripcion: "+getDescription()+" Precio: "+getPrice()+
                " Sabor "+getSabor()+" Cantidad "+getCantidad()+" Color: "+color);
    }
}
