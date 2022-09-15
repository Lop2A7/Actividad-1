package Actividades;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Asalariado A1 = new Asalariado("Jose Manuel", 70513742, 1000, 2000);
        EmpleadoProduccion P1 = new EmpleadoProduccion("Jack Laurencio", 75914201, 30, 1700, 25, "Tarde");
        EmpleadoDistribucion D1 = new EmpleadoDistribucion("Sebastian Caro", 92837112, 70, 1500, 15, "Arequipa");

        System.out.println("El nombre de nuerstro 1er asalariado es: " + A1.getNombre() + " Su numero de DNI es: " + A1.getDNI() + " Y su salario base es de: " + A1.getSalarioBase());
        System.out.println("El nombre de nuerstro 1er Empleado de Produccion es: " + P1.getNombre() + " Su numero de DNI es: " + P1.getDNI() + " su salario base es de: " + A1.getSalarioBase() + "Y su turno es: " + P1.getTurno());
        System.out.println("El nombre de nuerstro 1er Empleado de Distribucion es: " + D1.getNombre() + " Su numero de DNI es: " + D1.getDNI() + " su salario base es de: " + D1.getSalarioBase() + "Y su Zona de trabajo es: " + D1.getZona());

        // Asalariado A2;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Ingrese el nombre de nuestro asalariado ");

        // sc.close();
    }
}
