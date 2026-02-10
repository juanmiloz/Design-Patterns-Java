package behavioral.builder.classic;

import behavioral.builder.classic.builders.Builder;

/**
 * The director is only responsible for executing the building steps
 * in a particular sequence. It’s useful when products must be created
 * in a specific order or configuration. Strictly speaking, the director
 * class is optional because the client can control builders directly.
 */
public class Director {

    /**
     * The director works with any builder instance passed by the client code.
     * This way, the client can change the final product type. The director can
     * build many product variations using the same construction steps.
     */
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8");
        builder.setTripComputer(true);
        builder.setGps(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("V8");
        builder.setTripComputer(true);
        builder.setGps(false);
    }

}
