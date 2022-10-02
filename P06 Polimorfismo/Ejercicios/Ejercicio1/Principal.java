package S6E1;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(3);
        Cuadrado cuadra1 = new Cuadrado(4);
        Triangulo trian1 = new Triangulo(5,3);
        Esfera esfera1 = new Esfera(7);
        Cubo cubo1 = new Cubo(5);
        Tetraedro tetra1 = new Tetraedro(6);

        Figura[] figuras = new Figura[6];
        figuras[0] = circulo1;
        figuras[1] = cuadra1;
        figuras[2] = trian1;
        figuras[3] = esfera1;
        figuras[4] = cubo1;
        figuras[5] = tetra1;

        //for que recorre arreglo de objetos "figuras"
        for( Figura pivote : figuras){
            pivote.descrpcionObjeto(); //muestra que objeto es 
            if(pivote instanceof FiguraBidimensional){
                pivote.obtenerArea();
            }
            if(pivote instanceof FiguraTridimensional){
                pivote.obtenerArea();
                FiguraTridimensional figuraTridimen;
                figuraTridimen = (FiguraTridimensional) pivote;
                figuraTridimen.obtenerVolumen();
            }
        }
    }
}
