package S6E1;

public class Circulo extends FiguraBidimensional {
    //variables
    private double radio;
    //constructor
    public Circulo(double rad){
        radio=rad;
    }
    //setter y getter
    public void setRadio(double rad){
        radio = rad;
    }
    public double getRadio(){
        return radio;
    }
    //implemetacion del metodo abtracto de Figura
    public double obtenerArea(){
        double area;
        area = ((Math.PI)*(radio*radio));
        System.out.println("Area del circulo: "+area);
        return area;
    }
    public void descrpcionObjeto(){
        System.out.println("----CIRCULO** Radio: "+radio);
    }
}
