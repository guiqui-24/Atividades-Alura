public class Exercicio7 {
    public static void main(String[] args) {
        double precoOriginal = 199.99;
        double percentualDesconto = 20;
        double valorDesconto = precoOriginal * (percentualDesconto/100);
        double precoFinal = precoOriginal - valorDesconto;
        String resultadoDesconto = String.format("%.2f", precoFinal);
        System.out.println(resultadoDesconto);
    }
}
