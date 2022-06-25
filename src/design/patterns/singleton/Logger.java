package design.patterns.singleton;

public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getLogger() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }
}
