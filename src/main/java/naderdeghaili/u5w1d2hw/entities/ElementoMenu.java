package naderdeghaili.u5w1d2hw.entities;

public class ElementoMenu {
    private String nome;
    private double prezzo;
    private int cal;

    public ElementoMenu(String nome, double prezzo, int cal) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.cal = cal;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getCal() {
        return cal;
    }

    @Override
    public String toString() {
        return nome + " | Prezzo: " + prezzo + "€ | Calorie: " + cal + "cal";

    }
}
