package Impar_ou_par;

public class Chamada {

    public static void main(String[] args){
        Entrada e = new Entrada(); // Envia para Classe entrada
        ParImpar p = new ParImpar();

        Integer nro = e.inputInteger();
        String ret = p.setNum(nro);

        System.out.println(ret);
    }

}
