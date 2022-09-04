import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner Numero = new Scanner(System.in);
        Fecha f1;
        Fecha F1;
        Fecha F2;
        f1 = new Fecha();
        boolean salir=false;
        while (!salir) {
            System.out.println(" ----- Bienvenidos al sistema de ingreso de fechas -----");
            System.out.println("Que operacion desea realizar ");
            System.out.println("1. Ingresar Fecha ");
            System.out.println("2. Ver si es Año Bisiesto ");
            System.out.println("3. Cuantos Dias tiene el mes actual ");
            System.out.println("4. Ver fecha");
            System.out.println("5. Ver Dias transcurridos desde 1/1/1900");
            System.out.println("6. Desea Pasar al dia siguiente");
            System.out.println("7. Desea Pasar al dia anterior");
            System.out.println("8. Actualizar la fecha con los dias que usted indique");
            System.out.println("9. Crear Una copia a la fecha ");
            System.out.println("10. Ver si la fecha1 es igual que la fecha 2 ");
            System.out.println("11. Ver si la fecha1 es mayor que la fecha 2 ");
            System.out.println("12. Ver si la fecha1 es menor que la fecha 2 ");
            System.out.println("13. Salir ");
            int decision = Numero.nextInt();
            switch (decision) {
                case 1:
                    f1.Leer();
                    break;

                case 2:
                    f1.Bisiesto();
                    break;

                case 3:
                    System.out.println("Indique el numero del mes que se va a calcular 1.Enero ..... ");
                    int a = Numero.nextInt();
                    f1.diasMes(a);
                    break;
                case 4:
                    System.out.println("Desea ver la fecha de manera completa o corta");
                    String opc = Numero.next();
                    if (opc == "Completa" || opc == "completa") {
                        f1.larga();
                    } else
                        f1.corto();
                    break;
                case 5:
                    f1.DiasTranscurridos();
                    break;
                case 6:
                    f1.Siguiente();
                    break;
                case 7:
                    f1.Anterior();
                    break;
                case 8:
                    System.out.println("Inserte los dias que va a transcurrir");
                    int j = Numero.nextInt();
                    f1.FechaTrans(j);
                    break;
                case 9:
                    f1.clon();
                    break;
                case 10:
                    F1 = new Fecha();
                    F2 = new Fecha();
                    F1.Leer();
                    F2.Leer();
                    f1.IgualQue(F1, F2);
                    break;
                case 11:
                    F1 = new Fecha();
                    F2 = new Fecha();
                    F1.Leer();
                    F2.Leer();
                    f1.MayorQue(F1, F2);
                    break;
                case 12:
                    F1 = new Fecha();
                    F2 = new Fecha();
                    F1.Leer();
                    F2.Leer();
                    f1.MenorQue(F1, F2);
                    break;
                case 13:
                    salir=true;
                    break;
            }
            
        }
        Numero.close();
    }
}