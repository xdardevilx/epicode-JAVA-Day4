

public class Dipendente {

    private int matricola;
    private int stipendio;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, int stipendio, Dipartimento dipartimento){
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }


    public int getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }



    @Override
    public String toString() {
        return "{" +
            " matricola='" + getMatricola() + "'" +
            ", stipendio='" + getStipendio() + "'" +
            ", dipartimento='" + getDipartimento() + "'" +
            "}";
    }

}