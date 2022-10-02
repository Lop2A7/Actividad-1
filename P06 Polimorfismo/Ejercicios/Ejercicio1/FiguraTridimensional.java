package S6E1;

public abstract class FiguraTridimensional extends Figura{
    abstract public double obtenerArea();
    abstract public double obtenerVolumen();

    public void descrpcionObjeto(){
        System.out.println("FIGURA TRDIMENSIONAL:\ntiene anchura, altura y profundidad");
    }
}
