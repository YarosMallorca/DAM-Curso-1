
public class NumerosMultiplos {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) { // Bucle de numeros 1 a 100
			if (i % 2 == 0 || i % 3 == 0) { // Usamos el operador modulo para comprobar divisibilidad
				System.out.println(i); // Enseñamos el número en el terminal
			}
		}
	}
}
