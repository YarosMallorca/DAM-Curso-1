class Empleado {
    protected String nombre;
    protected String dni;
    protected double salario;

    public Empleado() {
        this.nombre = "Sin nombre";
        this.dni = "Sin DNI";
        this.salario = 0.0;
    }

    public Empleado(String nombre, String dni, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.salario = salario;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | DNI: " + dni + " | Salario: $" + salario;
    }
}

class Administrativo extends Empleado {
    private String sector;

    public Administrativo() {
        super();
        this.sector = "General";
    }

    public Administrativo(String nombre, String dni, double salario, String sector) {
        super(nombre, dni, salario);
        this.sector = sector;
    }

    public String getSector() { return sector; }
    public void setSector(String sector) { this.sector = sector; }

    @Override
    public String toString() {
        return super.toString() + " | Sector: " + sector + " (ADMINISTRATIVO)";
    }
}

class Contable extends Empleado {
    private boolean esCertificado;

    public Contable() {
        super();
        this.esCertificado = false;
    }

    public Contable(String nombre, String dni, double salario, boolean esCertificado) {
        super(nombre, dni, salario);
        this.esCertificado = esCertificado;
    }

    public boolean isEsCertificado() { return esCertificado; }
    public void setEsCertificado(boolean esCertificado) { this.esCertificado = esCertificado; }

    @Override
    public String toString() {
        String estadoCert = esCertificado ? "Sí" : "No";
        return super.toString() + " | Certificado: " + estadoCert + " (CONTABLE)";
    }
}

class Informatico extends Empleado {
    private String especialidad;

    public Informatico() {
        super();
        this.especialidad = "Soporte";
    }

    public Informatico(String nombre, String dni, double salario, String especialidad) {
        super(nombre, dni, salario);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    @Override
    public String toString() {
        return super.toString() + " | Especialidad: " + especialidad + " (INFORMATICO)";
    }
}

public class GestionEmpleados {

	public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE EMPLEADOS ===\n");
        System.out.println("--- Creación usando Constructor con Parámetros ---");
        
        Empleado emp1 = new Empleado("Juan Pérez", "11111111A", 25000);
        
        Administrativo admin1 = new Administrativo("Ana Gómez", "22222222B", 30000, "Logística");
        
        Contable cont1 = new Contable("Carlos Ruiz", "33333333C", 45000, true);
        
        Informatico info1 = new Informatico("Laura Tech", "44444444D", 50000, "Desarrollo Backend");

        System.out.println(emp1.toString());
        System.out.println(admin1.toString());
        System.out.println(cont1.toString());
        System.out.println(info1.toString());


        System.out.println("\n--- Creación usando Constructor Vacío + Setters ---");

        Administrativo admin2 = new Administrativo();
        admin2.setNombre("Pedro Martínez");
        admin2.setDni("55555555E");
        admin2.setSalario(28000);
        admin2.setSector("Atención al Cliente");

        Contable cont2 = new Contable();
        cont2.setNombre("Lucía Fernández");
        cont2.setDni("66666666F");
        cont2.setSalario(32000);
        cont2.setEsCertificado(false);

        Informatico info2 = new Informatico();
        info2.setNombre("David Code");
        info2.setDni("77777777G");
        info2.setSalario(48000);
        info2.setEspecialidad("DevOps");

        System.out.println(admin2.toString());
        System.out.println(cont2.toString());
        System.out.println(info2.toString());
    }

}
