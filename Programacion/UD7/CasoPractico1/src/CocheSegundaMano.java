
public class CocheSegundaMano extends Coche implements Vendible {
    private String nombreAntiguoPropietario;

    public CocheSegundaMano(String matricula, String color, String modelo, double precio, double kilometrosRecorridos, String nombreAntiguoPropietario) {
        super(matricula, color, modelo, precio, kilometrosRecorridos);
        this.nombreAntiguoPropietario = nombreAntiguoPropietario;
    }

    public String getNombreAntiguoPropietario() { return nombreAntiguoPropietario; }
    public void setNombreAntiguoPropietario(String nombreAntiguoPropietario) { this.nombreAntiguoPropietario = nombreAntiguoPropietario; }

    @Override
    public void vender() {
        System.out.println("El coche de segunda mano se ha vendido.");
    }

    @Override
    public String toString() {
        return "[Segunda Mano] " + super.toString() + ", Antiguo propietario: " + nombreAntiguoPropietario;
    }
}