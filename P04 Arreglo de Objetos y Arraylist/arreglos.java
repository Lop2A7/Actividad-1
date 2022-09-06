package S4;
import java.util.*;
public class arreglos {

    public static void main(String[] args) {
        //TODO code application logic here
        Scanner sn = new Scanner(System.in);
        // Matriz cuadrada de 4x4
        int matriz[][] = new int[4][4];
        // Variables utilizadas
        boolean salir = false;
        int opcion, fila, columna;
        // Utilizado para indicar si hemos entrado en la 1ª opcion
        boolean rellenado = false;
        // Menu
        do {
            // Mensajes del menu
            System.out.println("Menu");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Suma de una columna");
            System.out.println("4. Suma diagonal PRINCIPAL");
            System.out.println("5. Suma diagonal INVERSA");       
            System.out.println("6. Media de todos los valores");      
            System.out.println("7. Salir");    
            System.out.println("Elije una opcion");
            opcion = sn.nextInt();
            switch (opcion) {
                case 1:
                    rellenarMatriz(sn, matriz);
                    // Ahora si podemos acceder al resto de opciones
                    rellenado = true;
                    break;
                case 2:
                    if (rellenado) {
                        // Validamos la fila
                        do {
                            System.out.println("Elige una fila");
                            fila = sn.nextInt();
                            fila = fila -1;
                        } while (!(fila >= 0 && fila < matriz.length));
                        System.out.println("La suma de los valores de la fila " + fila
                                + " es: " + sumaFila(matriz, fila));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                    break;
                case 3:
                    if (rellenado) {
                        // Validamos la columna
                        do {
                            System.out.println("Elige una columna");
                            columna = sn.nextInt();
                            columna = columna - 1;
                        } while (!(columna >= 0 && columna < matriz.length));
                        System.out.println("La suma de los valores de la columna " + columna
                                + " es: " + sumaColumna(matriz, columna));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    } 
                case 4:
                    if (rellenado) {
                        System.out.println("La suma de los valores de la diagonal principal es: " + sumaDiagonalP(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    }
                case 5:
                    if (rellenado) {
                        System.out.println("La suma de los valores de la diagonal inversa es: " + sumaDiagonalI(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    } 
                case 6:
                    if (rellenado) {
                        System.out.println("La media de todos los valores: " + media(matriz));
                        System.out.println("La media de todos los valoress: " + media2(matriz));
                    } else {
                        System.out.println("Debes rellenar la matriz primero");
                    } 
                case 7: 
                    salir = true;
                    break;                  
                default:
                    System.out.println("Tienes que meter un valor entre 1 y 7");
            }
        } while (!salir);
        System.out.println("FIN");
    }

    /**
     * Rellena la matriz con valores insertados por el usuario
     *
     * @param sn
     * @param matriz
     */
    public static void rellenarMatriz(Scanner sn, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Escribe un numero en la posicion " + i + " " + j);
                matriz[i][j] = sn.nextInt();
            }
        }
    }

    /**
     * Suma los valores de una determinada fila
     *
     * @param matriz
     * @param fila
     * @return
     */
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }
    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    } 
    //SUMA DIAGONAL PRINCIPAL
    public static int sumaDiagonalP(int[][] matriz) {
        int suma = 0;
        int j = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][j];
            j++;
        }
        return suma;
    }
    //SUMA DIAGONAL INVERSA   
    public static int sumaDiagonalI(int[][] matriz) {
        int suma = 0;
        int j = 3;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][j];
            j--;
        }
        return suma;
    } 
    //primera forma de hallar la media
    public static int media(int[][] matriz) {
        int suma = 0;
        int media = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][0];
            suma += matriz[i][1];
            suma += matriz[i][2];
            suma += matriz[i][3]; 
        }
        media = suma/((matriz.length)*(matriz.length));
        return media;
    } 
    //segunda forma de hallar la media
    public static int media2(int[][] matriz) {
        int suma = 0;
        int media = 0;
        //int j = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <matriz.length; j++)
                suma += matriz[i][j];
        }
        media = suma/((matriz.length)*(matriz.length));
        return media;
    } 
}
