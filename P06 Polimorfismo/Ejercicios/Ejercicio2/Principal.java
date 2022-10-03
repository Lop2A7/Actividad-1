import java.util.*;

public class Principal {
    public static void main(String[] args) {

        ArrayList<ImpactoEcologico> Datos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos elementos desea ingresar");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("1.Auto\n2.Edificio;\n3.Bicicleta");
            int caso = sc.nextInt();
            switch (caso) {
                case 1:
                    System.out.println("Ingrese Valor para:");
                    System.out.println("Gasolina Ingresada:");
                    double Gas = sc.nextFloat();
                    System.out.println("Kilometros Recorridos:");
                    double KM = sc.nextFloat();
                    Datos.add(new Dato_Actividad_Auto(Gas, KM));
                    break;
                case 2:
                    System.out.println("Ingrese Valor para:");
                    System.out.println("Tiempo de Uso de Foco:");
                    double TUF = sc.nextFloat();
                    System.out.println("Intensidad del foco (Watts):");
                    double Inten = sc.nextFloat();
                    Datos.add(new Dato_Actividad_Edificio(TUF, Inten));
                    break;
                case 3:
                    System.out.println("Ingrese Valor para:");
                    System.out.println("Timpo de Fabricacion:");
                    double TF = sc.nextFloat();
                    System.out.println("Cantidad de Co2 Producido:");
                    double Co2 = sc.nextFloat();
                    Datos.add(new Datos_Actividad_Bicicleta(TF, Co2));
                    break;
            }
        }
        sc.close();

        System.out.println("Gases de efectos invernaderos(gei)");
        System.out.println("Procesados en forma polimorfica por autos edificios y bicicletas:\n");

        for (ImpactoEcologico pivote : Datos) {
            System.out.println(pivote.toString());
            System.out.println("Y su impacto ecologico en GEI es de: " + pivote.impactoEcologico());
        }
    }
}
