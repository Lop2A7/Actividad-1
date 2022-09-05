package proyectorectangulo;
public class Manejador extends Rectangulo{
    /*public Manejador(Coordenada c1, Coordenada c2) {
        super(c1, c2);
    }*/
    /*public Manejador(int x, int y) {
        super(x, y);
    }*/
    public Manejador(Rectangulo r1){
        this.base = r1.base;
        this.altura = r1.altura;
        
    }
    public double area(){
        double a = this.base * this.altura;
        return a;
    }
    public double perimetro(Rectangulo r2){
        double peri = ((r2.base)*2)+((r2.altura)*2);
        return peri;
    }
    public void moverX(int x){
        this.base = this.base + x;
    }
    public void moverY(int y){
        this.altura = this.altura + y;
    }
}
