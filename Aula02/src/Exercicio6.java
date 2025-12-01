public class Exercicio6 {
    public static void main(String[] args) {
        double valorDolar = 4.94;
        int quantidadeDolar = 20;
        double resultado = valorDolar * quantidadeDolar;
        String resultadoDolar = String.format("%.2f", resultado);
        System.out.println(resultadoDolar);
    }
}
