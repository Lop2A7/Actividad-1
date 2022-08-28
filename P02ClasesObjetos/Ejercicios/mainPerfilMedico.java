package ejercicio2p2;
import java.util.*;

public class Ejercicio2p2 {
  
    public static void main(String[] args) {
      
        Scanner s1 = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String miNombre = s1.next();
        System.out.println("Ingrese el apellido: ");
        String miApellido = s1.next();
        System.out.println("Ingrese el sexo: ");
        String miSexo = s1.next();        
        System.out.println("Ingrese el dia de nacimiento: (01-31)");
        Integer miDiaN = s1.nextInt();
        System.out.println("Ingrese el mes de nacimiento: (01-12) ");
        Integer miMesN = s1.nextInt();
        System.out.println("Ingrese el año de nacimiento: (XXXX)");
        Integer miAñoN = s1.nextInt();
        System.out.println("Ingrese la altura en cm: ");
        Integer miAltura = s1.nextInt();        
        System.out.println("Ingrese el peso en kg: ");
        Double miPeso = s1.nextDouble();
      
        PerfilMedico persona1 = new PerfilMedico();
        persona1.setNombre(miNombre);
        persona1.setApellido(miApellido);
        persona1.setSexo(miSexo);
        persona1.setDiaN(miDiaN);
        persona1.setMesN(miMesN);
        persona1.setAñoN(miAñoN);
        persona1.setAltura(miAltura);
        persona1.setPeso(miPeso);
      
        System.out.println("**PERFIL MEDICO**\n"+persona1.toString());
        System.out.println("Edad: "+persona1.edad());       
        persona1.frecuenciaCardiacaMax();
        persona1.IMC();
    }  
}
