import java.io.*;

public class Uno {
    public static void main(String[] args) {
    	// Definimos el archivo
    	// En este caso, el que hemos creado usando Main.java
        File archivo = new File("C:\\EjerciciosStreams\\uno.txt");
        	
        // Verificamos si existe
        if (archivo.exists()) {
        	// Intentamos de escribir al archivo
        	try (PrintWriter pw = new PrintWriter(archivo)) {
        		// Bucle for, de 0 al 10
        	    for (int i = 0; i <= 10; i++) {
        	        pw.println(i); // Este println irá al archivo, no a la consola
        	    }
        	} catch (IOException e) {
                e.printStackTrace(); // Enseñamos cualquier error en la consola
            }
        }
    }
}