package generico;

public class Par < F,S> {
    F primero;
    S segundo;
    
    public Par(F prim, s seg) {
        this.primero= prim;
        this .segundo= seg;
    
}

public void  setPrimero (f primero)  {
    this.primero = primero;

}

public void setSegundos (S segundo)  {
    this.segundo= segundo;

}

public f getprimero() {
    return primero;
}

public S  getSengundo()  {
    return segundo;

}






package generico;

public class par1m {

    public static void main(string[]args) {
        par<Integer, Interger> p1 = new par<Integer, Interger>(2,10);

        if (p1.primero.equals(p1.segundo)){
            system.out.println("El numero "+pl.primero +"es igual a "+pl.segundo);
        }else{
            Systeam.out.println("El numero "+pl.primero+" no es igual a"+pl.segundo);
                
        }
    }
}
