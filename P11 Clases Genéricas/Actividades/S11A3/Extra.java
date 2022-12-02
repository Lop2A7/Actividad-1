/*package S11.S11A3;

public class Extra {
    
}
package actividad3;
import java.util.*;

public class Bag <T> {
    private T [] list;
    private int count; //Contador de objetos que hay en la bolsa
    public Bag(int n){
        this.list = (T[])new Object[n];
        this.count = 0;
    }
    public void add(T obj) throws IsFull{ 
        if (this.count < list.length){
            list[count] = obj;
            count ++;
        }else {
            throw new IsFull();
        }
    }
    public T[] getObjects() throws IsEmpty {
        if (this.count>0){
            return list;
        }else{
            throw new IsEmpty();
        }
    }
    public T remove(T obj) throws ObjectNoExist{
        int cont =0;
        for (T i : this.list ){
            if( i!= null && i.equals(obj)){
                T devolver = list[cont];
                for (int j = cont; j< list.length-1;j++){
                    list[j]=list[j+1];
                }
                list[list.length-1] = null;
                count--;
                return devolver;
            }
            cont++;
        }
        throw new ObjectNoExist();
    }
    public int getIndex(T obj){
        int cont = 0;
        for (T i : this.list){
            if (i.equals(obj)){
                return cont;
            }
            cont++;
        }
        return -1;
    }
    
    public String toString() {
        return "{" + Arrays.toString(list) + "}";
    }
}
package actividad3;

public class IsEmpty extends Exception{
    public IsEmpty(){
        super("La bolsa se encuentra vacía");
    }
}
public class IsFull extends Exception{
    public IsFull(){
        super("La bolsa esta llena");
    }
}
public class ObjectNoExist extends Exception{
    public ObjectNoExist(){
        super("El objeto no existe");
    }
}


public class Actividad3 {

    public static void main(String[] args) throws Exception {
        //========================================
        System.out.println("====================================");
        Bag<Integer> bolsaInteger = new Bag<>(3);
        bolsaInteger.add(1);
        bolsaInteger.add(2);
        System.out.println(bolsaInteger);
        bolsaInteger.add(3);
        bolsaInteger.remove(1);
        System.out.println(bolsaInteger);
        System.out.println(bolsaInteger.getIndex(3));
        System.out.println(bolsaInteger.getIndex(2));
        //========================================
        System.out.println("====================================");
        Bag<String> bolsaString = new Bag<>(3);
        bolsaString.add("Perro");
        bolsaString.add("Gato");
        System.out.println(bolsaString);
        bolsaString.add("Guacamayo");
        bolsaString.remove("Perro");
        System.out.println(bolsaString);
        System.out.println(bolsaString.getIndex("Guacamayo"));
        System.out.println(bolsaString.getIndex("Gato"));
        //========================================
        System.out.println("====================================");
        Bag<Persona> bolsaPersona = new Bag<>(3);
        bolsaPersona.add(new Persona("Fernando","Antiquilla","932111416"));
        bolsaPersona.add(new Persona("Andre","Antiquilla","999111999"));
        System.out.println(bolsaPersona);
        bolsaPersona.remove(new Persona("Fernando","Antiquilla","932111416"));
        bolsaPersona.add(new Persona("Jesus","Nose","TampocoSe"));
        System.out.println(bolsaPersona);
        System.out.println(bolsaPersona.getIndex(new Persona("Andre","Antiquilla","999111999")));
        System.out.println(bolsaPersona.getIndex(new Persona("Jesus","Nose","TampocoSe")));
        System.out.println("====================================");
    }
    
}
*/