package S11.S11A1;

public class App2 {
    public static void main(String[] args) throws Exception {

        Persona p1 = new Persona("Roci");
        Persona p2 = new Persona("Mati");
        Persona p3 = new Persona("Marcos");
        Persona p4 = new Persona("chio"); //persona fuera del arreglo
        Persona[] personas = {p1, p2, p3};
        Verificadora<Persona> ver2 = new Verificadora<>(personas);

        /*String msg = ver.contiene(2) ? "SI tiene 2" : "NO tiene 2";
        System.out.println(msg);
        msg = ver.contiene(6) ? "SI tiene 6" : "NO tiene 6";
        System.out.println(msg);*/

        if (ver2.contiene(p2)) {
            System.out.println("Si tiene a la persona "+p2.getNombre());
        } else
            System.out.println("NO tiene a la persona "+p2.getNombre());
        
        if (ver2.contiene(p4)) {
            System.out.println("Si tiene a la persona "+p4.getNombre());
        } else
            System.out.println("NO tiene a la persona "+p4.getNombre());

        Goodies g1 = new Goodies(123);
        Goodies g2 = new Goodies(456);
        Goodies g3 = new Goodies(666, "COSA1", 10);
        Goodies[] arregloGoddies = {g1,g2};
        Verificadora<Goodies> ver3 = new Verificadora<>(arregloGoddies);

        if (ver3.contiene(g2)) {
            System.out.println("Si tiene el ID "+g2.getId());
        } else
            System.out.println("NO tiene a el ID "+g2.getId());
        
        if (ver3.contiene(g3)) {
            System.out.println("Si tiene el id "+g3.getId());
        } else
            System.out.println("NO tiene el id "+g3.getId());
        

        Procedencia pro1 = new Procedencia("Arequipa", "Arequipa"); 
        Procedencia pro2 = new Procedencia("Cusco", "Cusco");     
        Procedencia pro3 = new Procedencia("Juliaca");      
        Estudiante e1 = new Estudiante(p1.getNombre(), pro1);
        Estudiante e2 = new Estudiante(p2.getNombre(), pro2);
        Estudiante e3 = new Estudiante(p3.getNombre(), pro3);

        Estudiante[] arregloEstudiantes = {e1, e2};
        Verificadora<Estudiante> ver4 = new Verificadora<>(arregloEstudiantes);
        //verificar por nombre y procedencia
        if (ver4.contiene(e2)) {
            System.out.println("Si está el nombre "+e2.getNombre()+" y procedencia "+e2.getProcedencia());
        } else
            System.out.println("NO tiene el nombre "+e2.getNombre()+", ni procedencia "+e2.getProcedencia());
        
        if (ver4.contiene(e3)) {
            System.out.println("Si tiene el nombre "+e3.getNombre()+" y procedencia "+e3.getProcedencia());
        } else
            System.out.println("NO tiene el nombre "+e3.getNombre()+", ni procedencia "+e3.getProcedencia());
    }
}
