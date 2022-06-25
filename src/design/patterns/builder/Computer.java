package design.patterns.builder;

public class Computer {
    private String monitor;
    private String hdd;
    private String sdd;
    private String cpu;
    private String ram;
    private String mouse;

    public Computer(ComputerBuilder builder) {
        this.monitor = builder.getMonitor();
        this.hdd = builder.getHdd();
        this.sdd = builder.getSdd();
        this.cpu = builder.getCpu();
        this.ram = builder.getRam();
        this.mouse = builder.getMouse();
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

    @Override
    public String toString() {
        return "Computer{" +
                "monitor='" + monitor + '\'' +
                ", hdd='" + hdd + '\'' +
                ", sdd='" + sdd + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", mouse='" + mouse + '\'' +
                '}';
    }
}
