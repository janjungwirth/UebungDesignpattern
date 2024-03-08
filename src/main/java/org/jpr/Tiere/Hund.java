package org.jpr.Tiere;

public class Hund extends Tier {
    @Override
    public void sound() {
        System.out.println("Wau Wau!");
    }

    public void setName(String name){
        super.setName(name);
    }
}
