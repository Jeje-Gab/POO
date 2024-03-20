package Q3ClassePessoa;

public class Pessoa {
    // Atributos: Nome e Idade
    private String nome;
    private int idade; // Referenciado por this


    // Atualiza as variaveis private para nome e idade que deram entrada
    public void pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Retorna nome
    public String getNome() {
        return nome;
    }

    // Retorna idade da pessoa
    public int getIdade() {
        return idade;
    }

    // Recebe um novo nome por parametro e altera o valor presente em nome para o novo recebido
    public void setNome(String nome) {
        this.nome = nome;
    }


    // Recebe um novo idade por parametro e altera o valor presente em idade para o novo recebido
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String retPessoa(){
        return "Nome da pessoa eh: "+nome+" e sua idade: "+idade;
    }

}
