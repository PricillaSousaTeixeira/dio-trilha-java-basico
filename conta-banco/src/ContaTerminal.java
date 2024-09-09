import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int conta;
        String nomeCliente;
        double saldo;
        String agencia;

        System.out.println("Digite o seu nome");
        nomeCliente = scan.nextLine();

        System.out.println("Digite o numero da sua conta");
        conta = scan.nextInt();

        System.out.println("Digite o numero da sua agencia");
        agencia = (String) scan.next();

        System.out.println("Digite o seu saldo");
        saldo = scan.nextDouble();

        System.out.println(" ");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "
                + agencia + " conta :" + conta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
