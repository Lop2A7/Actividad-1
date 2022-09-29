package Actividades;

public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        PorPagar[] objetPorPagar= new PorPagar[5];

        objetPorPagar[0]=new Factura("01234", "Asiento", 2, 375.00);
        objetPorPagar[1]=new Factura("56789", "Llanta", 4, 79.95);
        objetPorPagar[2]=new EmpleadoAsalariado("Jhon", "Smith", "11-111-1111", 800.00);
        objetPorPagar[3]=new EmpleadoAsalariado("Lisa", "Barners", "888-88-8888", 1200.00);
        objetPorPagar[4]=new Prestamo(15, 16);

        System.out.println("Facturas y Empleados procesados de manera polimorfica \n");

        for(PorPagar porPagarActual:objetPorPagar){
            System.out.printf("%s \n%s: $%,.2f\n\n",
            porPagarActual.toString(),
            "Pago Vencido",porPagarActual.obtenerMontoPago());
        }
    }
}
