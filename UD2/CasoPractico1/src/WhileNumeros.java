
public class WhileNumeros {

	public static void main(String[] args) {
		int contador = 10; // Empezamos contando desde 10
		while (contador > 0) { // Bucle se repite mientras contador sea más que 0
			System.out.println(contador); // Enseñamos el número
			contador--; // Restamos 1 al número, también podríamos hacer contador = contador - 1;
		}
		// El bucle se parará una vez contador llegue a 1
	}
}
