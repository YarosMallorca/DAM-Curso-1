
public class CocheKm0 extends Coche implements Alquilable {

    public CocheKm0(String matricula, String color, String modelo, double precio, double kilometrosRecorridos) {
        super(matricula, color, modelo, precio, kilometrosRecorridos);
    }

    @Override
    public void alquilar() {
        System.out.println("El coche km0 se ha alquilado.");
    }

    @Override
    public String toString() {
        // Utilizo super.toString() para no repetir código
        return "[Km0] " + super.toString();
    }
}