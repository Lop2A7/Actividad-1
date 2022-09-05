package proyectorectangulo;

public class Coordenada {
    private int x;
    private int y;

    public Coordenada() {
        this.x = 0;
        this.y = 0;
    }
    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Coordenada(Coordenada c){
        
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public double distancia(Coordenada c){
        int x0 = (c.getX() * c.getX());
        int y0 = (c.getY() * c.getY());
        double d = Math.sqrt(x0 + y0);
        return d;
    }
    public static double distancia(Coordenada c1, Coordenada c2){
        int x1 = c1.getX();
        int y1 = c1.getY();
        int x2 = c2.getX();
        int y2 = c2.getY();
        int x3 = (x2-x1)*(x2-x1);
        int y3 = (y2-y1)*(y2-y1);
        double dis = Math.sqrt(x3 + y3);
        return dis;
    }
    @Override
    public String toString(){
        return "Coordenada: ("+x+","+y+")";
    }    
}
