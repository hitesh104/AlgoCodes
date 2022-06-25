package design.patterns.factory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle vehicle = null;
        String vehicleType;
        while (true) {
            System.out.print("Enter vehicle : ");
            vehicleType = scanner.next();

            if (vehicleType.equalsIgnoreCase("car")) {
                vehicle = new Car();
            } else if (vehicleType.equalsIgnoreCase("bike")) {
                vehicle = new Bike();
            } else if (vehicleType.equalsIgnoreCase("cycle")) {
                vehicle = new Cycle();
            } else if (vehicleType.equalsIgnoreCase("bus")){
                vehicle = new Bus();
            }

            vehicle.drive();
        }
    }
}
