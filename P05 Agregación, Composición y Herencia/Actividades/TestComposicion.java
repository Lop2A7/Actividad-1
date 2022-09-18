package P5;
import java.util.*;

public class TestComposicion {
    public static void main(String[] args){
        Persona p1 = new Persona(7777,"Rocio", "Sandoval");
        Cuenta c1 = new Cuenta(123,500);
        p1.setCuenta(c1);
        System.out.println("PERSONA 1: ");
        //System.out.println(p1.toString());
        System.out.println("Nombre: ");
        System.out.println(p1.getNombre());
        System.out.println("Numero de cuenta: ");
        System.out.println(p1.getCuenta());
        System.out.println("Saldo de la cuenta: ");
        System.out.println(c1.getSaldo());
        System.out.println("Cambiar el saldo de la cuenta, ingrese saldo: ");
        Scanner sn = new Scanner(System.in);
        double nuevoSaldo = sn.nextDouble();
        sn.close();
        c1.setSaldo(nuevoSaldo);
        System.out.println("Nuevo saldo de la cuenta: ");
        System.out.println(c1.getSaldo());
    }
}
