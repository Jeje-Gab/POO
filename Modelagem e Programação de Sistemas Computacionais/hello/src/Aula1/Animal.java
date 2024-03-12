package Aula1;

public class Animal {
    String especie;
    private int nroMembros = 4;

    public void setNroMembros(int membros) {
        if (membros > 0) {
            nroMembros = membros;
        } else {
            nroMembros = 0;
        }
    }

    public int getNroMembros() {
        return nroMembros;
    }

}
