package S6E1;

public class Cuadrado extends FiguraBidimensional{
    private double lado;
    
    public Cuadrado(double lad){
        lado = lad;
    }
    public void setLado(double l){
        lado = l;
    }
    public double getLado(){
        return lado;
    }
    public double obtenerArea(){
        double area;
        area = lado*lado;
        System.out.println("Area del cuadrado: "+ area);
        return area;
    }
    public void descrpcionObjeto(){
        System.out.println("----CUADRADO** Lado: "+lado);
    }
}
