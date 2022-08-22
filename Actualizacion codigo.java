import java.util.Scanner;

public class PyLab01 {
    public static void main(String[] args){
        int vida, rp;
        boolean fl=false;
        vida  = 0;
        Scanner sc = new Scanner(System.in);
        do {
            vida ++;
            System.out.println("Vida:"+ vida + "\t ¿Cual es el numero secreto?");
            rp= sc.nextInt();
            if (rp==1234)
                fl=true;
        }while(vida<3 && !fl);
        if (fl== true){
            System.out.println("Adivinaste!!!");
            if (vida==3){
                System.out.println("Tu premio es: Un viaje a cancun");
            }
            if (vida==2){
                System.out.println("Tu premio es: Una laptop");
            }
            if (vida==1){
                System.out.println("Tu premio es: Premio en efectivo");
            }
        }
        if (fl== false)
            System.out.println("Ups perdiste");
    }
}
