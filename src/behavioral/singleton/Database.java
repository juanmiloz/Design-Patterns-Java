package behavioral.singleton;

public class Database {

    /**
     * Holds the single (shared) instance of this class.
     * It is static so it belongs to the class, not to any particular object.
     */
    private static Database instance;

    /**
     * Private constructor prevents direct instantiation with `new Database()`
     * from outside this class. This enforces the "only one instance" rule.
     */
    private Database() {}

    /**
     * Global access point to obtain the single instance.
     * `synchronized` makes this method thread-safe: only one thread can execute
     * it at a time, preventing multiple instances from being created concurrently.
     * @return a single instance of this class
     */
    public static synchronized Database getInstance() {
        // Lazy initialization:
        // The instance is created only the first time it is requested.
        if (instance == null) {
            instance = new Database();
        }

        // Always returns the same instance after it has been created.
        return instance;
    }

    /**
     * Example operation that clients can use through the Singleton instance.
     * In a real application, this could execute a SQL statement using a real connection.
     * @param query example query
     * @return result of the query
     */
    public String query(String query){
        return "Result of query: " + query;
    }
}
