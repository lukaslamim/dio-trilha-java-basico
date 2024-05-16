import java.util.Scanner;

public class ContaTerminal {

    public ContaTerminal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, Digite o numero da sua agencia:");
        int agencia = scanner.nextInt();

        scanner = new Scanner(System.in);
        System.out.println("Por favor, Digite o numero da sua conta:");
        String conta = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("Por favor, Digite o seu nome:");
        String nome = scanner.nextLine();

        scanner = new Scanner(System.in);
        System.out.println("Por favor, Digite o saldo inicial para depositar:");
        float saldo = scanner.nextFloat();

        String mensagemFinal = "ola, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque";

        System.out.println(mensagemFinal);
    }
}
