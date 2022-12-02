package S11.S11A3;

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
            }
            return resultado;
        }
    }

    public T remove(T obj) throws ObjectNoExist{
        int i = getIndex(obj);
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
            return respuesta;
        }
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
    public String toString(){
        for(T item : list){
            return item.toString();
        }
        return("list.toString()");
    
    }
}

