import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = input.nextInt();
        if  (num > 0){
            System.out.println("Número positivo");
        } else System.out.println("Numero negativo");
    }
}
