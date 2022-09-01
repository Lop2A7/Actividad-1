package s3actividades;
public class Bicycle {
    static int count;           //variable de clase
    private String ownerName;   //variable de instancia
    private float distance;     //variable de instancia
    private String idBicy;      //variable de instancia
    
    public Bicycle(String ownerName, int distance){ //metodo de instancia
        this.ownerName = ownerName;     //var de instancia
        this.distance = distance;       //var de instancia
        counter();
        String tempId = String.valueOf(10000*count);
        this.idBicy = ownerName.substring(0,2)+tempId.substring(1);
    }
    public String getOwnerName(){               //metodo de instancia
        return this.ownerName;}
    public float getDistance(){                 //metodo de instancia
        return this.distance;}
    public void distanceTraveled(int meters){   //metodo de instancia
        this.distance += meters;}
    public static void counter(){               //método de clase
        count++;}
    public static Bicycle mostUsed(Bicycle x, Bicycle y){ //metodo de clase
        if (x.distance > y.distance)
            return x;
        return y;
    }
    @Override
    public String toString(){               //metodo de instancia
        String s = String.format("Bicycle: %s\nOwner : %s\tDistance in meters : %10.2f\n",this.idBicy,this.ownerName,this.distance);
        return s;
    }
}

