import java.io.*;

public class Cuatro {
	public static void main(String[] args) {

        try (
        	// Definimos el archivo de entrada y salida
            BufferedReader br = new BufferedReader(new FileReader("C:\\EjerciciosStreams\\datos.txt"));
            RandomAccessFile raf = new RandomAccessFile("C:\\EjerciciosStreams\\datosAleatorio.txt", "rw")
        ) {

            String linea;
            // Vamos línea por línea
            while ((linea = br.readLine()) != null) {

                // Separar nombre y teléfono
                String[] partes = linea.split("Teléfono: ");
                String nombre = partes[0].replace("Nombre:", "").trim();
                String telefono = partes[1].trim();

                // Escribir en el archivo aleatorio
                raf.writeUTF(nombre);
                raf.writeUTF(telefono);
            }

            System.out.println("Archivo de acceso aleatorio creado correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}