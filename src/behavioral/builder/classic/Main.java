package behavioral.builder.classic;

import behavioral.builder.classic.builders.impl.CarBuilder;
import behavioral.builder.classic.builders.impl.ManualBuilder;

import java.util.logging.Logger;

public class Main {

    private static Logger log = Logger.getLogger(Main.class.getName());

    /**
     * Client code creates a builder, passes it to the director, and starts the
     * construction process. The final result is retrieved from the builder.
     */
    public static void main(String[] args) {
        log.info("initiate director");
        Director director = new Director();

        log.info("construct car builder");
        CarBuilder carBuilder = new CarBuilder();
        log.info("construct sports car");
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getCar();
        log.info("car: " + car.toString());

        log.info("construct manual builder");
        ManualBuilder manualBuilder = new ManualBuilder();
        log.info("construct sports manual");
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getManual();
        log.info("manual: " + manual.toString());
    }

}
