import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome = "Guilherme Dantas";
        String TipoDeconta = "Corrente";
        double saldo = 1900.00;
        int opcao = 0;

        System.out.println("========================");
        System.out.println("Nome:" +nome);
        System.out.println("Tipo de conta:" +TipoDeconta);
        System.out.println("Saldo:" +saldo);
        System.out.println("========================");

        String menu = """
                ==Escolha uma opção==
                1 - Consultar saldo
                2 - Tranferir valor
                3 - Receber valor
                4 - sair
                """;

        while (opcao !=4){
            System.out.println(menu);
            opcao = scan.nextInt();

            if (opcao == 1){
                System.out.println("Seu saldo atualmente é de: "+saldo);
            } else if (opcao == 2){
                System.out.println("informe o valor da trasnfencia: ");
                double valor = scan.nextDouble();
                if (saldo < valor){
                    System.out.println("Saldo insuficiente para essa transação");
                }   else {
                    saldo -= valor;
                    System.out.println("Seu saldo agora é de: "+saldo);
                }
            } if (opcao == 3){
                System.out.println("Valor Recebido: ");
                double valorRecebido = scan.nextDouble();
                saldo += valorRecebido;
                System.out.println("Novo Saldo: "+saldo);

            } else if (opcao == 4){
                System.out.println("Saindo...");
            }
        }

    }
}
