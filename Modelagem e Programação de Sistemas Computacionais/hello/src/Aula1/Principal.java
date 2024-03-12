package Aula1;

import Aula1.Animal;

public class Principal {
    public static void main(String[] args){
        //System.out.println("Hello W");
        Animal a = new Animal();
        a.setNroMembros(-10);
        System.out.println(a.getNroMembros());
    }
}
