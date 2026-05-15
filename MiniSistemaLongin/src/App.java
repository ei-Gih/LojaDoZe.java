
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner ler = new Scanner(System.in);

        String[] nomes = new String[5];
        String[] senhas = new String[5];
        double[] saldos = new double[5];
        int totalUsuarios = 0;
        int usuarioLogado = -1; // ninguem logado
        int opcao = -1;// nenhuma opcao escolhida

        while (opcao != 0) {
            System.out.println("\n ====== LOJA DO ZÉ ======");
            System.out.println("\n1 - Cadastrar");
            System.out.println("\n2 - Login");
            System.out.println("\n3 - Comprar");
            System.out.println("\n0 - Sair");

            opcao = ler.nextInt();
            ler.nextLine(); // limpar o buffer

            if (opcao == 1) {
                // cadastrar
                if (totalUsuarios >= 5) {
                    System.out.println("Limite atingido");
                } else {
                    System.out.println("\nDigite Seu Nome: ");
                    String nome = ler.next();
                    System.out.println("\nDigite Sua Senha: ");
                    String senha = ler.next();
                    nomes[totalUsuarios] = nome;
                    senhas[totalUsuarios] = senha;
                    saldos[totalUsuarios] = 100.0;
                    totalUsuarios++;
                    System.out.println("\nUsuário cadastrado com sucesso!");
                }
            } else if (opcao == 2) {
                // login
                System.out.println("\nNome: ");
                String nomeLogin = ler.next();
                System.out.println("\nSenha: ");
                String senhaLogin = ler.next();

                boolean encontrado = false;
                for (int i = 0; i < totalUsuarios; i++) {
                    if (nomes[i].equals(nomeLogin) && senhas[i].equals(senhaLogin)) {
                        usuarioLogado = i;
                        encontrado = true;
                        System.out.println("\nBem-vindo, " + nomes[usuarioLogado] + "!");
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("\nUsuário ou senha incorretos");
                }
                ;// se não encontrar o usuario

            } else if (opcao == 3) {
                // comprar
                if (usuarioLogado == -1) {
                    System.out.println("\nFaça login primeiro!");
                } else {
                    System.out.println("\nCatálogo:");
                    System.out.println("1 - Camiseta (R$ 50)");
                    System.out.println("2 - Boné (R$ 30)");
                    int escolhaProduto = ler.nextInt();
                    double preco = 0.0;
                    if (escolhaProduto == 1) {
                        preco = 50.0;
                    } else if (escolhaProduto == 2) {
                        preco = 30.0;
                    } else {
                        System.out.println("\nOpção de produto inválida.");
                        continue; // volta para o menu
                    }

                    if (saldos[usuarioLogado] >= preco) {
                        saldos[usuarioLogado] -= preco;
                        System.out.println("\nCompra realizada! Saldo atualizado: R$ " + saldos[usuarioLogado]);
                    } else {
                        System.out.println("\nSaldo insuficiente");
                    }
                }
            } else if (opcao == 0) {
                System.out.println("Obrigado por visitar a Loja do Zé! Volte sempre!");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        ler.close();
    }
}