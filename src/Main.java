

public class Main {
    public static void main(String[] args) {

        Dipendente d1 = new Dipendente(71, 1500, Dipartimento.AMMINISTRAZIONE);
        Dipendente d2 = new Dipendente(105, 1300, Dipartimento.VENDITE);
        Dipendente d3 = new Dipendente(1120, 1150, Dipartimento.PRODUZIONE);
        Dipendente[] dipendenti ={d1, d2, d3};

        for(Dipendente dipendente : dipendenti){
            System.out.println(dipendente);
        }


    }
}