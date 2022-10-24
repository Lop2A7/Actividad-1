package S8EJERCICIO2;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class Ejercicio2 extends JFrame {
    private JLabel nombre;
    private JLabel dni;
    private JLabel fecha;
    private JLabel serviciop;
    private JLabel piso;
    private JLabel origen;
    private JLabel destino;
    private JLabel calidad;

    private final JTextField campoTexto1; //campo de texto nombre
    private final JTextField campoTexto2; //campo de texto dni
    private final JTextField campoTexto3; //campo de texto fecha
    private final JTextField campoTexto4;
    private final JTextField campoTexto5;
    private final JTextField campoTexto6;
    private final JTextField campoTexto7;
    //private final JTextField campoTexto6;

    private JCheckBox audifonos;
    private JCheckBox mantas;
    private JCheckBox revistas;

    private JButton botonReiniciar;
    private JButton botonMostrar;

    private JRadioButton primerPiso;
    private JRadioButton segundoPiso;
    private ButtonGroup grupoOpcionesPiso;

    private final JComboBox<String> ciudadOrigenJComboBox;
    private final String ciudadesOrigen[] = {"Ciudades","Arequipa", "Lima","Cusco","Puno"};
    private final JComboBox<String> ciudadDestinoJComboBox;
    private final String ciudadesDestino[] = {"Ciudades","Lima","Cusco","Puno","Arequipa",};

    private final JList<String> listaCalidad;
    private final String[] calidadesDeServicio = {"Economico","Estándar","VIP"};


    //VARIABLES ADICIONBALES
    String itemOpcional = " ";
    String numPiso = " ";
    String ciudadOrigen = " ";
    String ciudadDestino = " ";
    String calidadServicio = " ";

    public Ejercicio2() {
        super("COMPRA DE PASAJES TERRESTRES");
        setLayout(new FlowLayout());

        nombre = new JLabel("Nombres: ");
        nombre.setToolTipText("Nombres Apellidos");
        nombre.setBounds(10, 10, 200, 10);
        add(nombre);

        //campo de texto para nombre
        campoTexto1 = new JTextField(30);
        add(campoTexto1); 

        dni = new JLabel("DNI: ");
        dni.setToolTipText("Documento de Identidad");
        dni.setSize(100,10);
        add(dni);

        //campo de texto para DNI
        campoTexto2 = new JTextField(33);
        add(campoTexto2); 

        fecha = new JLabel("Fecha de viaje: ");
        fecha.setSize(100,10);
        fecha.setToolTipText("DD/MM/AA");
        add(fecha);

        //campo de texto para fecha de viaje
        campoTexto3 = new JTextField( 27);
        add(campoTexto3); // agrega campoTexto3 a JFrame

        serviciop = new JLabel("Servicio Opcional");
        serviciop.setToolTipText("Items opcionales");
        serviciop.setSize(350,10);
        add(serviciop);

        campoTexto4 = new JTextField(26);
        campoTexto4.setEditable(false);
        add(campoTexto4);

        audifonos = new JCheckBox("     Audifonos");
        mantas = new JCheckBox("    Mantas  ");
        revistas = new JCheckBox("      Revistas      ");
        add(audifonos);
        add(mantas);
        add(revistas);

        ManejadorCheckBox manejdorC = new ManejadorCheckBox();
        audifonos.addItemListener(manejdorC);
        mantas.addItemListener(manejdorC);
        revistas.addItemListener(manejdorC);

        piso = new JLabel("Número de piso: ");
        piso.setToolTipText("Numero de piso (1/2)");
        piso.setSize(350,10);
        add(piso);

        primerPiso = new JRadioButton("    Primer Piso");
        segundoPiso = new JRadioButton("     Segundo Piso");
        add(primerPiso);
        add(segundoPiso);
        grupoOpcionesPiso = new ButtonGroup();
        grupoOpcionesPiso.add(primerPiso);
        grupoOpcionesPiso.add(segundoPiso);
        ManejadorRadioButton manejadorR = new ManejadorRadioButton();
        primerPiso.addItemListener(manejadorR);
        segundoPiso.addItemListener(manejadorR);

        origen = new JLabel("Lugar de origen: ");
        origen.setToolTipText("Ciudad de origen");
        add(origen);

        ciudadOrigenJComboBox = new JComboBox<>(ciudadesOrigen);
        ciudadOrigenJComboBox.setMaximumRowCount(5);
        add(ciudadOrigenJComboBox);
        ManejadorJComboBoxOrigen manejadorO = new ManejadorJComboBoxOrigen();
        ciudadOrigenJComboBox.addItemListener(manejadorO);

        campoTexto5 = new JTextField(34);
        campoTexto5.setEditable(false);
        add(campoTexto5);

        destino = new JLabel("Lugar de destino: ");
        destino.setToolTipText("Ciudad de destino");
        add(destino);

        ciudadDestinoJComboBox = new JComboBox<>(ciudadesDestino);
        ciudadDestinoJComboBox.setMaximumRowCount(5);
        add(ciudadDestinoJComboBox);
        ManejadorJComboBoxDestino manejadorD = new ManejadorJComboBoxDestino();
        ciudadDestinoJComboBox.addItemListener(manejadorD);

        campoTexto6 = new JTextField(34);
        campoTexto6.setEditable(false);
        add(campoTexto6);

        calidad = new JLabel("Calidad de Servicio: ");
        calidad.setToolTipText("Calidad de serivio");
        add(calidad);

        listaCalidad = new JList<String>(calidadesDeServicio);
        listaCalidad.setVisibleRowCount(2);
        listaCalidad.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(listaCalidad);
        add(new JScrollPane(listaCalidad));

        
        ManejadorJListCalidad manejadorCA = new ManejadorJListCalidad();
        listaCalidad.addListSelectionListener(manejadorCA);

        campoTexto7 = new JTextField(34);
        campoTexto7.setEditable(false);
        add(campoTexto7);

        botonReiniciar = new JButton("Reiniciar");
        add(botonReiniciar);

        botonMostrar = new JButton("Mostrar");
        add(botonMostrar);

        // registra los manejadores de eventos de texto
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);

        //manjador para los botones
        ManejadorBotones manejadorb = new ManejadorBotones();
        botonMostrar.addActionListener(manejadorb);
        botonReiniciar.addActionListener(manejadorb);
    }

    // clase interna privada para el manejo de eventos
    private class ManejadorCampoTexto implements ActionListener {
        // procesa los eventos de campo de texto
        @Override
        public void actionPerformed(ActionEvent evento) {
            String cadena = "";
            if (evento.getSource() == campoTexto1)
                cadena = String.format("campoTexto1: %s", evento.getActionCommand());
            else if (evento.getSource() == campoTexto2)
                cadena = String.format("campoTexto2: %s", evento.getActionCommand());
            else if (evento.getSource() == campoTexto3)
                cadena = String.format("campoTexto3: %s", evento.getActionCommand());
            JOptionPane.showMessageDialog(null, cadena);
        }
    } 
    private class ManejadorBotones implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent eventoo){

            if(eventoo.getSource() == botonMostrar){
                JOptionPane.showMessageDialog(null,
                String.format(("INFORMACIÓN:"+
                "\nNombres: "+campoTexto1.getText()+
                "\nDNI: "+campoTexto2.getText()+
                "\nFecha: "+campoTexto3.getText()+
                "\nServicio opcional: "+itemOpcional+
                "\nNúmero de piso: "+numPiso+
                "\nLugar de origen: "+ciudadOrigen+
                "\nLugar de destino: "+ciudadDestino+
                "\nCalidad de servicio: "+calidadServicio),eventoo.getActionCommand()));
            }
            if(eventoo.getSource()==botonReiniciar){
                campoTexto1.setText(" ");
                campoTexto2.setText(" ");
                campoTexto3.setText(" ");
                audifonos.setSelected(false);
                mantas.setSelected(false);
                revistas.setSelected(false);
                itemOpcional = " ";
                //primerPiso.setSelected(false);
                //segundoPiso.setSelected(false);
                grupoOpcionesPiso.clearSelection();
                numPiso = " ";
                ciudadOrigen = " ";
                ciudadDestino = " ";
                calidadServicio = " ";
                listaCalidad.clearSelection();
            }
        }
    }

    private class ManejadorCheckBox implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent eventooo){
            if(audifonos.isSelected()){
                itemOpcional = "Audifonos";
            }
            if(mantas.isSelected()){
                itemOpcional = "Mantas";
            }
            if(revistas.isSelected()){
                itemOpcional = "Revistas";
            }
            if(audifonos.isSelected() && mantas.isSelected()){
                itemOpcional = "Audífonos y mantas";
            }
            if(audifonos.isSelected() && revistas.isSelected()){
                itemOpcional = "Audífonos y revistas";
            }
            if(mantas.isSelected() && revistas.isSelected()){
                itemOpcional = "Mantas y revistas";
            }
            if(audifonos.isSelected() && mantas.isSelected() && revistas.isSelected()){
                itemOpcional = "Audífonos, mantas y revistas";
            }
        }
    }
    private class ManejadorRadioButton implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent event){
            if(primerPiso.isSelected())
                numPiso = "Primer piso";
            if(segundoPiso.isSelected())
                numPiso = "Segundo piso";
        }
    }
    private class ManejadorJComboBoxOrigen implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent event){
            if (ciudadOrigenJComboBox.getSelectedItem() == "Arequipa"){
                ciudadOrigen = "Arequipa";
            }
            if (ciudadOrigenJComboBox.getSelectedItem() == "Lima"){
                ciudadOrigen = "Lima";
            }
            if (ciudadOrigenJComboBox.getSelectedItem() == "Cusco"){
                ciudadOrigen = "Cusco";
            }
            if (ciudadOrigenJComboBox.getSelectedItem() == "Puno"){
                ciudadOrigen = "Puno";
            }
            /*if(event.getItemSelectable().toString()=="Arequipa"){
                ciudadOrigen = "Arequipa";
            }*/
        }
    }
    private class ManejadorJComboBoxDestino implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent event){
            if (ciudadDestinoJComboBox.getSelectedItem() == "Arequipa")
                ciudadDestino = "Arequipa";
            if (ciudadDestinoJComboBox.getSelectedItem() == "Lima")
                ciudadDestino = "Lima";
            if (ciudadDestinoJComboBox.getSelectedItem() == "Cusco")
                ciudadDestino = "Cusco";
            if (ciudadDestinoJComboBox.getSelectedItem() == "Puno")
                ciudadDestino = "Puno";
        }
    }
    private class ManejadorJListCalidad implements ListSelectionListener{
        @Override
        public void valueChanged(ListSelectionEvent evento){
            if(listaCalidad.getSelectedValue()=="Economico"){
                calidadServicio = "Economico";
            }
            if(listaCalidad.getSelectedValue()=="Estándar"){
                calidadServicio = "Estándar";
            }
            if(listaCalidad.getSelectedValue()=="VIP"){
                calidadServicio = "VIP";
            } 
        }
    }

} 



