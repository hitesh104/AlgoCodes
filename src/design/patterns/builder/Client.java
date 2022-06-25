package design.patterns.builder;

public class Client {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Computer apritComputer = computerBuilder
                .monitor("dell")
                .cpu("intel i5")
                .hdd("Sata 1 TB")
                .sdd("Samsung 256GB SSD")
                .ram("16GB")
                .mouse("HP mouse")
                .build();
        System.out.println(apritComputer);

        Computer sujitComputer = new ComputerBuilder().
                monitor("dell")
                .hdd("Sata 2TB")
                .cpu("intel i9")
                .ram("32 GB")
                .build();
        System.out.println(sujitComputer);
    }
}
