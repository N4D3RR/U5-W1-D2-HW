package naderdeghaili.u5w1d2hw.config;

import naderdeghaili.u5w1d2hw.entities.Bevanda;
import naderdeghaili.u5w1d2hw.entities.Menu;
import naderdeghaili.u5w1d2hw.entities.Pizza;
import naderdeghaili.u5w1d2hw.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfig {

    @Bean
    public Topping prosciutto() {
        return new Topping("Prosciutto", 1.00, 100);
    }

    @Bean
    public Topping salsiccia() {
        return new Topping("Salsiccia", 1.50, 200);
    }

    @Bean
    public Topping gorgonzola() {
        return new Topping("Gorgonzola", 1.00, 200);
    }

    @Bean
    public Topping carciofi() {
        return new Topping("Carciofi", 2.00, 150);
    }

    @Bean
    public Topping melanzane() {
        return new Topping("Melanzane", 1.00, 50);
    }

    @Bean
    public Pizza pizzaMelanzane(Topping melanzane) {
        Pizza p3 = new Pizza("Melanzane", 10.00, 800);
        p3.addTopping(melanzane);
        return p3;
    }


    @Bean
    public Pizza pizzaProsciuttoFunghi(Topping prosciutto, Topping carciofi) {
        Pizza p1 = new Pizza("Prosciutto e Funghi", 10.00, 800);
        p1.addTopping(prosciutto);
        p1.addTopping(carciofi);
        return p1;
    }

    @Bean
    public Pizza pizzaSalsicciaGorgonzola(Topping salsiccia, Topping gorgonzola) {
        Pizza p2 = new Pizza("Salsiccia e Gorgonzola", 10.00, 800);
        p2.addTopping(salsiccia);
        p2.addTopping(gorgonzola);
        return p2;
    }

    @Bean
    public Bevanda cocaCola() {
        return new Bevanda("Coca Cola", 3.50, 300);
    }

    @Bean
    public Bevanda fanta() {
        return new Bevanda("Fanta", 3.50, 300);
    }

    @Bean
    public Menu menu(List<Pizza> p, List<Bevanda> b, List<Topping> t) {
        return new Menu(p, b, t);
    }


}
