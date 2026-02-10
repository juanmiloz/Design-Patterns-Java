package behavioral.builder.classic.builders.impl;

import behavioral.builder.classic.Car;
import behavioral.builder.classic.builders.Builder;

/**
 * Concrete builders follow the builder interface and provide specific
 * implementations of the construction steps. A program may have many
 * builder variations, each implemented differently.
 */
public class CarBuilder implements Builder {

    private Car car;

    /**
     * A new builder instance should contain a blank product object
     * that will be assembled later.
     */
    public CarBuilder() {
        reset();
    }

    /** Clears the object under construction. */
    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.car.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(boolean gps) {
        this.car.setGps(gps);
    }

    /**
     * Concrete builders must provide their own methods to retrieve results.
     * Different builders can produce completely different products that do not
     * share a common interface, so this method can’t be declared in the builder
     * interface (at least not in a statically typed language).
     *
     * Typically, after returning the final result to the client, the builder
     * instance should be ready to start building another product. That’s why it’s
     * common to call reset() at the end of getProduct(). However, this behavior
     * is not mandatory: the builder can instead wait for an explicit reset call
     * from the client code before discarding the previous result.
     */
    public Car getCar() {
        Car car = this.car;
        this.reset();
        return car;
    }
}
