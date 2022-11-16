package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
        public static void main(String[] args) throws Exception {
            Scanner sc=new Scanner(System.in);
            System.out.println("Cuantos valores tendra el array String");
            int valores=sc.nextInt();
            String[] stringArray = new String[valores];
            for(int i=0;i<stringArray.length;i++){
                System.out.println("Inserte valores para la posición [" + i + "] :" );
                String dato = sc.next();
                stringArray[i]=dato;
            }
            System.out.println("Imprimiendo valores insertados"); 
            imprimirArray(stringArray);
            sc.close();
        }
    
        public static String imprimirArray(String[] inputArray) {
            int delimitador=0;
            for(int i=0;i<inputArray.length;i++){
                delimitador+=1;
                if(delimitador==4){
                    delimitador=0;
                    System.out.printf(inputArray[i] +"%n");
                }else
                System.out.printf("%s\t", inputArray[i]);
            }
            // for (String elemento : inputArray)
            //     if(elemento==inputArray[4]){
            //         System.out.printf("%n" + elemento +" ");
            //     }else
            //     System.out.printf("%s ", elemento);
            return null;
        }
    }