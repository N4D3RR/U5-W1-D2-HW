package naderdeghaili.u5w1d2hw;

import naderdeghaili.u5w1d2hw.entities.Menu;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5W1D2HwApplication {

    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D2HwApplication.class);
        Menu menu = ctx.getBean(Menu.class);
        menu.printMenu();
    }

}
