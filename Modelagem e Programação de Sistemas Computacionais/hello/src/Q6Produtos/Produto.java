package Q6Produtos;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private double valorTotal;
    List<Produto> produto = new ArrayList<>();


    // Atribui os valores as varivaies privates
    public void produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        valorTotal = this.preco*this.quantidade;
    }

    // Set para a troca de valores
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }


    public String toString(){
        //return preco+ " - " +quantidade;
        return "O Produto: "+nome+" tem um total de R$: "+valorTotal+" Em estoque";
    }


}
