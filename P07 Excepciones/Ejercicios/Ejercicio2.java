package S7E;

public class Ejercicio2 {
    public static void main(String[] args){
        try{
            System.out.println(metodo("w"));
        }
        catch (Exception e){
            System.out.println("Excepcione en metodo()");
            e.printStackTrace();
        }
    }
    private static int metodo(String num){
        int valor = 0;
        try{
            valor ++;
            valor+= Integer.parseInt(num);
            valor ++;
            System.out.println("Valor final del try: "+valor);
        }
        catch(NumberFormatException e){
            valor += Integer.parseInt("42");
            System.out.println("Valor final del catch: "+valor);
            throw e;
        }
        finally{
            valor++;
            System.out.println("Valor antes del finally: "+valor);
        }
        valor++;
        System.out.println("Vaor antes del return: "+valor);
        return valor;
    }
}
