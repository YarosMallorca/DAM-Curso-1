/// Clase abstracta, va a ser extendida por la clase normal
/// Define lógica común de un coche
public abstract class Coche {
    protected String matricula;
    protected String color;
    protected String modelo;
    protected double precio;
    protected double kilometrosRecorridos;
    
    // Atributo de clase (estático) para contar los objetos instanciados
    public static int numCochesStock = 0;

    // Constructor
    public Coche(String matricula, String color, String modelo, double precio, double kilometrosRecorridos) {
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.kilometrosRecorridos = kilometrosRecorridos;
        
        // Cada vez que se llama a este constructor desde una subclase, se incrementa el stock
        numCochesStock++;
    }

    // Getters y Setters
    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public double getKilometrosRecorridos() { return kilometrosRecorridos; }
    public void setKilometrosRecorridos(double kilometrosRecorridos) { this.kilometrosRecorridos = kilometrosRecorridos; }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Modelo: " + modelo + 
               ", Color: " + color + ", Precio: " + precio + "€, Km: " + kilometrosRecorridos;
    }
}