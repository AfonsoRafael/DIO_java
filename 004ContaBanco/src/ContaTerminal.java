import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta:");
        numero = sc.nextInt();

        System.out.println("Digite o número da Agência:");
        agencia = sc.next();

        sc.nextLine();//Limpa o enter para o nome não entrar vazio

        System.out.println("Digite o nome do cliente:");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo:");
        saldo = sc.nextDouble();

        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia)
                .concat(", conta ")
                .concat(String.valueOf(numero))
                .concat(" e seu saldo ")
                .concat(String.valueOf(saldo))
                .concat(" já está disponível para saque.");

        // Exibindo mensagem
        System.out.println(mensagem);

        // Fechando scanner
        sc.close();
    }
}