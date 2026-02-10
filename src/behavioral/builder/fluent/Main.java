package behavioral.builder.fluent;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = Pizza.builder()
                .size("L")
                .crust("thin")
                .extraCheese(true)
                .glutenFree(false)
                .addTopping("pepperoni")
                .addTopping("mushrooms")
                .build();

        System.out.println(pizza);
    }
}
