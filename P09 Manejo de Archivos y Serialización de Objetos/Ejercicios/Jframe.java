import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Jframe extends JFrame {
    private final JTextArea areaSalida;
    String linea;
    int ContadorP = 0;
    int ContadorC = 0;
    int ContadorParra = 0;
    int ContadorF = 0;

    public Jframe() throws IOException {
        super("Lector de archivos");
        areaSalida = new JTextArea();
        add(new JScrollPane(areaSalida));
        LeerArchivo();
    }

    public void LeerArchivo() throws IOException {

        Path ruta = obtenerRutaArchiveDirectorio();
        File file = ruta.toFile(); // convertimos el path a File gracias a este comando
        StringBuilder builder = new StringBuilder();
        FileInputStream File = new FileInputStream(file);
        InputStreamReader Input = new InputStreamReader(File);
        try (BufferedReader Reader = new BufferedReader(Input)) {
            while ((linea = Reader.readLine()) != null) {
                if (linea.equals("")) {
                    ContadorParra += 1;
                } else {
                    ContadorC += linea.length();
                    String words[] = linea.split("\\s+");
                    ContadorP += words.length;
                    String sentence[] = linea.split("[!?.:]+");
                    ContadorF += sentence.length;
                }
            }
            if (ContadorF >= 1) {
                ContadorParra++;
            }
        }
        builder.append(String.format("Nombre del Archivo: %s%n", file.getName()));
        builder.append(String.format("Total de palabras halladas: %s%n", ContadorP));
        builder.append(String.format("Total frases encontradas: %s%n", ContadorF));
        builder.append(String.format("Total caracteres encontrados: %s%n", ContadorC));
        builder.append(String.format("Total de Parrafos encontrados: %s%n", ContadorParra));
        areaSalida.setText(builder.toString());
    }

    private Path obtenerRutaArchiveDirectorio() {
        JFileChooser selectorArchivos = new JFileChooser();
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int resultado = selectorArchivos.showOpenDialog(this);
        if (resultado == JFileChooser.CANCEL_OPTION)
            System.exit(1);
        return selectorArchivos.getSelectedFile().toPath();
    }
}