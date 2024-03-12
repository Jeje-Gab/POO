package Impar_ou_par;

import java.util.Scanner;

public class ParImpar {
    private int num;
    //String ret;

    public String setNum(Integer num){ /*Entrada com o valor por parametro*/
        if (num % 2 == 0){
            return "Par";
        }else{
            return "Impar";
        }
    }
}


