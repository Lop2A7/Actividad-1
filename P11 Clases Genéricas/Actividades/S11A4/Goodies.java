package S11.S11A4;

public class Goodies {
    private int id;
    private String description;
    private float price;

    public Goodies(int idd){
        id = idd;
    }
    public Goodies(int i, String des, float pri){
        id = i;
        description = des;
        price = pri;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public float getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return ("ID: "+id+" Descripción: "+description+" Precio: "+price);
    }
}
