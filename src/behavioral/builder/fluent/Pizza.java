package behavioral.builder.fluent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {

    private String size;           // S, M, L
    private String crust;          // thin, regular, stuffed
    private boolean extraCheese;
    private boolean glutenFree;
    private List<String> toppings;

    public Pizza(String size, String crust, boolean extraCheese, boolean glutenFree, List<String> toppings) {
        this.size = size;
        this.crust = crust;
        this.extraCheese = extraCheese;
        this.glutenFree = glutenFree;
        this.toppings = toppings;
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {

        private String size;
        private String crust;
        private boolean extraCheese;
        private boolean glutenFree;
        private final List<String> toppings = new ArrayList<>();

        public PizzaBuilder size(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder crust(String crust) {
            this.crust = crust;
            return this;
        }

        public PizzaBuilder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public PizzaBuilder glutenFree(boolean glutenFree) {
            this.glutenFree = glutenFree;
            return this;
        }

        public PizzaBuilder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            List<String> safeToppings = Collections.unmodifiableList(new ArrayList<>(this.toppings));

            return new Pizza(size, crust, extraCheese, glutenFree, safeToppings);
        }

        @Override
        public String toString() {
            return "Pizza.PizzaBuilder(size=" + size +
                    ", crust=" + crust +
                    ", extraCheese=" + extraCheese +
                    ", glutenFree=" + glutenFree +
                    ", toppings=" + toppings + ")";
        }

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", crust='" + crust + '\'' +
                ", extraCheese=" + extraCheese +
                ", glutenFree=" + glutenFree +
                ", toppings=" + toppings +
                '}';
    }

}
