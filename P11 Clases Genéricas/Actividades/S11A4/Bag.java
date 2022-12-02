package S11.S11A4;
import java.util.*;

public class Bag<T> {
    private T[] list;
    private int count; // Contador de objetos que hay en la bolsa

    public Bag(int n) {
        this.list = (T[]) new Object[n];
        this.count = 0;
    }

    public void add(T obj) throws IsFull{ 
        if(count>=list.length){
            throw new IsFull("La bolsa está llena");}
        else{
            list[count] = obj;
            count = count + 1;
        }
    }
    public T[] getObjects() throws IsEmpty { 
        if(count==0){
            throw new IsEmpty("La bolsa está vacía");
        }
        else{
            T[] resultado = (T[]) new Object[count];
            for(int i = 0; i < count; i++){
                resultado[i] = list[i];
                System.out.println(list[i]);
            }
            return resultado;
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
        throw new ObjectNoExist("El objeto no existe");
        /*for (T ele : list)
            if (obj.equals(ele)){
                ele = null;
                count--;
            }
            else
                throw new ObjectNoExist("El objeto no existe");*/

        /*    
        for(int i = 0; i < list.length; i++){
            if(obj.equals(list[i])){
                list[i] = null;
                count--;
                //T respuesta = list[i];
                //return respuesta;
            }
            else
                throw new ObjectNoExist("El objeto no existe");
        }*/

        /*for(int i = 0; i < count; i++){
            if(list[i] == obj){
                list[i] = null;
                count--;
                T respuesta = list[i];
                return respuesta;
            }
            else
                throw new ObjectNoExist("El objeto no existe");
        }*/
        //return obj;

        /*int i = getIxdex(obj);
        if(list[i] == null){
            throw new ObjectNoExist("El objeto no existe");
        }
        else{
            list[i] = null;
            count--;
            T respuesta = list[count];
            /*T[] resultado = (T[]) new Object[count];
            for(int j = 0; j < count; j++){
                resultado[j] = list[i];
            }
            return resultado;
            */
            //return respuesta;}
    }
    public int getIndex(T obj){
        int cont = 0;
        for (T i : list){
            if (i.equals(obj)){
                return cont;
            }
            cont++;
        }
        return -1;
    }

    /*public int getIxdex(T obj) {
        //T[] resultado = (T[]) new Object[count];
        for(int i = 0; i < list.length; i++){
            if(list[i] == obj){
                int h = getIxdex(list[i]);
                return h;
            }
            else
                return -1;
        }
        int j = getIxdex(obj);
        return j;
    }*/

    public String toString() {
        return ("{" + Arrays.toString(list) + "}");
    }
    /*public String toString(){
        for(T item : list){
            return item.toString();
        }
        return("list.toString()");
    
    }*/

}

