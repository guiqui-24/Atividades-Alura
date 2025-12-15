import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        // Desafio consiste em criar um menu para calculo de area do quadrado e de circulo
        Scanner input = new Scanner(System.in);
        System.out.println("1=Calcular área do quadrado. 2= Calcular área do círculo");
        String operacao = input.nextLine();
        if (operacao.equals("1")) {
            System.out.println("Digite o tamanho do lado: ");
            double primeiroValor = input.nextDouble();
            System.out.println("Resultado: " + primeiroValor * primeiroValor);
        } else if (operacao.equals("2")) {
            System.out.println("Digite o raio do círculo: ");
            double raio = input.nextDouble();
            System.out.println("Resultado: " + ((raio * raio) * 3.14));
        }

    }

}
