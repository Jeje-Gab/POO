package Q5PossivelSerEmancipado;

public class ValIdade {
    private int idade;
    private String situacao;


    public void valIdade(int idade) {
        this.idade = idade;
    }

    // Processsa o valor da idade recebida
    public void situacaoIdade(){
        if (idade >= 18){
            situacao = "Maior de idade";
        }else if (idade >= 16){
            situacao = "Possivel ser emancipado";
        }else {
            situacao = "O menor de idade não pode ser emancipado";
        }
    }


    public String getSituacao(){
        situacaoIdade();
        return situacao;
    }




}
