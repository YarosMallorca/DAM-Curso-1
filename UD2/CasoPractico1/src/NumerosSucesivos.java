import java.util.Scanner;

public class NumerosSucesivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero; // Aquí guardaremos el número 
		
		do { // Hacemos un do while para preguntar el número
            System.out.print("Dime un número positivo: "); // Preguntamos el número
            numero = sc.nextInt(); // Leemos
        } while (numero <= 0); // Verificamos que sea positivo
		
		System.out.println("Los 20 números sucesivos a " + numero + " son:");
		
		/// For loop para los siguientes 20 nums
		/// Initializa variable i (iterador) a numero, y se ejecuta mientras i sea menor o igual que número + offset de 20
		/// automáticamente incrementando i al final de bucle 
		for (int i = numero + 1; i <= numero + 20; i++) {
			System.out.println(i);
		}
		sc.close();

	}
}
