package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operatingSystem;

    // region Constructors
    public Computer() {
    }

    public Computer(String cpu, int hdd, String operatingSystem, int ram) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
    }

    public Computer(String brand, String code, Date manufactureDate, String name, int price, String cpu, int hdd,
                    String operatingSystem, int ram) {
        super(brand, code, manufactureDate, name, price);
        this.cpu = cpu;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
    }
    // endregion

    // region Getter and Setter

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    // endregion

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", hdd=" + hdd +
                ", ram=" + ram +
                ", operatingSystem='" + operatingSystem + '\'' +
                "} " + super.toString();
    }
}
