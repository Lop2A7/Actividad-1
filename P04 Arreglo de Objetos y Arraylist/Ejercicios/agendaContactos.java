package S4EJER;
import java.util.*;

public class agendaContactos {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        boolean salir = false;
        int opcion;
        //creamos el arreglo de objetos
        ArrayList<Contacto> agenda = new ArrayList<Contacto>();

        do{
            //menu
            System.out.println("Menu");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Modificar contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("5. Eliminar todos contactos");       
            System.out.println("6. Mostrar contacto");      
            System.out.println("7. Salir");    
            System.out.println("Elije una opcion");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("Añadiendo contacto...");
                    añadirContacto(sn, agenda);
                    System.out.println("''Contacto añadido''");
                    break;
                case 2:
                    System.out.println("Buscando contacto...");
                    buscarContacto(sn, agenda);
                    break;
                case 3:
                    System.out.println("Modificando contacto...");
                    modificarContacto(sn, agenda);
                    System.out.println("''Contacto modificado''");
                    break;
                case 4:
                    System.out.println("Borrando contacto...");
                    borrarContacto(sn,agenda);
                    System.out.println("''Se borró el contacto''");
                    break;
                case 5:
                    System.out.println("Eliminando contactos... x_x");
                    eliminarContactos(sn, agenda);
                    System.out.println("''Contactos eliminados''");
                    break;
                case 6: 
                    System.out.println("LISTA DE CONTACTOS...");
                    mostrarContacto(sn, agenda);
                    break;
                case 7:
                    salir = true;
                    break;                  
                default:
                    System.out.println("Introduce un valor entre 1 y 7");
            }

        } while(!salir);

        System.out.println("FIN DE LA APLICACIÓN");

    }

    public static void añadirContacto(Scanner sn, ArrayList<Contacto> agenda) {
        System.out.println("Nombre: ");
        String n = sn.next();
        System.out.println("Telefono: ");
        String t = sn.next();
        System.out.println("Direccion: ");
        String d = sn.next();
        Contacto p1 = new Contacto(n, t, d);
        agenda.add(p1);
    }
    public static void buscarContacto(Scanner sn, ArrayList<Contacto> agenda) {
        System.out.println("Nombre del contacto que busca: ");
        String nom = sn.next();
        for (int i = 0; i<agenda.size(); i++){
            if(agenda.get(i).getNombre().contains(nom)){
                System.out.println("DENTRO DE SUS CONTACTOS");
            }
            else
                System.out.println(nom+" NO ESTÁ EN SUS CONTACTOS");
        }
    }
    
    public static void modificarContacto(Scanner sn, ArrayList<Contacto> agenda) {
        System.out.println("Nombre del contacto a modificar: ");
        //String n = sn.next();
        boolean salir = false;
        do{
            System.out.println("¿Qué desea modificar? ");
            System.out.println("1. Telefono");
            System.out.println("2. Direccion");
            System.out.println("3. Terminar");
            int opc = sn.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Nuevo telefono: ");
                    String tel = sn.next();
                    for (int i = 0; i<agenda.size(); i++){
                        //int indice = agenda.get(i).getNombre().indexOf(n);
                        agenda.get(i).setTelefono(tel);
                    }
                    break;
                    /*for (int i = 0; i<agenda.size(); i++){
                        int indice = agenda.get(i).getNombre().indexOf(n);
                        if (i == indice){
                            agenda.get(i).setTelefono(tel);
                        }  
                        i++;
                    }*/   
                case 2:
                    System.out.println("Nueva direccion: ");
                    String dir = sn.next();
                    for (int i = 0; i<agenda.size(); i++){
                        //int indice = agenda.get(i).getNombre().indexOf(n);
                        agenda.get(i).setDireccion(dir);
                    } 
                    break;
                case 3: 
                salir = true;
                    break;                  
                default:
                    System.out.println("Introduce un valor entre 1 y 3");                     
            }
        } while(!salir);
    }

    public static void borrarContacto(Scanner sn, ArrayList<Contacto> agenda) {
        System.out.println("Nombre del contacto a borrar: ");
        String nom = sn.next();
        for (int i = 0; i<agenda.size(); i++){
            if(agenda.get(i).getNombre().contains(nom)){
                agenda.remove(i);               
            }
        }
    }

    public static void eliminarContactos(Scanner sn, ArrayList<Contacto> agenda) {
        System.out.println("Se eliminarán todos sus contactos... ");
        agenda.clear();
    }
    
    public static void mostrarContacto(Scanner sn, ArrayList<Contacto> agenda) {
        System.out.println("NOMBRE "+"  TELEFONO  "+" DIRECCION");
        for (int i = 0; i <agenda.size(); i++){
            System.out.println(agenda.get(i).getNombre()+" "+agenda.get(i).getTelefono()+" "+agenda.get(i).getDireccion());
        }
    }
}

// ***************************************************GOOOOOOOOOOOOD
    /*public static void crearObjeto(Scanner sn, ArrayList<Contacto> agenda) {
        System.out.println("Nombre: ");
        String n = sn.next();
        System.out.println("Apellido: ");
        String a = sn.next();
        System.out.println("Direccion: ");
        String d = sn.next();
        Contacto p1 = new Contacto(n, a, d);
        agenda.add(p1);
    }*/


//*************************************************************
    /* 
    //ArrayList<Contacto> agenda = new ArrayList<Contacto>();
    public static ArrayList<Contacto> añadirContactoo(){
        Scanner s1 = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = s1.next();
        System.out.println("Apellido: ");
        String telefono = s1.next();
        System.out.println("Telefono: ");
        String direccion = s1.next();
        Contacto c1 = new Contacto(nombre, telefono, direccion);
        ArrayList<Contacto> agenda = new ArrayList<Contacto>();
        agenda.add(c1);
        System.out.println(agenda.size());
        return agenda;
    }
    */

        //Contacto p1 = new Contacto(n, a, d);
        /*int indice;
        indice = agenda.indexOf(nom);
        System.out.println(nom +" es su contacto N°: "+indice);
        if(agenda.contains(nom)){
            System.out.println(nom +" está en tus contactos: ");
        }
        else
            System.out.println("No se encontró: "+nom);*/
        /*for(Contacto contac : agenda){
            //String[] listav = new String[3];
            String[] claves = Object.keys(contac);
            for(int nombr : contac){
                if(contac.getNombre()==nom){
                    System.out.println(nom +" está en tus contactos: ");
                }
                else
                    System.out.println(nom +" NO está en tus contactos: ");
            }
        }*/
            
            /*if(agenda.contains(nom)){
                System.out.println(nom +" está en tus contactos: ");
            }
            else
                System.out.println("No se encontró: "+nom);
            /if( no == agenda.get(i).getNombre()){
                System.out.println(agenda.get(i).getNombre());
            }
            else
                System.out.println("No se encontró: "+no);*/ 