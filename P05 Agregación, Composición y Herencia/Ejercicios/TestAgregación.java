package P5_AGREGACION;

public class TestAgregación {
    public static void main(String[] args){
        //Automovil 1 sin motor
        Automovil auto1 = new Automovil("AU3988",3,"TOYOTA","Corolla");
        //Automovil 2 con motor
        Automovil auto2 = new Automovil("NXJ7-09", 2,"SUSUKI","2015");
        //Motor 2 del automovil 2
        Motor motor2 = new Motor(123456, 1000);
        
        System.out.println("Automovil SIN MOTOR: ****");
        System.out.println(auto1.toString());

        //System.out.println("El motor del auto2 con placa: "+auto2.getPlaca()+" tendrá el motor: "+motor2.getNumMotor());
        System.out.println("Automovil 2 CON MOTOR: ***");
        auto2.setMotor(motor2); //asignando el motor1 al auto1
        System.out.println(auto2.toString());
    }
}
