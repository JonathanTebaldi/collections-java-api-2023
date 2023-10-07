package list.operacoesbasicas;

public class Item {
    private String nome;
    private Double preco;
    private int quantidade;

    public Item(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Item: " + nome +
        ", Preco: " + preco + ", Quantidade: " + quantidade;
    }
}
