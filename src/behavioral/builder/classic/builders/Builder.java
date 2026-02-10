package behavioral.builder.classic.builders;

/**
 * The builder interface specifies methods for creating the different parts
 * of the product objects.
 */
public interface Builder {

    /** Resets the builder to a clean state so it can start building a new product. */
    void reset();
    void setSeats(int seats);
    void setEngine(String engine);
    void setTripComputer(boolean tripComputer);
    void setGps(boolean gps);

}
