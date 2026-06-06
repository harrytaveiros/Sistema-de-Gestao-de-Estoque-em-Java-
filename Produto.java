public class Produto {
    private String nome;
    private int quantidade;
    
    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println(" Quantidade inválida para adicionar. ");
        }
    }
    
    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque.");
        } else { 
            System.out.println("Não é possível remover essa quantidade do estoque (estoque insuficiente).");
        }
    }
    
    public void exibirInfo() {
        System.out.println("Produto: " + nome + " | Quantidade: " + quantidade);
    }
}