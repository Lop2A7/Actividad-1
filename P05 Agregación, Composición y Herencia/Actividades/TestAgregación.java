package P5_AGREGACION;

public class TestAgregación {
    public static void main(String[] args){
        Automovil auto1 = new Automovil("ABCD",4,"TOYOTA","2020");
        Automovil auto2 = new Automovil("NXJ7-09", 2,"SUSUKI","2015");
        Motor motor1 = new Motor(456789,1200 );
        Motor motor2 = new Motor(123456, 1500);
        
        System.out.println("    **AUTO 1: ");
        System.out.println(auto1.toString());
        System.out.println("    **AUTO 2: ");
        System.out.println(auto2.toString());

        System.out.println("    **MOTOR 1");
        System.out.println(motor1.toString());
        System.out.println("    **MOTOR 2: ");
        System.out.println(motor2.toString());

        System.out.println("El motor del auto1 con placa: "+auto1.getPlaca()+" tendrá el motor: "+motor1.getNumMotor());
        auto1.setMotor(motor1); //asignando el motor1 al auto1
        System.out.println("    **AUTO 1");
        System.out.println(auto1.toString());
    }
}
