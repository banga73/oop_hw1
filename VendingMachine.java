package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {
    private List<IceCream> iceCreams;

    public VendingMachine(List<IceCream> iceCreams) {
        this.iceCreams = iceCreams;
    }

    public Slash getSlash(String name, double mass, int price){
        for (IceCream iceCream: iceCreams) {
            if(iceCream instanceof Slash slash){
                if(slash.getPrice() == price && iceCream.getMass() == mass && slash.getName().equals(name)){
                    return slash;
                }

            }
        }
        return null;
    }
}
