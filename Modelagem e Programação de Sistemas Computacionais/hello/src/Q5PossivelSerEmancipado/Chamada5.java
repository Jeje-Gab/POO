package Q5PossivelSerEmancipado;

import java.util.Scanner;

public class Chamada5 {
    private static Scanner s;

    public static void main(String[] args){
        s = new Scanner(System.in);
        ValIdade v = new ValIdade();

        System.out.println("\nInsira sua idade");
        int idade = s.nextInt(); // Pega valor retornanado no terminal

        v.valIdade(idade);
        System.out.println(v.getSituacao());
    }
}
