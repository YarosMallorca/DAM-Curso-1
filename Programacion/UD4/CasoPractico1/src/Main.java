public class Main {
    public static void main(String[] args) {
        // Instanciar Pokémon
        PokemonFuego charizard = new PokemonFuego("Charizard", 36, 120, 1500, true);
        PokemonAgua starmie = new PokemonAgua("Starmie", 33, 100, 500, true);

        // Instanciar Entrenadores
        Entrenador ash = new Entrenador("Ash", 150, 8, "Kanto"); // Experiencia 150, 8 medallas
        Entrenador misty = new Entrenador("Misty", 120, 5, "Ciudad Celeste");

        // Asociación: Asignar Pokémon a entrenadores
        ash.capturarPokemon(charizard);
        misty.capturarPokemon(starmie);

        // Mostrar datos por pantalla (Formato similar a la imagen)
        imprimirDatosEntrenador(ash, "Fuego", charizard.lanzarLlamarada());
        System.out.println(); // Salto de línea
        imprimirDatosEntrenador(misty, "Agua", starmie.lanzarHidrobomba());
        System.out.println(); // Salto de línea

        // Organizar el combate
        Combate granFinal = new Combate(ash, misty);
        granFinal.determinarGanador();
    }

    public static void imprimirDatosEntrenador(Entrenador e, String tipoPokemon, String ataque) {
        Pokemon p = e.getPokemonAsignado();
        System.out.println("Entrenador: " + e.getNombre() + ", Experiencia: " + e.getExperiencia() + ", Origen: " + e.getRegionOrigen());
        System.out.println("Pokémon que entrena: Nombre: " + p.getNombre() + ", Nivel: " + p.getNivel() + ", Tipo: " + tipoPokemon);
        System.out.println("Ataque especial: " + ataque);
    }
}

class Pokemon {
    private String nombre;
    private int nivel;
    private int vida;

    public Pokemon() {
    }

    public Pokemon(String nombre, int nivel, int vida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}

class PokemonFuego extends Pokemon {
    private int temperaturaLlama;
    private boolean puedeVolar;

    public PokemonFuego() {
        super();
    }

    public PokemonFuego(String nombre, int nivel, int vida, int temperaturaLlama, boolean puedeVolar) {
        super(nombre, nivel, vida); // Llama al constructor del padre
        this.temperaturaLlama = temperaturaLlama;
        this.puedeVolar = puedeVolar;
    }

    public String lanzarLlamarada() {
        return "Llamarada";
    }

    public int getTemperaturaLlama() {
        return temperaturaLlama;
    }

    public void setTemperaturaLlama(int temperaturaLlama) {
        this.temperaturaLlama = temperaturaLlama;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }
}

class PokemonAgua extends Pokemon {
    private int profundidadNado;
    private boolean esAguaSalada;

    public PokemonAgua() {
        super();
    }

    public PokemonAgua(String nombre, int nivel, int vida, int profundidadNado, boolean esAguaSalada) {
        super(nombre, nivel, vida);
        this.profundidadNado = profundidadNado;
        this.esAguaSalada = esAguaSalada;
    }

    public String lanzarHidrobomba() {
        return "Hidrobomba";
    }

    public int getProfundidadNado() {
        return profundidadNado;
    }

    public void setProfundidadNado(int profundidadNado) {
        this.profundidadNado = profundidadNado;
    }

    public boolean isEsAguaSalada() {
        return esAguaSalada;
    }

    public void setEsAguaSalada(boolean esAguaSalada) {
        this.esAguaSalada = esAguaSalada;
    }
}

class PokemonElectrico extends Pokemon {
    private double voltaje;
    private int capacidadCarga;

    public PokemonElectrico() {
        super();
    }

    public PokemonElectrico(String nombre, int nivel, int vida, double voltaje, int capacidadCarga) {
        super(nombre, nivel, vida);
        this.voltaje = voltaje;
        this.capacidadCarga = capacidadCarga;
    }

    public String lanzarImpactrueno() {
        return "Impactrueno";
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}

class Combate {
    private Entrenador entrenador1;
    private Entrenador entrenador2;

    public Combate() {
    }

    public Combate(Entrenador e1, Entrenador e2) {
        this.entrenador1 = e1;
        this.entrenador2 = e2;
    }

    // Getters y Setters
    public Entrenador getEntrenador1() {
        return entrenador1;
    }

    public void setEntrenador1(Entrenador entrenador1) {
        this.entrenador1 = entrenador1;
    }

    public Entrenador getEntrenador2() {
        return entrenador2;
    }

    public void setEntrenador2(Entrenador entrenador2) {
        this.entrenador2 = entrenador2;
    }

    public void determinarGanador() {
        Pokemon p1 = entrenador1.getPokemonAsignado();
        Pokemon p2 = entrenador2.getPokemonAsignado();

        System.out.println("¡Combate Pokémon!");
        System.out.println(p1.getNombre() + " (Nivel: " + p1.getNivel() + ") CONTRA " + p2.getNombre() + " (Nivel: " + p2.getNivel() + ")");

        if (p1.getNivel() > p2.getNivel()) {
            System.out.println("Ganador: " + p1.getNombre() + " del entrenador " + entrenador1.getNombre());
        } else if (p2.getNivel() > p1.getNivel()) {
            System.out.println("Ganador: " + p2.getNombre() + " del entrenador " + entrenador2.getNombre());
        } else {
            System.out.println("El combate termina en empate.");
        }
    }
}

class Entrenador {
    private String nombre;
    private int experiencia;
    private int numeroMedallas;
    private String regionOrigen;

    private Pokemon pokemonAsignado;

    public Entrenador() {
    }

    public Entrenador(String nombre, int experiencia, int numeroMedallas, String regionOrigen) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.numeroMedallas = numeroMedallas;
        this.regionOrigen = regionOrigen;
    }

    public void capturarPokemon(Pokemon p) {
        this.pokemonAsignado = p;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getNumeroMedallas() {
        return numeroMedallas;
    }

    public void setNumeroMedallas(int numeroMedallas) {
        this.numeroMedallas = numeroMedallas;
    }

    public String getRegionOrigen() {
        return regionOrigen;
    }

    public void setRegionOrigen(String regionOrigen) {
        this.regionOrigen = regionOrigen;
    }

    public Pokemon getPokemonAsignado() {
        return pokemonAsignado;
    }

    public void setPokemonAsignado(Pokemon pokemonAsignado) {
        this.pokemonAsignado = pokemonAsignado;
    }
}

