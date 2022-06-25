package design.patterns.factory;

public class Cycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving Cycle!");
    }
}
