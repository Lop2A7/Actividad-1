package S6E1;

public class Cubo extends FiguraTridimensional {
    private double arista;
    public Cubo(double aris){
        arista = aris;
    }
    public void setLado(double ari){
        arista = ari;
    }
    public double getLado(){
        return arista;
    }
    public double obtenerArea(){
        double area;
        area = (6*(arista*arista));
        System.out.println("Area del cubo: "+ area);
        return area;
    }
    public double obtenerVolumen(){
        double volumen;
        volumen = arista*arista*arista;
        System.out.println("volumen del cubo: "+volumen);
        return volumen;
    }
    public void descrpcionObjeto(){
        System.out.println("----CUBO** Arista: "+arista+"cm");
    }
}
