package Ejercicios.Ejercicio3;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws ExcepcionB, ExcepcionN, ExcepcionS, ExcepcionV {
        Proceder();
    }
    public static void Proceder() throws ExcepcionB, ExcepcionN, ExcepcionS, ExcepcionV {
        String Salir = "yes";
		while(Salir == "yes") {
		try {
			System.out.println("Por favor ingrese un char: ");
			LeerEntrada sc = new LeerEntrada(System.in);
			
			char ingreso = sc.getChar();
			if(ingreso == 'a' || ingreso == 'e' || ingreso == 'i' || ingreso == 'o'|| ingreso == 'u' ||
                ingreso == 'A' || ingreso == 'E' || ingreso == 'I' || ingreso == 'O'|| ingreso == 'U') {
				throw new ExcepcionV("Se encontro una excepcion que es tipo vocal");
			}
			else if(ingreso == ' ') {
				throw new ExcepcionB("Se encontro una excepcion para tipo espacio en blanco");
			}
			else if(ingreso == 's' || ingreso== 'S') {
				throw new ExcepcionS("Se encontro una excepcion tipo salida\n------Saliendo del sistema------");
			}
			else if(ingreso == '1' || ingreso == '2' || ingreso == '3' || ingreso == '4' ||
					ingreso == '5' || ingreso == '6' || ingreso == '7' || ingreso == '8' ||
					ingreso == '9' || ingreso == '0'){
						throw new ExcepcionN("Se encontro una excepcion que es de tipo entero");
					}
		}
		catch(ExcepcionN a) {
			System.out.println(a.getMessage());
		}
		catch(ExcepcionS b) {
			System.out.println(b.getMessage());
			Salir = "no";
		}
		catch(ExcepcionB c) {
			System.out.println(c.getMessage());
		}
		catch(ExcepcionV d) {
			System.out.println(d.getMessage());
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		}
    }
}
