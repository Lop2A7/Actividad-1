package P5;

public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
    private String tipoCliente;
    private String numCuenta;

    public Persona(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = "C";
        this.numCuenta = "C1001";
        this.cuenta = new Cuenta(numCuenta);
    }
    public Persona(int id, String nombre, String apellido, double saldo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = "C";
        this.numCuenta = "C1001";
        this.cuenta = new Cuenta(numCuenta, saldo);
    }
    public Persona(int id, String nombre, String apellido, String tipoCliente, double saldo){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoCliente = tipoCliente;
        if(tipoCliente == "E"){
            numCuenta ="E8000";
        }
        else{
            if(tipoCliente == "B"){
                numCuenta ="B5000";
            }
            else{
                numCuenta = "C1000";
            }
        }
        this.cuenta = new Cuenta(numCuenta, saldo);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public Cuenta getCuenta(){
        return cuenta;
    }
    public void setCuenta(Cuenta cuenta){
        this.cuenta = cuenta;
    }
    public String getTipoCliente(){
        return tipoCliente;
    }
    public void setTipoCliente(String tipoCliente){
        this.tipoCliente = tipoCliente;
    }
    public void retirar(double cantidad){
        System.out.println("RECUERDE, DEBE TENER COMO MÍNIMO 50 SOLES");
        if(cuenta.getSaldo()<50){
            System.out.println("No se pudo retirar, debe tener mínimo 50 soles");
        }
        else{
            double nsaldo = cuenta.getSaldo() + cantidad;
            cuenta.setSaldo(nsaldo);
        }
    }
    public void depositar(double cantidad){
        double nsaldo = cuenta.getSaldo() + cantidad;
        cuenta.setSaldo(nsaldo);
        System.out.println("Se depositó, con exito");
    }
    @Override
    public String toString(){
        return ("Cliente ID: "+id+"\nTipo: "+tipoCliente+"\nNombres : "+nombre+" "+apellido+"\nNro. Cuenta: "+cuenta.getNumero()+"\nSaldo: "+cuenta.getSaldo());
    }
}


    /*public String asignarTipoCliente(){
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese el tipo de Persona:");
        System.out.println("1. C->Cliente");
        System.out.println("2. B->Banca Exclusiva");
        System.out.println("3. E->Empresarial");
        String tipoCliente = sn.next();
        sn.close();
        /* 
        switch (opcion) {
            case 1:
                tipoCliente = "C";
                break;
            case 2:
                tipoCliente = "B";
                break;
            case 7: 
                tipoCliente = "E";
                break;                  
            default:
                tipoCliente = "C";
                break;
        }
        return tipoCliente;
    }
    public String definirNumCuenta(){
        if(tipoCliente == "C"){
            cuenta.setNumero("C1000");
        }
        if(tipoCliente == "B"){
            cuenta.setNumero("B5000");
        }
        if(tipoCliente=="E"){
            cuenta.setNumero("E8000");
        }
        //numCuenta = tipoCliente+numCuenta;
        return cuenta.getNumero();
    }
    */
