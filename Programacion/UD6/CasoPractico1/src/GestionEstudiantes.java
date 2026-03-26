import java.util.*;

class Estudiante {
    String nombre;
    int edad;
    double nota;

    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | Nota: " + nota;
    }
}

public class GestionEstudiantes {
	static Scanner sc = new Scanner(System.in);
    
    // Estructuras de datos
    static Estudiante[] arrayEstudiantes = new Estudiante[5]; // Como ejemplo, array de tamaño 5
    static int contadorArray = 0;
    static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>(); // Array dinámico

    public static void main(String[] args) {
        int opcionPrincipal;

        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Usar Array");
            System.out.println("2. Usar ArrayList");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            opcionPrincipal = sc.nextInt();

            switch (opcionPrincipal) { // Determinar que seleccionó el usuario
                case 1 -> menuArray();
                case 2 -> menuArrayList();
                case 3 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcionPrincipal != 3); // Salimos del programa si usuario selecciona 3
    }

    // --- SUBMENÚ ARRAY ---
    static void menuArray() {
        int opcion;
        do {
            System.out.println("\n--- Menú Array ---");
            System.out.println("1. Agregar un estudiante");
            System.out.println("2. Ver estudiantes");
            System.out.println("3. Volver al menú principal");
            System.out.print("Selecciona: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                if (contadorArray < arrayEstudiantes.length) {
                    arrayEstudiantes[contadorArray++] = crearEstudiante();
                    System.out.println("**Estudiante agregado correctamente**");
                } else {
                    System.out.println("Error: El array está lleno.");
                }
            } else if (opcion == 2) {
                for (int i = 0; i < contadorArray; i++) { // Iteramos por cada estudiante en el array
                    System.out.println(arrayEstudiantes[i]);
                }
            }
        } while (opcion != 3); // Salimos al otro bucle si el usuario selecciona 3
    }

    // --- SUBMENÚ ARRAYLIST ---
    static void menuArrayList() {
        int opcion;
        do {
            System.out.println("\n--- Menú ArrayList ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Ver estudiantes");
            System.out.println("3. Eliminar por nombre");
            System.out.println("4. Buscar por nombre");
            System.out.println("5. Volver");
            System.out.print("Selecciona: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    listaEstudiantes.add(crearEstudiante());
                    System.out.println("**Estudiante agregado al ArrayList**");
                }
                case 2 -> listaEstudiantes.forEach(System.out::println);
                case 3 -> {
                    System.out.print("Nombre a eliminar: ");
                    String nomEliminar = sc.next();
                    // Eliminamos el estudiante por nombre, ignorando mayúsculas
                    listaEstudiantes.removeIf(e -> e.nombre.equalsIgnoreCase(nomEliminar));
                }
                case 4 -> {
                    System.out.print("Nombre a buscar: ");
                    String nomBuscar = sc.next();
                    listaEstudiantes.stream()
                        .filter(e -> e.nombre.equalsIgnoreCase(nomBuscar)) // Filtramos por nombre
                        .forEach(System.out::println); // Enseñamos en el terminal usando println
                }
            }
        } while (opcion != 5); // Acabamos el bucle si selecciona la opción 5, volviendo al otro menú
    }

    static Estudiante crearEstudiante() {
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Nota final: ");
        double notaFinal = sc.nextDouble();
        return new Estudiante(nombre, edad, notaFinal);
    }

}