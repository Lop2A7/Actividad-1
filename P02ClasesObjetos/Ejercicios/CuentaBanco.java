public class CuentaBanco {
    public String Titular;
    public float cantidad;

    public CuentaBanco(String Titular, float cantidad) {
        this.Titular = Titular;
        this.cantidad = cantidad;
    };

    public void getdatos(String Titular) {
        this.Titular=Titular;
    };
    public void getdatos1(float cantidad) {
        this.cantidad=cantidad;
    };

    public void setdatosin(float ingreso) {
        if(ingreso<0){
            System.out.println("ERROR: No se puede ingresar numeros negativos");
        }
        else{
            float Saldo=cantidad+ingreso;
            System.out.println("Ingreso exitoso, la cantidad que tiene a la cuenta es de:" + Saldo);
            cantidad=Saldo;
            return;
        }
    };
    public void setdatosout(float retiro) {
        if(cantidad-retiro<=0 ){
            System.out.println("Retiro con prestamo exitoso");
            System.out.println("Monto actual es de 0");
            cantidad=0;
            return;
        }
        else{
            float Saldo=cantidad-retiro;
            System.out.println("Retiro exitoso, la cantidad que le queda a la cuenta es de:" + Saldo);
            cantidad=Saldo;
            return;
        }
    };

    @Override
    public String toString(){
        return "Cuenta Banco" + " Nombre del titular: " + Titular + " Saldo actual:" + cantidad;
    }
};