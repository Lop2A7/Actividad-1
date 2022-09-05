package proyectorectangulo;


public class Rectangulo extends Coordenada {
    private Coordenada esquina1;
    private Coordenada esquina2;
    public int base;
    public int altura;
    public String color = " ";
    public String ultimoColor = " ";

    public Rectangulo(Coordenada c1, Coordenada c2){
        this.esquina1 = c1;
        this.esquina2 = c2;  
    }
    public Rectangulo(int x, int y){
        this.base = x;
        this.altura = y;
    }
    public Coordenada getEsquina1(){
        return esquina1;
    }
    public void setEsquina1(Coordenada esquina1){
        this.esquina1 = esquina1;
    }
    public Coordenada getEsquina2(){
        return esquina2;
    }
    public void setEsquina2(Coordenada esquina2){
        this.esquina2 = esquina2;
    }
    public void asginarColor(){
        for(int i= 1; i<=3;i++ ){
            
            if (i == 1){
                color = "verde";
                i++;
            }
            if (i == 2){
                color = "amarillo";
                i++;
            }
            if (i == 3 ){
                color = "rojo";
                i++;
            }
        ultimoColor = color;
        System.out.println("Ultimo color "+ultimoColor);
        }
    }
    
    @Override
    public String toString(){
        return "Esquina1: "+esquina1+" Esquina2: "+esquina2;
    } 
}
