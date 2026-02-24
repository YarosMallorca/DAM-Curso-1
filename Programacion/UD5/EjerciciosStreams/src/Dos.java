import java.util.Scanner;
import java.io.*;

public class Dos {
    public static void main(String[] args) {
    	// Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la base: ");
        double base = sc.nextDouble();
        System.out.print("Introduce la altura: ");
        double altura = sc.nextDouble();
        
        // Calculamos área usando la fórmula
        double area = (base * altura) / 2;
        
        // Intentamos de guardar el resultado
        try (FileWriter fw = new FileWriter("C:\\EjerciciosStreams\\dos.txt")) {
        	String resultado = "El área del triángulo es: " + area;
            fw.write(resultado); // Escribimos el string al archivo
            System.out.println(resultado); // Lo enseñamos por la consola
            System.out.println("Resultado guardado en archivo.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        sc.close();
    }
}