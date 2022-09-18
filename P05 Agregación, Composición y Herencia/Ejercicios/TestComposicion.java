package P5;
public class TestComposicion {
    public static void main(String[] args){
        //Persona solo con nombre y apellido
        Persona p1 = new Persona(7274,"Rocio", "Sandoval");
        //Persona de cuenta empresarial
        Cuenta c2 = new Cuenta("0000",2500);
        Persona p2 = new Persona(1234,"Patty", "Flores","E",c2.getSaldo());
        //Persona solo con nombre, apellidos y saldo
        Cuenta c3 = new Cuenta("0000",2500);
        Persona p3 = new Persona(2734, "Oscar","Gutierrez", c3.getSaldo());

        System.out.println("PERSONA 1: ");
        System.out.println(p1.toString());
        System.out.println(" *********  ");
        System.out.println("PERSONA 2: ");
        System.out.println(p2.toString());
        System.out.println(" *********  ");
        System.out.println("PERSONA 3: ");
        System.out.println(p3.toString());
    }
}
