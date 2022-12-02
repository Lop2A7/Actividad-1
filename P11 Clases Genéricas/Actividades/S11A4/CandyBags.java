package S11.S11A4;

import java.util.List;

public class CandyBags<T> extends Bag<T> {
    public CandyBags( T[] list, int count, int n){
        super(n);
        list = (T[]) new Object[n];
        count = 0;

    }
/* 
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
    }*/

    /*public T cheapest(){
        T respuesta;
        //for(ele : list)

        or(T ele: list)
            if(valor.equals(ele)) 
            return true;

        return respuesta;
    }*/
}
