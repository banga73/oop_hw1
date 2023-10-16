package ru.geekbrains.lesson1;

public class IceCream {
    protected String name;
    protected double mass;

    public IceCream(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
    public String displayInfo(){
        return String.format("%s, %.1f", name, mass);
    }
}
