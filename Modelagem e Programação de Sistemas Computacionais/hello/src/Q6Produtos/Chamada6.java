package Q6Produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class Chamada6 {
    private static Scanner s;
    private static int escolha = 1;

    public static void main(String[] args){
        s = new Scanner(System.in);
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        while (escolha == 1) {
            Produto p = new Produto();
            System.out.println("\nInsira o produto: ");
            String produto = s.next();
            System.out.println("\nInsira o preço: ");
            double preco = s.nextDouble();
            System.out.println("\nInsira a quantidade: ");
            int quantidade = s.nextInt();
            p.produto(produto, preco, quantidade);
            listaProduto.add(p);
            System.out.println("\nDeseja continuar cadastrando produtos? 1 - Sim 2 - Não");
            escolha = s.nextInt();
        }
        //System.out.println("\n"+listaProduto);
        listaProduto.forEach(System.out::println);
    }
}
