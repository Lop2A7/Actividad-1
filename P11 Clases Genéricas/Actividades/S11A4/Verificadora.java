package S11.S11A4;

public class Verificadora<T> implements Contenedora<T> {
    private T[] datos;

    public Verificadora(T[] x) {
        this.datos = x;
    }

    public boolean contiene(T valor) {
        for (T ele : datos)
            if (valor.equals(ele))
                return true;
        return false;
    }

    public void siContiene(T valor){
        if(contiene(valor))
            System.out.println("Si se encontró el valor");
        else
            System.out.println("No se encontró el valor ");
    }
}
