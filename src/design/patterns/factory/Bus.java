package design.patterns.factory;

public class Bus implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Bus!");
    }
}
