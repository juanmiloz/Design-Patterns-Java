package behavioral.builder.classic.builders.impl;

import behavioral.builder.classic.Manual;
import behavioral.builder.classic.builders.Builder;

/**
 * Unlike other creational patterns, Builder lets you construct products
 * that do not follow a common interface.
 */
public class ManualBuilder implements Builder {

    private Manual manual;

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        this.manual.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        this.manual.setTripComputer(tripComputer);
    }

    @Override
    public void setGps(boolean gps) {
        this.manual.setGps(gps);
    }

    /**
     * Returns the manual and resets the builder.
     */
    public Manual getManual() {
        Manual manual = this.manual;
        this.reset();
        return manual;
    }

}
