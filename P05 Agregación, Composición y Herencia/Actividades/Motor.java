package P5_AGREGACION;

public class Motor {
    private int numMotor;
    private int revPorMin;

    public Motor(int numMotor, int revPorMin){
        this.numMotor = numMotor;
        this.revPorMin = revPorMin;
    }
    //setters
    public void setNumMotor(int numMotor){
        this.numMotor = numMotor; 
    }
    public void setRevPorMin(int revPorMin){
        this.revPorMin = revPorMin; 
    }
    //getters
    public int getNumMotor(){
        return this.numMotor;
    }
    public int getRevPorMin(){
        return this.revPorMin;
    }
    @Override
    public String toString(){
        //System.out.println("**PERSONA**");
        return ("NumMoTOR: "+numMotor+"\nNumRevolucionesPorMin: "+revPorMin);
    }
}
