package principal.interno;

public class CalcularIMC {
    public static double calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        return imc;
    }
}