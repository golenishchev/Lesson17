package com.example.lesson17;

public class Computer {
    private String processor;
    private String ram;
    private String hdd;
    private String videoCard;
    private String powerSupply;

    public Computer(String processor, String ram, String hdd, String videoCard, String powerSupply) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.videoCard = videoCard;
        this.powerSupply = powerSupply;
    }

    public Computer() {

    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        String result = "Processor: ";
        result += getProcessor();
        return result;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }
}
