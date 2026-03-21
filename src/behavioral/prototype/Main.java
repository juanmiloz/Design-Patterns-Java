package behavioral.prototype;

import java.util.logging.Logger;

public class Main {

    private static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        log.info("PROTOTYPE DESIGN PATTERN");
        log.info("create objects:");
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();

        log.info("clone objects:");
        Rectangle r2 = (Rectangle) r1.clone();
        Circle c2 = (Circle) c1.clone();

        log.info("compare objects:");
        log.info("c1 == c2: " + (c1 == c2));
        log.info("r1 == r2: " + (r1 == r2));
    }

}
