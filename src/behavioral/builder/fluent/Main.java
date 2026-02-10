package behavioral.builder.fluent;

import java.util.logging.Logger;

public class Main {

    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        log.info("FLUENT INTERFACE DESIGN PATTERN");
        Pizza pizza = Pizza.builder()
                .size("L")
                .crust("thin")
                .extraCheese(true)
                .glutenFree(false)
                .addTopping("pepperoni")
                .addTopping("mushrooms")
                .build();

        log.info(pizza.toString());
    }
}
