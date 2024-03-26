package Q8Aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    // atributos nome, idade e nota
    private String nome;
    private int idade;
    private double nota;
    private String situacao;
    // float
    List<Aluno> aluno = new ArrayList<>();
    // Insanccia lista de aluno

    public void aluno(String nome, int idade, double nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
        if (this.nota > 10){
            this.situacao = "Valor Invalido";
        } else if (this.nota < 0) {
            this.situacao = "Valor Invalido";
        } else if (this.nota >= 7){
            this.situacao = "Aprovado";
        }else if (this.nota <= 6){
            this.situacao = "Reprovado";
        }else {
            this.situacao = "Situação inesperada";
        }
    }

    public String toString(){
        return "O aluno "+nome+" Situação: "+situacao;
    }
}
