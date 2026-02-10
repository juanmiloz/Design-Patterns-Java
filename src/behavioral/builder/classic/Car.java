package behavioral.builder.classic;

/**
 * Using the Builder pattern only makes sense when your products are fairly complex
 * and require extensive configuration. The next two products are related,
 * although they don’t share a common interface.
 */
public class Car {

    /**
     * A car can have GPS, a trip computer, and a certain number of seats.
     * Different car models (sports car, SUV, convertible) can have different
     * features installed or enabled.
     */

    int seats;
    String engine;
    boolean tripComputer;
    boolean gps;

    public Car() {
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean getGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                '}';
    }

}
