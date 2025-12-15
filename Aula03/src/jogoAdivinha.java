import java.util.Random;
import java.util.Scanner;

public class jogoAdivinha {
    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(100);


        Scanner resposta = new Scanner(System.in);

        System.out.println("Adivinhe o número de 0 a 100:");

        int tentativas = 6;
        while (tentativas > 0) {
            int palpite = resposta.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns você acertou!");
                break;
            } tentativas--;
        }
    }
}
