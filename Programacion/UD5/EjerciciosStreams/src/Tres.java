import java.io.*;

public class Tres {
    public static void main(String[] args) {
    	// Definimos el archivo
        File archivo = new File("C:\\EjerciciosStreams\\datos.txt");
        
        // Lo intentamos abrir con BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            // Mientras que hayan más líneas, la leemos
            while ((linea = br.readLine()) != null) {
                System.out.println(linea); // Y enseñamos en la consola
            }
        } catch (FileNotFoundException e) {
        	// Si no existe el archivo, enseñamos error
            System.out.println("Error: El archivo datos.txt no existe.");
        } catch (IOException e) {
        	// Y todos los otros errores también por consola
            e.printStackTrace();
        }
    }
}