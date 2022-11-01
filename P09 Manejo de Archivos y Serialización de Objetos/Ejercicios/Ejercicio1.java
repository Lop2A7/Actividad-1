package S9E1;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
//import java.io.PrintWriter;

import java.awt.*;
import java.awt.event.*;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import javax.swing.event.*;
//import java.awt.event.ItemListener;
//import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
/*import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;*/

public class Ejercicio1 extends JFrame {
    //private JLabel datosEmpladoE;
    private JLabel numeroE;
    private JLabel nombreE;
    private JLabel sueldoE;

    String numero;
    String nombre;
    String sueldo;
    

    private final JTextField campoTexto1; //campo de texto nombre
    private final JTextField campoTexto2; //campo de texto dni
    private final JTextField campoTexto3; //campo de texto fecha

    private final JTextField campoTexto7;
    //private final JTextField campoTexto6;

    private JCheckBox audifonos;
    private JCheckBox mantas;
    private JCheckBox revistas;

    private JButton botonReiniciar;
    private JButton botonMostrar;
    private JButton botonAgregar;

    //private JRadioButton primerPiso;
    //private JRadioButton segundoPiso;
    private ButtonGroup grupoOpcionesPiso;



    public Ejercicio1() {
        super("Empleados");
        setLayout(new FlowLayout());
        
        numeroE = new JLabel("Número:");
        numeroE.setToolTipText("Numero de celular");
        numeroE.setBounds(10, 10, 200, 10);
        add(numeroE);

        campoTexto1 = new JTextField(40);
        add(campoTexto1); 

        nombreE = new JLabel("Nombres:");
        nombreE.setToolTipText("Nombres y apellidos");
        nombreE.setSize(100,10);
        add(nombreE);

        campoTexto2 = new JTextField(39);
        add(campoTexto2); 

        sueldoE = new JLabel("Sueldo:");
        sueldoE.setSize(100,10);
        sueldoE.setToolTipText("Sueldo en soles");
        add(sueldoE);

        campoTexto3 = new JTextField(38);
        add(campoTexto3); 

        campoTexto7 = new JTextField(40);
        campoTexto7.setEditable(false);
        add(campoTexto7);


        botonAgregar = new JButton("Agregar Empleado");
        add(botonAgregar);
        //manjador para los botones
        ManejadorBotones manejadorb = new ManejadorBotones();
        botonAgregar.addActionListener(manejadorb);

        reporteEmpleados();

    }

    private class ManejadorBotones implements ActionListener{ //metodo agregarEmpleado()******
        @Override
        public void actionPerformed(ActionEvent eventoo){
            if(eventoo.getSource() == botonAgregar){
                AgregarEmpleado();
                campoTexto1.setText("");
                campoTexto2.setText("");
                campoTexto3.setText("");
                //reporteEmpleados();
            }
        }
    }
    public void AgregarEmpleado(){
        File archivo;
        FileWriter escribir; //variable para escribir en el arvchivo
        PrintWriter linea;

        archivo = new File("D:/UCSM/S4/LP3 - 06/CO/S9E1/empleados.txt");//preparando al archivo
        if(!archivo.exists()){
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                //Ahora se excribe en el archivo
                numero = campoTexto1.getText();
                nombre = campoTexto2.getText();
                sueldo = campoTexto3.getText();
                linea.println(numero);
                linea.println(nombre);
                linea.println(sueldo);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            try {
                escribir = new FileWriter(archivo,true);
                linea = new PrintWriter(escribir);
                //Ahora se excribe en el archivo
                numero = campoTexto1.getText();
                nombre = campoTexto2.getText();
                sueldo = campoTexto3.getText();
                linea.println(numero);
                linea.println(nombre);
                linea.println(sueldo);
                linea.close();
                escribir.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
    public void reporteEmpleados(){
        try{
            FileReader fr = new FileReader("D:/UCSM/S4/LP3 - 06/CO/S9E1/empleados.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena3; 
            String[] tempo;
            tempo = new String[3]; 
            cadena3 = br.readLine();

            /*for(int i = 0; i<3; i++){

            }*/
            while(cadena3 !=null){
                for(int i = 0; i<cadena3.length();i=i+3){
                    tempo[i]=cadena3;
                    cadena3 = tempo[i];
                }
                System.out.println("*"+cadena3);
            }

        }catch(Exception e){

        }

        String[] cabezera = {"Numero","Nombre","Sueldo"};
        //String[][]datos;

        String[][]datos = {
            {"123","Rocio","100.5"},
            {"456","Mati","200.8"}
        };
        DefaultTableModel mod = new DefaultTableModel(datos, cabezera);

        JTable tabla = new JTable(mod);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(40, 40, 150, 200);
        add(scroll);
    }

} 