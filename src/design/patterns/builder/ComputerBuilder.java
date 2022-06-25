package design.patterns.builder;

public class ComputerBuilder {
    private String monitor;
    private String hdd;
    private String sdd;
    private String cpu;
    private String ram;
    private String mouse;

    public ComputerBuilder monitor(String monitor) {
        this.monitor = monitor;
        return this;
    }

    public ComputerBuilder hdd(String hdd) {
        this.hdd = hdd;
        return this;
    }

    public ComputerBuilder sdd(String sdd) {
        this.sdd = sdd;
        return this;
    }

    public ComputerBuilder cpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder ram(String ram) {
        this.ram = ram;
        return this;
    }

    public ComputerBuilder mouse(String mouse) {
        this.mouse = mouse;
        return this;
    }

    public Computer build() {
        return new Computer(this);
    }

    public String getMonitor() {
        return monitor;
    }

    public String getHdd() {
        return hdd;
    }

    public String getSdd() {
        return sdd;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getMouse() {
        return mouse;
    }
}
