package behavioral.singleton;

import java.util.logging.Logger;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        log.info("SINGLETON DESIGN PATTERN");

        log.info("get first instance:");
        Database db1 = Database.getInstance();
        db1.query("SELECT * FROM users");

        log.info("get second instance:");
        Database db2 = Database.getInstance();
        db2.query("SELECT * FROM products");

        log.info("db1 == db2: " + (db1 == db2));

    }

}
