package design.patterns.factory;

public class VehicleFactory {
    public Vehicle create(String vehicleType) {
        Vehicle vehicle = null;
        if (vehicleType.equalsIgnoreCase("car")) {
            vehicle = new Car();
        } else if (vehicleType.equalsIgnoreCase("bike")) {
            vehicle = new Bike();
        } else if (vehicleType.equalsIgnoreCase("cycle")) {
            vehicle = new Cycle();
        } else if (vehicleType.equalsIgnoreCase("bus")){
            vehicle = new Bus();
        }
        return vehicle;
    }
}
