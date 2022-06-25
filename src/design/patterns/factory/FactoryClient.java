package design.patterns.factory;

import java.util.Scanner;

public class FactoryClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        VehicleFactory factory = new VehicleFactory();

        while (true) {
            System.out.print("Enter vehicle : ");
            String vehicleType = scanner.next();
            Vehicle vehicle = factory.create(vehicleType);
            vehicle.drive();
        }
    }
}
