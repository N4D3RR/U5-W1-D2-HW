package naderdeghaili.u5w1d2hw.entities;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends ElementoMenu {

    private List<Topping> toppings;


    public Pizza(String nome, double prezzo, int cal) {
        super(nome, prezzo, cal);
        this.toppings = new ArrayList<>();

    }

    public void addTopping(Topping t) {
        toppings.add(t);
    }

    @Override
    public int getCal() {
        return super.getCal() + toppings.stream().mapToInt(Topping::getCal).sum();
    }

    @Override
    public double getPrezzo() {
        return super.getPrezzo() + toppings.stream().mapToDouble(Topping::getPrezzo).sum();
    }

    @Override
    public String toString() {
        return getNome() +
                " | Prezzo: " + getPrezzo() + "€" +
                " | Calorie: " + getCal() +
                " | Toppings: " + toppings;
    }

}
