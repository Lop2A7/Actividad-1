package S6E1;

public class Tetraedro extends FiguraTridimensional{
    private double arista;
    public Tetraedro(double aris){
        arista = aris;
    }
    public void setArista(double aris){
        arista = aris;
    }
    public double getArista(){
        return arista;
    }
    public double obtenerArea(){
        double area;
        area = ((Math.sqrt(3))*(arista*arista));
        System.out.println("Area del tetraedro "+area);
        return area;
    }
    public double obtenerVolumen(){
        double volumen;
        volumen = ((Math.sqrt(2)/12)*(arista*arista*arista));
        System.out.println("Volumen del tetraedro: "+volumen);
        return volumen;
    }
    public void descrpcionObjeto(){
        System.out.println("----TETRAEDRO** Arista: "+arista+"cm");
    }
}
