import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String Archivo = "/Users/sebastian/Documents/CURP.txt";
        String CURP = "^[A-Z][AEIOU][A-Z]{2}[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])[HM][A-Z]{2}[B-DF-HJ-NP-TV-Z]{3}[0-9A-Z][0-9]$";
        Pattern pattern = Pattern.compile(CURP);

        try (BufferedReader lector = new BufferedReader(new FileReader(Archivo))) {
            String Curp;
            int LineaNum = 1;
            while ((Curp = lector.readLine()) != null) {
                Curp = Curp.trim();
                boolean esValida = pattern.matcher(Curp).matches();
                if (!esValida) {
                    System.out.printf("CURP no válida en línea %d: %s%n", LineaNum, Curp);
                }
                LineaNum++;
            }
        } catch (IOException e) {
            System.err.println("Error al intentar leer el archivo: " + e.getMessage());
        }
    }
}