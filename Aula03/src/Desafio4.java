import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número ");
        int num = input.nextInt();

        for (int tabuada = 0; tabuada <= 10; tabuada++) {
            System.out.println(num * tabuada);
        }
    }
}
