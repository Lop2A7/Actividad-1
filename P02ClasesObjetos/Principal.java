import java.util.*;

public class Principal {
    public static void main(String[] args) {
        CuentaBanco C1 = new CuentaBanco("",0);
        System.out.println("Bienvenido al sistema, ingrese nombre del titular");
        Scanner Ingreso = new Scanner(System.in);
        String Titular = Ingreso.nextLine();
        C1.getdatos(Titular);
        System.out.println("Ingrese el monto actual que posee");
        Float cantidad = Ingreso.nextFloat();
        C1.getdatos1(cantidad);
        System.out.println("Que deseas hacer hoy " + Titular + "\n1. Ingresar dinero \n2. Retirar dinero");
        int decision = Ingreso.nextInt();
        switch (decision) {
            case 1:
                System.out.println("Ingrese el monto que desee ingresar");
                Float ingreso = Ingreso.nextFloat();
                C1.setdatosin(ingreso);
                break;
            case 2:
                System.out.println("Ingrese el monto que desee retirar");
                Float retiro = Ingreso.nextFloat();
                C1.setdatosout(retiro);
                break;
        }
        
        System.out.println("Datos actualizados" + C1.toString());
                
    }
}
