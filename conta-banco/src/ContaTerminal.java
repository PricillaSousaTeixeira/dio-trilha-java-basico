import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numeroConta;
        String nomeCliente;
        double saldo;
        String agencia;

        System.out.println("Digite o seu nome");
        nomeCliente = scan.nextLine();

        System.out.println("Digite o numero da sua conta");
        numeroConta = scan.nextInt();

        System.out.println("Digite o numero da sua agencia");
        agencia = (String)scan.next();

        System.out.println("Digite o seu saldo");
        saldo = scan.nextDouble();

   
        System.out.println("OBTEMOS OS SEGUINTES DADOS DA CONTA: ");
        System.out.println(" ");
        System.out.println("nome da Cliente: "+nomeCliente);
        System.out.println("numero da conta: "+numeroConta);
        System.out.println("numero da agencia: "+agencia);
        System.out.println("Saldo da conta "+saldo);

    }
}
