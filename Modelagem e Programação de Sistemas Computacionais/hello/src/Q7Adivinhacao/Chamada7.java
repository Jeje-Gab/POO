package Q7Adivinhacao;

import java.util.Scanner;

public class Chamada7 {
    private static Scanner s;
    static boolean acertou = false;
    public static void main(String[] args){
        s = new Scanner(System.in);
        Randomificador r = new Randomificador();

        r.randomificador();
        System.out.println("\nDigite o Modo que deseja: ");
        System.out.println("\n1 - Modo Facil 30 tentativas");
        System.out.println("\n2 - Modo Medio 10 tentativas");
        System.out.println("\n3 - Modo Dificil 3 tentativas");
        int escolha = s.nextInt();
        int tentativas;
        int number = r.getRandom_int();

        if (escolha == 1){
            tentativas = 30;
        } else if (escolha == 2) {
            tentativas = 10;
        }else{
            tentativas = 3;
        }
        //System.out.println(number);
        for(int tentativa=1; tentativa <= tentativas; tentativa++){
            System.out.println("\nInsira um valor de 1 a 100");
            int insertValue = s.nextInt();
            if (insertValue >= 101) {
                System.out.println("\nO numero Inserido ultrapassa os limites estabelecidos! Game Over!");
                break;
            } else if (insertValue <= 0) {
                System.out.println("\nO numero Inserido antecede os limites estabelecidos! Game Over!");
                break;
            } else if (insertValue < number) {
                System.out.println("\nO numero é maior que: "+insertValue);
                if ((tentativas-tentativa) != 0){
                    System.out.println("Voce ainda possui "+(tentativas-tentativa)+" Tentativas");
                }
            }else if(insertValue > number){
                System.out.println("\nO numero é menor que: "+insertValue);
                if ((tentativas-tentativa) != 0){
                    System.out.println("Voce ainda possui "+(tentativas-tentativa)+" Tentativas");
                }
            }else if(insertValue == number){
                System.out.println("\nO numero é: "+insertValue+" Parabens!!!");
                acertou = true;
                break;
            }else {
                System.out.println("\nO tipo de entrada não é aceito!");
                break;
            }
        }
        if (!acertou) {
            System.out.println("\nAcabaram suas tentativas!");
            System.out.println("O valor corretor era: "+number);
        }
    }
}
