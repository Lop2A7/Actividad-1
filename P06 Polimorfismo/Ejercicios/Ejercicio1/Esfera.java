package S6E1;

public class Esfera extends FiguraTridimensional{
    private double radio;
    public Esfera(double radi){
        radio = radi;
    }
    public void setRadio(double ra){
        radio = ra;
    }
    public double getRadio(){
        return radio;
    }
    public double obtenerArea(){
        double area;
        area = ((4*Math.PI)*(radio*radio));
        System.out.println("Area de la esfera: "+area);
        return area;
    }
    public double obtenerVolumen(){
        double volumen;
        //volumen = ((4/3)*(3.1416)*(Math.pow(radio,3)));
        volumen = ((4/3) * Math.PI*(radio*radio*radio));
        System.out.println("Volumen de la esfera: "+volumen);
        return volumen;
    }
    public void descrpcionObjeto(){
        System.out.println("----ESFERA** Radio: "+radio+"cm");
    }
}
