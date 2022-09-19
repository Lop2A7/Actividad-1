package Ejercicio4;

public class Principal {
    public static void main(String[] args) {
        Asalariado A1 = new Asalariado("Jose Manuel", 70513742, 100, 2000);
        EmpleadoProduccion P1 = new EmpleadoProduccion("Jack Laurencio", 75914201, 30, 1700, "Tarde");
        EmpleadoDistribucion D1 = new EmpleadoDistribucion("Sebastian Caro", 92837112, 70, 1500, "Arequipa");

        System.out.println(A1.toString());
        System.out.println(P1.toString());
        System.out.println(D1.toString());
    }
}
