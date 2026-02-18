import java.util.Scanner;

public class sistemaSaldo {
    static Scanner sc = new Scanner(System.in);
    static double valorTotal = 0;
    static int opcao = 0;
    static String nome = "Guilherme Garcia";
    public  static void main(String[] args) {


        System.out.println("**************************************");
        System.out.println("\nDados Iniciais do cliente");
        System.out.println("\nNome:           " + nome);
        System.out.println("Tipo de conta:  Corrente");
        System.out.println("Saldo:          R$" + valorTotal);
        System.out.println("\n**************************************");

        while (opcao != 4){
            exibirMenu();
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    visualizarSaldo();
                    break;
                case 2:
                    enviarValor();
                    break;
                case 3:
                    receberValor();
                    break;
                case 4:
                    System.out.println("Tenha um bom dia!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }

        }
    }

    private static void exibirMenu() {
        System.out.println("Escolha uma opcão:");
        System.out.println("1. Visualizar saldo");
        System.out.println("2. Enviar valor");
        System.out.println("3. Receber valor");
        System.out.println("4. Sair");
        System.out.println("");
        System.out.println("Digite a opção desejada:");
    }
    public static void visualizarSaldo() {
        System.out.println("O saldo atual é R$" + valorTotal);
    }
    public static void enviarValor() {
        System.out.println("Digite o valor que deseja enviar:");
        double valorSaida = sc.nextDouble();
        if (valorSaida > valorTotal) {
            System.out.println("Saldo insuficiente");
        } else {
            valorTotal -= valorSaida;
            System.out.println("Saldo atualizado: R$" + valorTotal);
        }
    }
    public static void receberValor() {
        System.out.println("Digite o valor que deseja receber valor:");
        double valorRecebido = sc.nextDouble();
        valorTotal += valorRecebido;
        System.out.println("Saldo atualizado: R$" + valorTotal);
    }
}