
public class CocheNuevo extends Coche implements Vendible {
    private int duracionGarantia;

    public CocheNuevo(String matricula, String color, String modelo, double precio, double kilometrosRecorridos, int duracionGarantia) {
        super(matricula, color, modelo, precio, kilometrosRecorridos);
        this.duracionGarantia = duracionGarantia;
    }

    public int getDuracionGarantia() { return duracionGarantia; }
    public void setDuracionGarantia(int duracionGarantia) { this.duracionGarantia = duracionGarantia; }

    @Override
    public void vender() {
        System.out.println("El coche nuevo se ha vendido.");
    }

    @Override
    public String toString() {
        return "[Nuevo] " + super.toString() + ", Garantía: " + duracionGarantia + " meses";
    }
}