package Q7Adivinhacao;

public class Randomificador {
    private int random_int;

    public void randomificador(){
        this.random_int = (int)Math.floor(Math.random() * (100 - 1 + 1) + 1);
        //System.out.println(random_int);
    }
    public int getRandom_int(){
        return random_int;
    }
}
