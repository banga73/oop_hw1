package ru.geekbrains.lesson1;

public class Slash extends IceCream{
    private double price;

    public Slash(String name, double mass, double price){
        super(name, mass);
        checkPrice(price);

    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void checkPrice(double price){
        if(price < 70) {
            this.price = 70;
        }else {
            this.price = price;
        }
    }

    @Override
    public String displayInfo() {
        return String.format("Take your ice-cream: %s, weight: %.1f, cost: %s", name, mass, price);
    }
}
