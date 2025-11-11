import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class OrdenNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] numeros = {0, 0, 0}; // Array donde guardaremos los numeros
		String orden = null;
		
		System.out.print("Dime el primer número: ");
		numeros[0] = sc.nextInt(); // Leemos primer numero como integer
		
		System.out.print("Dime el segundo número: ");
		numeros[1] = sc.nextInt(); // Leemos segundo numero como integer
		
		System.out.print("Dime el tercer número: ");
		numeros[2] = sc.nextInt(); // Leemos tercer numero como integer
		
		sc.nextLine(); // consume leftover newline
		System.out.print("Dime el orden (asc/desc): ");
		orden = sc.nextLine();
		orden = orden.strip().toLowerCase();
			
		// Ordenamos dependiendo del string "orden"
		if (orden.equals("asc")) {
			Arrays.sort(numeros); // Ascendiente
		}
		else {
			Arrays.sort(numeros, Collections.reverseOrder()); // Descendente
		}
		
		System.out.println("Números ordenados (" + orden + "): " + Arrays.toString(numeros));
		sc.close();
	}
}
