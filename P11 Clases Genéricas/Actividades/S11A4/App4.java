package S11.S11A4;

public class App4 {
    public static void main(String[] args) throws Exception {

        Bag<Goodies> bag1 = new Bag<Goodies>(5);
        
        Sweet sweet1 = new Sweet(111, "Descripcion1", 10, "Vainilla",2, "blanco");
        Soda soda1 = new Soda(222, "Soda sin azucar", 5, "fresa", 3, "grande");
        Biscuits bis1 = new Biscuits(333, "Sin preservantes", 20, "coco", 6);
        Chocolates cho1 = new Chocolates(666, "70% Cacao", 30, 5);
        Goodies g1 = new Goodies(444, "Descripcion2", 9);

        //Bag<Goodies>[] bolsa1 = ;
        bag1.add(sweet1);
        bag1.add(soda1);
        bag1.add(bis1);
        bag1.add(cho1);
        //bag1.add(g1);
        bag1.getObjects();
        bag1.remove(g1);
        bag1.getObjects();
        //System.out.println(bag1.getIndex(soda1));
        //System.out.println(bag1.getIndex(sweet1));
        //System.out.println(bag1.getIxdex(soda1));
        //bag1.getIxdex(soda1);
        //bag1.getObjects();


    }
}















        /*Integer[] x = { 0, 1, 2, 3, 4 };
        Verificadora<Integer> ver = new Verificadora<Integer>(x);

        Double[] y = {1.1, 2.2,3.3 };
        Verificadora<Double> tmp = new Verificadora<>(y);*/
        
        /*Persona p1 = new Persona("Roci");
        Persona p2 = new Persona("Mati");
        Persona p3 = new Persona("Marcos");
        Persona p4 = new Persona("chio"); //persona fuera del arreglo
        Persona[] personas = {p1, p2, p3};
        Verificadora<Persona> ver2 = new Verificadora<>(personas);

        if (ver2.contiene(p2)) {
            System.out.println("Si tiene a la persona "+p2.getNombre());
        } else
            System.out.println("NO tiene a la persona "+p2.getNombre());
        
        if (ver2.contiene(p4)) {
            System.out.println("Si tiene a la persona "+p4.getNombre());
        } else
            System.out.println("NO tiene a la persona "+p4.getNombre());*/