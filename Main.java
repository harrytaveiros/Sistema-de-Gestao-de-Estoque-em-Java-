import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite a quantidade inicial: ");
        int quantidade = sc.nextInt();
        
        Produto produto = new Produto(nome, quantidade);
    
        System.out.println("\nProduto criado com sucesso!");
        produto.exibirInfo();

        int opcao;
        do {
            System.out.println("\n=== Menu Estoque ===");
            System.out.println("1 - Adicionar estoque");
            System.out.println("2 - Remover estoque");
            System.out.println("3 - Exibir informações do produto");
            System.out.println("4 - Criar um novo produto");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
        
            switch (opcao) {
                case 1: 
                    System.out.println("Adicionar a quantidade: ");
                    int add = sc.nextInt();
                    produto.adicionarEstoque(add);
                    break;
                    
                 case 2: 
                    System.out.println("Quantidade a remover: ");
                    int rem = sc.nextInt();
                    produto.removerEstoque(rem);
                    break;
                    
                 case 3: 
                    System.out.println("Informações do produto: ");
                    produto.exibirInfo();
                    break;
                    
                 case 4:
                     sc.nextLine(); // Limpa o buffer do teclado
                     System.out.print("Digite o nome do novo produto: ");
                     String novoNome = sc.nextLine();
                     System.out.print("Digite a quantidade inicial: ");
                     int novaQtd = sc.nextInt();

                     produto = new Produto(novoNome, novaQtd); 
                     System.out.println("Novo produto criado com sucesso!");
                     produto.exibirInfo();
                     break;
                    
                 case 0: 
                     System.out.println("Saindo...");
                     break;
                    
                 default: 
                     System.out.println("Opção inválida!");
            }
            
        } while (opcao != 0);
        
        sc.close();
    }
}