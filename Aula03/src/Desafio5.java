
// Usuario insere um numero e o programa devolve o fatorial desse numero

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = input.nextInt();
        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado = resultado * i;
        }
        if (num == 0){
            resultado = 1;
        }
        System.out.println(resultado);
    }
}
