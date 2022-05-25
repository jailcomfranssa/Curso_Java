package fundamentos.java05_desafio;

public class Temperatura {
    public static void main(String[] args) {

        final double FATOR = 5.0/9;
        final double AJUSTE = 32;

        double Fahrenheit = 86;
        double Celsius = (Fahrenheit - AJUSTE) * FATOR;

        System.out.println("O resultado é " + Celsius + "°C.");

    }
}
