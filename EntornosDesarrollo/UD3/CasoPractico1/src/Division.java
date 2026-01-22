public class Division {
    private final int num1;
    private final int num2;

    public Division(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int dividir() {
        return num1 / num2;
    }
}