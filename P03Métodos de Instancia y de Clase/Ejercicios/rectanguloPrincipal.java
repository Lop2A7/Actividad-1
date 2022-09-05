package proyectorectangulo;
import java.util.*;
public class ProyectoRectangulo {
    public static void main(String[] args) {
        Coordenada r1 = new Coordenada(3,2);    //creando coordenadas
        Coordenada r2 = new Coordenada(7,4);
        //mostrando datos de la coordenada r1
        System.out.println("Coordenada 1: "+ r1.toString());
        System.out.println("Coordenada 2:");
        System.out.println("X:"+r2.getX()+" Y:"+r2.getY());
        //distancia entre coordenada r1=(3,2) y (0,0)
        System.out.println("Distancia entre (3,2)(0,0): "+r1.distancia(r1));
        //distancia entre 2 coordenadas (3,2) y (7,4)
        System.out.println("Distancia entre (3,2)(7,4): "+Coordenada.distancia(r1,r2));
        System.out.println("*********Rectangulos*******");
        Rectangulo rec1 = new Rectangulo(6,8);
        System.out.println("Altura del rectangulo: "+rec1.altura);
        System.out.println("Base del rectangulo: "+rec1.base);
        // r1 y r2 son coordenadas 
        System.out.println("Nuevo Rectángulo");
        Rectangulo rec2 = new Rectangulo(r1,r2); //rectangulo con 2 esquinas
        System.out.println(rec2.toString());
        //metodos de la clase manejador
        //Rectangulo rec3 = new Rectangulo(6,3);
        //Manejador m1 = new Manejador(6,3);
        //Rectangulo rec6 = new Manejador();
        //System.out.println("Area: "+m1.area());
        rec2.asginarColor();     
    } 
}