//EXTRAAAA


        //*************************
        /*listaCalidad.addListSelectionListener(
            new ListSelectionListener() {
                @Override
                public void valueChanged(ListSelectionEvent eventto){
                    if(listaCalidad.getSelectedValue()=="Economico"){
                        calidadServicio = "Economico";
                    }
                    if(listaCalidad.getSelectedValue()=="Estándar"){
                        calidadServicio = "Estándar";
                    }
                    if(listaCalidad.getSelectedValue()=="VIP"){
                        calidadServicio = "VIP";
                    } 
                }
            }
        );*/






           /* new ItemListener(){
                @Override
                public void itemStateChanged(ItemEvent event){
                    if(event.getSource()==ciudadesOrigen[0]){
                        ciudadOrigen = "Arequipa";
                    }
                    if(event.getSource()==ciudadesOrigen[1]){
                        ciudadOrigen = "Lima";
                    }
                    if(event.getSource()==ciudadesOrigen[2]){
                        ciudadOrigen = "Cusco";
                    }
                }
            }
        );*/

/* 
            // clase interna privada para el manejo de eventos
    private class ManejadorCampoTexto implements ActionListener {
        // procesa los eventos de campo de texto
        @Override
        public void actionPerformed(ActionEvent evento) {
            String cadena = "";
            // el usuario oprimió Intro en el objeto JTextField campoTexto1
            if (evento.getSource() == campoTexto1)
                cadena = String.format("campoTexto1: %s", evento.getActionCommand());

            // el usuario oprimió Intro en el objeto JTextField campoTexto2
            else if (evento.getSource() == campoTexto2)
                cadena = String.format("campoTexto2: %s", evento.getActionCommand());

            // el usuario oprimió Intro en el objeto JTextField campoTexto3
            else if (evento.getSource() == campoTexto3)
                cadena = String.format("campoTexto3: %s", evento.getActionCommand());

            // el usuario oprimió Intro en el objeto JTextField campoContrasenia
            
            /* 
            else if (evento.getSource() == campoContrasenia)
                cadena = String.format("campoContrasenia: %s",
                        evento.getActionCommand());*/

            // muestra el contenido del objeto JTextField
            /*JOptionPane.showMessageDialog(null, cadena);
        }
    } fin de la clase privada interna ManejadorCampoTexto */


//import java.awt.Font;
//import javax.swing.Icon;
//import javax.swing.SwingConstants;
//import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;
//import javax.swing.event.InternalFrameEvent;