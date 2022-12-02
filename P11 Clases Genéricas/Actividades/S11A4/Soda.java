package S11.S11A4;

public class Soda extends Biscuits {
    String tamaño;
    public Soda(int id, String descrip, float precio, String sabo, int cant, String tam){
        super(id, descrip, precio, sabo, cant);
        tamaño = tam;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public String getTamaño() {
        return tamaño;
    }
    @Override
    public String toString(){
        return ("Id: "+getId()+" Descripcion: "+getDescription()+" Precio: "+getPrice()+
                " Sabor "+getSabor()+" Cantidad "+getCantidad()+" Tamaño: "+tamaño);
    }
    
}
