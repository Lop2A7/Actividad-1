package S6E1;

public class Triangulo extends FiguraBidimensional {
    private double base;
    private double altura;

    public Triangulo(double bas, double alt){
        base = bas;
        altura = alt;
    }
    //setter y getters
    public void setBase(double b){
        base = b;
    }
    public void setAltura(double a){
        altura = a;
    }
    public double getBase(){
        return base;
    }
    public double getAltura(){
        return altura;
    }
    public double obtenerArea(){
        double area;
        area = (base*altura)/2;
        System.out.println("Area del triangulo: "+area);
        return area;
    }
    public void descrpcionObjeto(){
        System.out.println("----TRIANGULO** Base: "+base+" Altura: "+altura);
    }
}
