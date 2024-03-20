package Q4InformaNumero;

public class ValorAte {
    private int val;
    private int n = 0;
    public void valorAte(int val){
        this.val = val;
    }

    public void valorImPa(){
        while (n != val){
            n++;
            if (n % 2 == 0){
                System.out.println("o valor "+n+" é Par");
            }else{
                System.out.println("o valor "+n+" é Impar");
            }
        }
    }
}

