package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List <Item> listRemocao = new ArrayList<>();
        if(!listaItens.isEmpty()) {
            for (Item i : listaItens) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    listRemocao.add(i);
                }
            }
            listaItens.removeAll(listRemocao);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double soma = 0;
        if(!listaItens.isEmpty()) {
            for (Item i : listaItens) {
                soma += i.getPreco();
            }
            return soma;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if(!listaItens.isEmpty()) {
            System.out.println(listaItens);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras itens = new CarrinhoDeCompras();

        itens.adicionarItem("Lápis", 2d, 3);
        itens.adicionarItem("Caderno", 35d, 1);
        itens.adicionarItem("Borracha", 2d, 2);

        itens.exibirItens();

        itens.removerItem("Lápis");

        itens.exibirItens();

        System.out.println("O valor total da compra é = " + itens.calcularValorTotal());
    }
}
