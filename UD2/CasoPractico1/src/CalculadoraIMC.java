import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Asignamos variables, de momento los pondremos a 0, las estableceremos luego
        double peso = 0;
        double altura = 0;
        boolean pesoValido = false; // Falso para que entre al while
        boolean alturaValida = false;

        do {
            System.out.print("Introduce tu peso en kg (30 - 300): ");
            peso = sc.nextDouble(); // Leemos el peso

            if (peso >= 30 && peso <= 300) { // Comprobamos si es válido
                pesoValido = true; // si lo es, ponemos true para salir del loop
            } else {
                System.out.println("Error: el peso debe estar entre 30 y 300 kg.");
            }
        } while (!pesoValido);

        // Pedir altura hasta que sea válida
        do {
            System.out.print("Introduce tu altura en metros (1.30 - 2.00): ");
            altura = sc.nextDouble(); // Leemos altura

            if (altura >= 1.30 && altura <= 2.00) { // Comprobamos altura
                alturaValida = true; // Si es valida salimos del bucle poniendo el bool a true
            } else {
                System.out.println("Error: la altura debe estar entre 1.30 y 2.00 metros.");
            }
        } while (!alturaValida);

        // Calculamos IMC usando formula
        double imc = peso / (altura * altura);

        System.out.printf("Tu IMC es: %.2f%n", imc); // Enseñamos el IMC con precisión a 2 decimales

        // Clasificamos el IMC
        if (imc < 18.5) {
            System.out.println("Nivel de peso: Bajo peso");
        } else if (imc < 25) {
            System.out.println("Nivel de peso: Normal");
        } else if (imc < 30) {
            System.out.println("Nivel de peso: Sobrepeso");
        } else {
            System.out.println("Nivel de peso: Obesidad");
        }
        sc.close();
    }

}

