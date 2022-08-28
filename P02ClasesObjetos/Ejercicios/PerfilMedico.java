package ejercicio2p2;
public class PerfilMedico {
    
    private String nombre;
    private String apellido;
    private String sexo;
    private int diaN;
    private int mesN;
    private int añoN;
    private int altura;
    private double peso;

    public PerfilMedico() {
        this.nombre = " ";
        this.apellido = " ";
        this.sexo = " ";
        this.diaN = 0;
        this.mesN = 0;
        this.añoN = 0;
        this.altura = 0;
        this.peso = 0.0;
    }
    public PerfilMedico(String nombre, String apellido, String sexo, int diaN, int mesN, int añoN, int altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaN = diaN;
        this.mesN = mesN;
        this.añoN = añoN;
        this.altura = altura;
        this.peso = peso;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }
    public void setDiaN(int diaN){
        this.diaN = diaN;
    }
    public int getDiaN(){
        return diaN;
    }
    public void setMesN(int mesN){
        this.mesN = mesN;
    }
    public int getMesN(){
        return mesN;
    }
    public void setAñoN(int añoN){
        this.añoN = añoN;
    }
    public int getAñoN(){
        return añoN;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getAltura(){
        return altura;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    public void fechaNacimiento(){
        String FN;
        FN = diaN+"/"+mesN+"/"+añoN;
        System.out.println(FN);
    }
    @Override
    public String toString() {
        return ("Nombre: "+nombre+"\nApellido: "+apellido+"\nFechaN: "+diaN+"/"+mesN+"/"+añoN+"\nAltura: "+altura+"\nPeso: "+peso);
    }
    public int edad(){
        int añoActual = 2022;
        int edad;
        edad = añoActual - añoN;
        //System.out.println("Tiene "+edad+" años");
        return edad;
    }
    public void frecuenciaCardiacaMax(){
        double FCM;
        FCM = 208- 0.7* edad();
        System.out.println("Frecuencia Cardiada Maxima: "+FCM);
    }
    public void IMC(){
        double imc;
        imc = peso/altura;
        System.out.println("IMC: "+imc);
    }    
}
