package Impar_ou_par;

import java.util.Scanner;

public class Entrada {
    /*Entraada*/
    String ret;
    public Integer inputInteger(){
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um valor: ");
        String s = in.nextLine();
        Integer number = Integer.valueOf(s);
        return number;
    }
}
