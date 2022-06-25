package design.patterns.singleton;

public class Client {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();
        Logger logger3 = Logger.getLogger();
        Logger logger4 = Logger.getLogger();
        Logger logger5 = Logger.getLogger();
        Logger logger6 = Logger.getLogger();

        System.out.println(logger1);
        System.out.println(logger2);
        System.out.println(logger3);
        System.out.println(logger4);
        System.out.println(logger5);
        System.out.println(logger6);
    }
}
