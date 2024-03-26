package Q8Aluno;

import java.util.ArrayList;
import java.util.Scanner;

public class Chamada8 {

    private static Scanner s;
    public static void main(String[] args){
        s = new Scanner(System.in);
        ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
        System.out.println("\nEntre com os alunos");
        boolean continua = true;
        while (continua) {
            Aluno a = new Aluno();
            System.out.println("\nEntre com o nome do Aluno: ");
            String nome = s.next();
            System.out.println("\nEntre com a idade do Aluno: ");
            int idade = s.nextInt();
            System.out.println("\nEntre com a Nota do Aluno: ");
            double nota = s.nextDouble();
            a.aluno(nome, idade, nota);
            listaAluno.add(a); // Adiciona novo objeto aluno a lista
            System.out.println("\nDeseja continuar inserindo alunos? 1 - Sim 2 - Não");
            int escolha = s.nextInt();
            if (escolha == 2){
                continua = false;
            }
        }
        listaAluno.forEach(System.out::println);
    }
}
