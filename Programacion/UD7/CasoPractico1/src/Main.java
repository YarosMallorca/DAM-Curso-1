
public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- GESTIÓN DE CONCESIONARIO ---\n");

        // 1. Instanciamos los diferentes tipos de coches
        CocheKm0 cocheKm0 = new CocheKm0("1234ABC", "Blanco", "Seat Leon", 22000.0, 150.0);
        CocheNuevo cocheNuevo = new CocheNuevo("9876XYZ", "Rojo", "Mazda 3", 28500.0, 0.0, 60);
        CocheSegundaMano cocheUsado = new CocheSegundaMano("4567LMN", "Negro", "Ford Focus", 12000.0, 85000.0, "Juan Pérez");

        // 2. Mostramos la información de los coches (Esto invocará el toString() sobreescrito)
        System.out.println("Catálogo de vehículos:");
        System.out.println(cocheKm0);
        System.out.println(cocheNuevo);
        System.out.println(cocheUsado);
        System.out.println();

        // 3. Realizamos las acciones de venta o alquiler según la interfaz que implementan
        System.out.println("Acciones realizadas:");
        cocheKm0.alquilar();    // Método de la interfaz Alquilable
        cocheNuevo.vender();    // Método de la interfaz Vendible
        cocheUsado.vender();    // Método de la interfaz Vendible
        System.out.println();

        // 4. Comprobamos el atributo de clase (estático)
        System.out.println("Stock total procesado: " + Coche.numCochesStock + " coches instanciados.");
    }
}