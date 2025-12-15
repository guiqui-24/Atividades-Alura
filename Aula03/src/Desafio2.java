import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite dois números:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if(n1 == n2){
            System.out.println("São iguais");
        } else if(n1 < n2){
            System.out.println("São diferentes e " + n1 + " é menor que " + n2);
        } else System.out.println("São diferentes e " + n2 + " é menor que " + n1);


    }
}
