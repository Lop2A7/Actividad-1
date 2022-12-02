package Ejercicio3;
import java.util.ArrayList;
import java.util.Scanner;

import Ejercicio2.Dictionary;
import Ejercicio2.OrdererPair;

public class Contactos {
    public static <DNI, Nombre> void main(String[] args) throws ObjectNoExist {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        LibContactos contactos = new LibContactos<>(null);
        do {
            System.out.println("-----Bienvendios-----");
            System.out.println("Que desea realizar en Contactos");
            System.out.println(
                    "1.Añadir un nuevo contacto\n2.Eliminar contacto\n3.Ver Contactos Registrados\nCualquier otro valor para salir");
            int key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Ingrese DNI del Contacto");
                    DNI dni;
                    dni=(DNI) sc.nextLine();
                    System.out.println("Ingrese Nombre del Contacto");
                    Nombre nombre;
                    nombre=(Nombre) sc.nextLine();

                    OrdererPair2<DNI, Nombre> Contactos = new OrdererPair2<DNI,Nombre>(dni, nombre);
                    break;
                case 2:
                    System.out.println("Ingrese DNI del Contactoa borrar");
                    dni=(DNI) sc.nextLine();
                    contactos.delete(dni);
                    break;
                case 3:
                    ArrayList<OrdererPair> list = contactos.getLista();
                    if (list.size() <= 0) {
                        System.out.println("Lamentamos el Inconveniente pero la Agenda de contactos esta vacia");
                    } else {
                        System.out.println("Imprimiendo Lista de agenda de contactos ");
                        for (int i = 0; i < list.size(); i++)
                            System.out.println(list.get(i).getValue());
                    }
                    break;
                default:
                    salir = true;
            }
        } while (!salir);
    }
}
