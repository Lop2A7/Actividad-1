import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ViewFile extends JFrame {
    private JTextArea areaTexto;
    
    public ViewFile(String s){
        super("Mostrando el conteniedo de un archivo");
        areaTexto = new JTextArea(s,5,50);
        add(areaTexto);
    }
}