package Q3ClassePessoa;
import java.util.Scanner;
public class Chamada3 {

    private static Scanner s;

    public static void main(String[] args){
        // Instanciando Scanner renomeado acima
        s = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("\nInsira seu nome: ");
        String nome = s.next();
        System.out.println("\nInsira sua Idade: ");
        int idade = s.nextInt();

        p.pessoa(nome, idade);
        System.out.println(p.retPessoa());
    }
}
