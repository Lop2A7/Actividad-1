package s3actividades;

public class S3Actividades {

    public static void main(String[] args) {
        Bicycle a, b;
        a = new Bicycle("Adam Smith",1);
        b = new Bicycle("Ben Jones",5);
        a.distanceTraveled(240);                //metodo de instancia 
        System.out.println(b.getOwnerName());   //metodo de instancia
        b.distanceTraveled(1100);               //metodo de instancia
        Bicycle mostOld = Bicycle.mostUsed(a, b);   //metodo de clase
        System.out.println(mostOld);   
    }
}
