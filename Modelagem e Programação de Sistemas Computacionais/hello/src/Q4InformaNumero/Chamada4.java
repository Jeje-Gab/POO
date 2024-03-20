package Q4InformaNumero;

import Q3ClassePessoa.Pessoa;

import java.util.Scanner;

public class Chamada4 {
    private static Scanner s;

    public static void main(String[] args){
        // Instanciando Scanner renomeado acima
        s = new Scanner(System.in);
        ValorAte v = new ValorAte();

        System.out.println("\nInsira um valor: ");
        int val = s.nextInt();

        v.valorAte(val);
        v.valorImPa();
        //System.out.println(p.retPessoa());
    }
}

