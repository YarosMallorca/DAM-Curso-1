import java.io.*;

public class Main {
    public static void main(String[] args) {
        File directorio = new File("C:\\EjerciciosStreams"); // Ruta del directorio
        
        if (!directorio.exists()) { // Verificamos si existe
            if (directorio.mkdirs()) { // Llamamos mkdirs que lo crea, y devuelve true si se ha creado
                System.out.println("Directorio creado exitosamente.");
            }
        }
        
        // Un array de strings con los archivos que queremos crear
        String[] archivos = {"uno.txt", "dos.txt", "datos.txt"};
        	
        // Con un for-each hacemos bucle sobre el array
        for (String nombre : archivos) {
        	// Definimos archivo (objeto, con su directorio, y nombre)
        	// En este caso el nombre es el string desde el array de la iteración actual
            File archivo = new File(directorio, nombre);
            
            // Intentamos de crear
            try {
                if (archivo.createNewFile()) { // Si se ha creado, createNewFile devuelve true
                    System.out.println("Archivo creado: " + nombre);
                }
            } catch (IOException e) {
            	// Y enseñamos cualquier error que ocurra con un catch y println
                System.out.println("Error al crear " + nombre + ": " + e.getMessage());
            }
        }
        
        generarDatos();
    }
    
    // Esto es una función helper que he escrito para generar datos random
 	// en datos.txt, para que la Tres.java funcione correctamente
 	// sin tener que meter datos manualmente
 	private static void generarDatos() {
 		// Datos inventados
 		String[][] datos = {
 			    {"María López", "955215263"},
 			    {"Carlos Ramírez", "612498735"},
 			    {"Lucía Fernández", "723560914"},
 			    {"Javier Torres", "684239571"},
 			    {"Ana Morales", "701345882"}
 			};
 		
 		 File archivo = new File("C:\\EjerciciosStreams\\datos.txt"); 
 		
 		try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {

            for (String[] persona : datos) {
                pw.println("Nombre:" + persona[0] + "  Teléfono: " + persona[1]);
            }

            System.out.println("datos.txt escrito correctamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
 	}
}