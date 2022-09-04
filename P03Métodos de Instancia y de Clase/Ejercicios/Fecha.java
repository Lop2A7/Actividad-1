import java.util.Scanner;

public class Fecha {
    private int dia, mes, año;

    public Fecha() {
        dia = 1;
        mes = 1;
        año = 1900;
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getvalordia() {
        return dia;
    }

    public void setvalordia(int dia) {
        this.dia = dia;
    }

    public int getvalormes() {
        return mes;
    }

    public void setvalormes(int mes) {
        this.mes = mes;
    }

    public int getvaloraño() {
        return año;
    }

    public void setvaloraño(int año) {
        this.año = año;
    }

    public int Leer() {
        Scanner fecha = new Scanner(System.in);
        System.out.println("Ingrese el dia:");
        dia = fecha.nextInt();
        System.out.println("Ingrese el mes:");
        mes = fecha.nextInt();
        System.out.println("Ingrese el año:");
        año = fecha.nextInt();
        fecha.close();
        validar();
        return 0;
    }

    public String Bisiesto() {
        if (mes == 2) {
            if (dia == 29) {
                System.out.println("Este es un Año bisiesto");
            }
        } else {
            System.out.println("Este no es un Año bisiesto");
        }
        return null;
    }

    public int diasMes(int a) {
        if (a % 2 == 0) {
            if (a == 2) {
                return 28;
            } else {
                return 30;
            }
        } else {
            return 31;
        }
    }

    public void validar() {
            if (this.año >= 2051 || this.año <= 1899)
                setvaloraño(1900);
            if (this.mes >= 13 || this.mes <= 0)
                setvalormes(1);
            if (this.dia >= 32 || this.dia <= 0)
                setvalordia(1);
            else
                if (this.dia > diasMes(this.mes))
                    setvalordia(1);
    }
            

    public int corto() {
        System.out.println(dia + "/" + mes + "/" + año);
        return 0;
    }

    public int DiasTranscurridos() {
        Fecha count = new Fecha();
        int countDays = 0;
        while (count.dia != this.dia || count.mes != count.mes || count.año != this.año) {
            count.FechaTrans(1);
            countDays++;
        }
        return countDays;
    }

    public int DiasSemana() {
        int transDays = (this.DiasTranscurridos() % 7);
        switch (transDays) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
        }

        return 0;
    }

    public String larga() {
        int nDay = this.DiasSemana();
        String sDay = " ";
        String sMonth = " ";
        switch (nDay) {
            case 0:
                sDay = "Domingo";
            case 1:
                sDay = "Lunes";
            case 2:
                sDay = "Martes";
            case 3:
                sDay = "Miercoles";
            case 4:
                sDay = "Jueves";
            case 5:
                sDay = "Viernes";
            case 6:
                sDay = "Sabado";
        }
        switch (this.mes) {
            case 1:
                sMonth = "Enero";
            case 2:
                sMonth = "Febrero";
            case 3:
                sMonth = "Marzo";
            case 4:
                sMonth = "Abril";
            case 5:
                sMonth = "Mayo";
            case 6:
                sMonth = "Junio";
            case 7:
                sMonth = "Julio";
            case 8:
                sMonth = "Agosto";
            case 9:
                sMonth = "Septiembre";
            case 10:
                sMonth = "Octubre";
            case 11:
                sMonth = "Noviembre";
            case 12:
                sMonth = "Diciembre";
        }
        return (sDay + " " + this.dia + " de " + sMonth + " de " + this.año);
    }

    public void FechaTrans(int j) {
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
        for (int i = 0; i < j; i++) {
            this.Siguiente();
        }
    }

    public int DiasEntre(Fecha f1) {
        return (this.DiasTranscurridos() - f1.DiasTranscurridos());
    }

    public void Siguiente() {
        if (this.dia == this.diasMes(this.mes)) {
            if (this.mes == 12) {
                this.mes = 1;
                this.dia = 1;
                this.setvaloraño(++año);
            } else {
                this.dia = 1;
                this.setvalormes(++mes);
            }
        } else
            this.setvalordia(++dia);
    }

    public void Anterior() {
        if (this.dia == 1) {
            if (this.mes == 1) {
                this.mes = 12;
                this.dia = 31;
                this.año -= 1;
            } else {
                this.mes -= 1;
                this.dia = this.diasMes(this.mes);
            }
        }
        this.dia -= 1;
    }

    public void FechaFutuea(int Long) {
        for (int i = 0; i < Long; i++) {
            this.Siguiente();
        }
    }

    public Fecha clon() {
        return this;
    }

    public boolean IgualQue(Fecha F1, Fecha F2) {
        if (F1.dia == F2.dia && F1.mes == F2.mes && F1.año == F2.año)
            return true;
        return false;
    }

    public boolean MenorQue(Fecha F1, Fecha F2) {
        if (F1.año < F2.año) {
            if (F1.mes < F2.mes)
                if (F1.dia < F2.dia)
                    return true;
        }
        return false;
    }

    public boolean MayorQue(Fecha F1, Fecha F2) {
        if (F1.año > F2.año) {
            if (F1.mes > F2.mes)
                if (F1.dia > F2.dia)
                    return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Fecha actual" + this.dia + "/" + this.mes + "/" + this.año;
    }
}
