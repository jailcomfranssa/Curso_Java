package fundamentos.java04_variavel;

public class AreaCircuferencia {
    public static void main(String[] args) {
        double raio = 3.1;
       final double PI = 3.14;

        double area = PI * raio * raio;

        System.out.println("Área = " +  area);
    }
}
