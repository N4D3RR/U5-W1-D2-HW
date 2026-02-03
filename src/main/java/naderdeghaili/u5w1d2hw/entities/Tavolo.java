package naderdeghaili.u5w1d2hw.entities;

public class Tavolo {

    private int numero;
    private int coperti;
    private StatoTavolo stato;


    public Tavolo(int numero, int coperti) {
        this.numero = numero;
        this.coperti = coperti;
        this.stato = StatoTavolo.LIBERO;
    }

    public int getNumero() {
        return numero;
    }

    public StatoTavolo getStato() {
        return stato;
    }

    public void occupaTavolo() {
        this.stato = StatoTavolo.OCCUPATO;
    }


}
