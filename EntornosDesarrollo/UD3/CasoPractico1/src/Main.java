public class Main {
    public static void main(String[] args) {
        int resta = new Resta(5, 2).restar();
        System.out.println(resta);

        int multiplicacion = new Multiplicacion(5, 5).multiplicar();
        System.out.println(multiplicacion);

        int division = new Division(15, 3).dividir();
        System.out.println(division);
    }
}
